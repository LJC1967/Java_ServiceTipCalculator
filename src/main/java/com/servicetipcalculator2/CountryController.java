package com.servicetipcalculator2;

import com.servicetipcalculator2.models.CountryModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class CountryController implements Initializable {

    //region FXML Connectors
    @FXML
    public ListView<String> lsv_Countries;
    @FXML
    private TextField txt_Name;
    @FXML
    private TextField txt_minServicePercentage;
    @FXML
    private TextField txt_maxServicePercentage;
    @FXML
    private TextField txt_Currency;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // private ObservableList<CountryModel> _countries = FXCollections.observableArrayList();
    }
}