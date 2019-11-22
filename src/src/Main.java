
package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layoutShAndRe.fxml"));
        
        Scene scene = new Scene(root);
        
        
        stage.setTitle("ShutDown OR Restart System");
        stage.getIcons().add(new Image("/Image/icon.png"));
        stage.setMaxHeight(150);
        stage.setMinHeight(150);
        stage.setMaxWidth(400);
        stage.setMinWidth(400);
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
