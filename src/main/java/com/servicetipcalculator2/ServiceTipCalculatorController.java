package com.servicetipcalculator2;

import com.servicetipcalculator2.models.CountryModel;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Callable;

public class ServiceTipCalculatorController implements Initializable {

    //region FXML CONNECTORS
    @FXML
    public ComboBox<String> cmb_Countries;
    @FXML
    private TextField txt_BillAmount;
    @FXML
    private Slider sld_ServicePercentage;
    @FXML
    private TextField txt_ServiceAmount;
    @FXML
    private TextField txt_TotalAmount;

    public Label getLbl_Currency() {
        return lbl_Currency;
    }

    public void setLbl_Currency(Label lbl_Currency) {
        this.lbl_Currency = lbl_Currency;
    }

    @FXML
    private Label lbl_Currency;
    //endregion

    public ObservableList<CountryModel> get_countries() {
        return _countries;
    }

    public void set_countries(ObservableList<CountryModel> _countries) {
        this._countries = _countries;
    }

    //region PRIVATE VARIABLES
    private ObservableList<CountryModel> _countries = FXCollections.observableArrayList();


    //endregion

    //region CONSTRUCTOR
    //public ServiceTipCalculatorController() {
    //    CreateCountries();
    //    ComboBox cmb_Countries = new ComboBox<>();
    //    for (CountryModel country : _countries) {
    //        cmb_Countries.getItems().add(country.GetCountryName());
    //    }
    //}
    //endregion

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CreateCountries();

        for (CountryModel country : _countries) {
            cmb_Countries.getItems().add(country.GetCountryName());
        }

    }
    //
    public void cmb_Country_Changed(ActionEvent event){

        int selectedIndex = cmb_Countries.getSelectionModel().getSelectedIndex();
        CountryModel selectedCountry = new CountryModel();
        selectedCountry = _countries.get(selectedIndex);
        lbl_Currency.setText(selectedCountry.GetCurrency());

        sld_ServicePercentage.setMin(selectedCountry.GetMinimumService());
        sld_ServicePercentage.setMax(selectedCountry.GetMaximumService());
        //
    }

    public void Calculate(ActionEvent event){
       double _billAmount = Double.parseDouble(txt_BillAmount.getText());
       double _percentage = Double.parseDouble(String.valueOf(sld_ServicePercentage.getValue()));
       double _serviceAmount = _billAmount*_percentage/100;
       double _totalAmount = _billAmount + _serviceAmount;

       txt_ServiceAmount.setText(String.valueOf(_serviceAmount));
       txt_TotalAmount.setText(String.valueOf(_totalAmount));
        }

    //region PUBLIC METHODS
    //endregion

    //region PRIVATE METHODS
    private void CreateCountries() {
        _countries.add(0, new CountryModel("USA", 10, 20, "USD"));
        _countries.add(1, new CountryModel("Belgium", 0, 15, "EUR"));
        _countries.add(2, new CountryModel("Sweden", 10, 30, "SKR"));
        _countries.add(3, new CountryModel("Sri Lanka", 10, 20, "LKR"));
    };

    private Parent root;
    public void EditCountries(ActionEvent event) throws IOException
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CountryView.fxml"));
        root = loader.load();

        CountryController controller = loader.getController();
        controller.SetCountries(_countries);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        Scene scene = new Scene(root);
        stage.setTitle("Edit Countries");
        stage.setScene(scene);
        stage.show();

    }


    //endregion


}