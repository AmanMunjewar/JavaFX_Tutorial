import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
    @FXML
    Label nameOutput;

    public void changeName(String userName){
        nameOutput.setText("Hello "+userName+" !");
    }
}
