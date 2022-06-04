module com.opt3.opt3casus {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.opt3.opt3casus to javafx.fxml;
    exports com.opt3.opt3casus;
    exports com.opt3.opt3casus.controllers;
    opens com.opt3.opt3casus.controllers to javafx.fxml;
    exports com.opt3.opt3casus.objecten;
    opens com.opt3.opt3casus.objecten to javafx.fxml;
}