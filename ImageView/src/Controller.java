import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    ImageView imageFrame;
    Image image = new Image(getClass().getResourceAsStream("WebAssembly.png"));

    public void frame(ActionEvent event){
        imageFrame.setImage(image);
    }
}
