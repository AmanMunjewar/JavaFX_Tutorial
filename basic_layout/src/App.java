import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.WHEAT);

        Image image = new Image("JavaScript-logo.png");
        primaryStage.getIcons().add(image);
        primaryStage.setHeight(400);
        primaryStage.setWidth(500);
        primaryStage.setX(40);
        primaryStage.setY(40);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Press q to exit.");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
