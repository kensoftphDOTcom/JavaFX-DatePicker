package com.kensoftph.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerController{
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label selectedDate;

    @FXML
    void datePicker(ActionEvent evt){
        LocalDate localDate = datePicker.getValue();
        String pattern = "MMMM dd, yyyy";
        String datePattern = localDate.format(DateTimeFormatter.ofPattern(pattern));
        selectedDate.setText("Selected Date: "+datePattern);
    }
}