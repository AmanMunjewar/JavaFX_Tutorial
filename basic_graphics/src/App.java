import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.web("#F1F6F5"));

        Font defaulFont = Font.font("Lucida Console", 30);

        Text text = new Text();
        text.setText("Hello there");
        text.setX(50);
        text.setY(50);
        text.setFont(defaulFont);
        text.setFill(Color.web("#82C3EC"));

        Text line_text = new Text("1) Line");
        line_text.setX(50);
        line_text.setY(90);
        line_text.setFont(defaulFont);
        line_text.setFill(Color.web("82C3EC"));

        Line line = new Line();
        line.setStartX(50);
        line.setStartY(110);
        line.setEndX(600);
        line.setEndY(150);
        line.setStrokeWidth(3);
        line.setStroke(Color.web("#4B56D2"));
        line.setOpacity(0.2);

        

        root.getChildren().addAll(text, line_text, line);

        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(900);
        primaryStage.show();
    }
}
