package hellofx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1_Controller {
    @FXML
    TextField inputBox;

    private Parent root;
    private Scene scene;
    private Stage stage;
 

    public void switch_scene(ActionEvent event) throws IOException{
        String username = inputBox.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Stage2.fxml"));
        root = loader.load();
        
        Scene2_Controller scene2_Controller = loader.getController();
        scene2_Controller.displayName(username);
        
        //root = FXMLLoader.load(getClass().getResource("stage2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}