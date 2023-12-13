import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        Scene scene = new Scene(root, 600, 500);
        String css = this.getClass().getResource("night_mode.css").toExternalForm();
        String css2 = this.getClass().getResource("day_mode.css").toExternalForm();
        scene.getStylesheets().addAll(css, css2);

        primaryStage.setTitle("CSS styling");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
