import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class Controller implements Initializable{
    @FXML
    ChoiceBox<String> myChoiceBox;

    private String food[] = {"pizza", "burger", "fries"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(food);
    }    
}