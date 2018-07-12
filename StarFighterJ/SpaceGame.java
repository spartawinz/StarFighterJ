package StarFighterJ;

import com.sun.prism.paint.Color;

import Res.Player;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SpaceGame extends Application
{
    private Player player = Player.getInstance();
    
    public static void main(String[] args)
    {
    	launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Space Fighter J");
        
        GridPane mainWindow = new GridPane();
        GridPane leftWindow = new GridPane();
        GridPane rightWindow = new GridPane();
        
        rightWindow.setMaxSize(400, 720);
        
        leftWindow.setMaxSize(880, 720);
        
        mainWindow.getChildren().add(leftWindow);
        mainWindow.getChildren().add(rightWindow);
        
        Scene scene = new Scene(mainWindow,1280,720);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
