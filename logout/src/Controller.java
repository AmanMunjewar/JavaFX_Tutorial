import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    @FXML
    AnchorPane scenePane;

    Stage stage;

    public void logout(ActionEvent event){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Do you want to logout?");
        alert.setContentText("All unsaved progress will be deleted");
        

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage)scenePane.getScene().getWindow();
            stage.close();    
        }  
    }
}
