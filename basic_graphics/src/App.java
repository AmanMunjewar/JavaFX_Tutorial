import javax.swing.text.TextAction;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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
        line.setOpacity(0.8);

        Text rectanglText = new Text("2) Rectangle");
        rectanglText.setX(50);
        rectanglText.setY(180);
        rectanglText.setFont(defaulFont);
        rectanglText.setFill(line_text.getFill());

        Rectangle rectangle = new Rectangle(50, 210, 300, 70);
        rectangle.setFill(Color.web("#4B56D2"));
        rectangle.setOpacity(0.8);
        rectangle.setStroke(line_text.getFill());
        rectangle.setStrokeWidth(4);

        Text polygon_text = new Text(50, 320, "3) Polygon");
        polygon_text.setFont(defaulFont);
        polygon_text.setFill(line_text.getFill());

        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(
            50.0, 330.0,
            50.0, 450.0,
            250.0, 350.0
        );
        polygon.setFill(Color.web("#4B56D2"));
        polygon.setOpacity(0.8);
        polygon.setStroke(line_text.getFill());
        polygon.setStrokeWidth(4);

        root.getChildren().addAll(text, line_text, line, rectanglText, rectangle, 
        polygon_text, polygon);

        primaryStage.setScene(scene);
        primaryStage.setHeight(800);
        primaryStage.setWidth(900);
        primaryStage.show();
    }
}
