import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SpaceGame extends Application
{
    private Player player = Player.getInstance();
    private GameWindow window = GameWindow.getWindow();
    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Space Fighter J");
        GridPane gridWindow = new GridPane();
    }
}
