package control;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main.Main;

public class RegisterUserControll implements Initializable {
	
	 @FXML
	    private Button BTT_REGITRAR_USER;

	    @FXML
	    private TextField TF_REGISTER;

	    @FXML
	    void ingresarLobby(ActionEvent event) throws IOException{
	    	checkLogin();

	    }
	    
	    private void checkLogin() throws IOException{
	    	Main m = new Main();
	    	
	    	if(TF_REGISTER.getText().equals("246") ) {
	    		
	    		m.changeScene("LOBBY.fxml");
	    		
	    	}
	    	
	    	else if(TF_REGISTER.getText().isEmpty()) {
	    		System.out.println("datos erroneos");
	    	}
	    }

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
			
		}

}
