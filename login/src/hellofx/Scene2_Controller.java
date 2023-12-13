package hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2_Controller {
    @FXML
    Label nameLabel;

    public void displayName(String name){
        nameLabel.setText("Hello " + name);
    }
}
