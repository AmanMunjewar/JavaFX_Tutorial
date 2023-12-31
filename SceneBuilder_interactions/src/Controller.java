import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Circle myCircle;
    private double x,y;

    public void up(ActionEvent event){
        myCircle.setCenterY(y-=10);
    }

    public void down(ActionEvent event){
        myCircle.setCenterY(y+=10);
    }

    public void left(ActionEvent event){
        myCircle.setCenterX(x-=10);
    }

    public void right(ActionEvent event){
        myCircle.setCenterX(x+=10);
    }
}
