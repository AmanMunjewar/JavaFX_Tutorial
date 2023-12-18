import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    CheckBox myCheckBox;
    @FXML
    Label myLabel;
    @FXML
    ImageView myImageView;

    public void action(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            myLabel.setText("Light is on");
            myImageView.setImage(new Image("ON.png"));
        } else {
            myLabel.setText("Light is off");
            myImageView.setImage(new Image("OFF.png"));
        }
    }
}
