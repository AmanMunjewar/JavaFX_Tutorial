import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setOnCloseRequest(event-> {
            event.consume();
            logout(primaryStage);
        });

        primaryStage.setTitle("Logout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void logout(Stage stage){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Do you want to logout?");
        alert.setContentText("All unsaved progress will be deleted");
        

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();    
        }  
    }
}
