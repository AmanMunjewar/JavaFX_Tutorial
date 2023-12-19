import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    Label myLabel;
    @FXML
    DatePicker myDatePicker;

    public void pickDate(ActionEvent event){
        LocalDate localDate = myDatePicker.getValue();

        myLabel.setText(localDate.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
    }
}
