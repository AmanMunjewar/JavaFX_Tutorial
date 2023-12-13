import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);

        Text text = new Text();
        text.setText("Hello there");
        text.setX(50);
        text.setY(50);

        root.getChildren().addAll(text);

        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(900);
        primaryStage.show();
    }
}
