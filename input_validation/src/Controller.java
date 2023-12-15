import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Label outputLabel;
    @FXML
    TextField ageTextField;
    @FXML
    Button submitButton;

    public void checkAge(ActionEvent event){
        try {
            int userAge = Integer.parseInt(ageTextField.getText());
            if (userAge>=18) {
                outputLabel.setText("You are logged in");
            } else {
                outputLabel.setText("You have to be 18+");
            }
        }
        catch (NumberFormatException e){
            outputLabel.setText("Please enter a valid input");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
