import java.awt.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//Renders the window of the game
public class GameWindow
{
    private static final long serialVersionUID = 21234123L;

    private static GameWindow window;
    private Player player = Player.getInstance();
    // window size
    private static int WINDOW_WIDTH = 128;
    private static int WINDOW_HEIGHT = 256;


    private GameWindow()
    {

        while(player.getLives() > 0)
        {

        }
    }
    private static void generatePanel()
    {
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    }

    public static GameWindow getWindow()
    {
        if(window == null)
        {
            window = new GameWindow();
        }
        return window;
    }

}
