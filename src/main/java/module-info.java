module com.kensoftph.datepicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.datepicker to javafx.fxml;
    exports com.kensoftph.datepicker;
}