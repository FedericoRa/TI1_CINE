package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main.Main;
import model.PasswordsData;

public class RegisterUserControll implements Initializable {
	
	 @FXML
	    private Button BTT_REGITRAR_USER;

	    @FXML
	    private TextField TF_REGISTER;

	    @FXML
	    void ingresarLobby(ActionEvent event) {
	    	System.out.println("Submit");
	    	
	    	String pass = TF_REGISTER.getText();
	    	PasswordsData.passwords.add(pass);

	    }
	    
	    

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
			
		}

}
