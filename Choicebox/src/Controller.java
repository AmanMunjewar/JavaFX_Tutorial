import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller implements Initializable{
    @FXML
    ChoiceBox<String> myChoiceBox;
    @FXML
    Label myLabel;

    private String food[] = {"pizza", "burger", "fries"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::choice);
    }   

    public void choice(ActionEvent event){
        myLabel.setText(myChoiceBox.getValue());
    }
}