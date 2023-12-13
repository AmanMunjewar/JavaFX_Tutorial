import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button day_night;
    private boolean swap=true;

    public void change_color(ActionEvent event) throws IOException{
        if (swap) {
            swap=false;
            day_night.setText("Night");

            Scene scene = ((Node)event.getSource()).getScene();
            String css = this.getClass().getResource("day_mode.css").toExternalForm();
            scene.getStylesheets().get(1);

            
        } else {
            swap=true;
            day_night.setText("Day");
            
            Scene scene = ((Node)event.getSource()).getScene();
            String css = this.getClass().getResource("night_mode.css").toExternalForm();
            scene.getStylesheets().get(0);
        }
    }
    
}
