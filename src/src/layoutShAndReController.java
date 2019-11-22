
package src;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class layoutShAndReController implements Initializable {
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    // method ShutDown System
    @FXML
    private void shutDown(ActionEvent event){
         try {
		  Runtime.getRuntime().exec("shutdown -s -t 0"); 
                 
	} catch (IOException e) {
		error();
	}
    }
    
    // method Restart System
    @FXML
    private void restart(ActionEvent event){
         try {
		  Runtime.getRuntime().exec("shutdown -r -t 0");
                 
	} catch (IOException e) {
		error();
	}
        
    }
    
    // method if any problem
    private void error(){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setHeaderText("Error");
        alert.setContentText("Sorry there is a problem");
        alert.show();
    }
    
}
