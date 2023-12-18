import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
    @FXML
    Label myLabel;
    @FXML
    RadioButton r1Button;
    @FXML
    RadioButton r2Button;
    @FXML
    RadioButton r3Button;

    public void action(ActionEvent event){
        if (r1Button.isSelected()) {
            myLabel.setText(r1Button.getText());
            myLabel.setTextFill(r1Button.getTextFill());
        } else if (r2Button.isSelected()) {
            myLabel.setText(r2Button.getText());
            myLabel.setTextFill(r2Button.getTextFill());
        } else {
            myLabel.setText(r3Button.getText());
            myLabel.setTextFill(r3Button.getTextFill());
        }
    }
}
