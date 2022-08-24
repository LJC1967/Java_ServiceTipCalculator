module com.servicetipcalculator2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.servicetipcalculator2 to javafx.fxml;
    exports com.servicetipcalculator2;
}