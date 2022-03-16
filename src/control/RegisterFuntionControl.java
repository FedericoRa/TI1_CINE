package control;

import java.io.IOException;

import exceptions.SinInformacion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import model.CentroCine;
public class RegisterFuntionControl {

	

	    @FXML
	    private TextField MinutosTF;

	    @FXML
	    private TextField diaTF;

	    @FXML
	    private TextField horaDuracionTF;

	    @FXML
	    private TextField horaRealTF;

	    @FXML
	    private TextField mesTF;

	    @FXML
	    private TextField minutosHoraTF;

	    @FXML
	    private TextField nombreTF;

	    @FXML
	    private Button registrarBTN;

	    @FXML
	    private TextField salaTF;

	    @FXML
	    void registerFuntion(ActionEvent event) {

	    }
		    
		private CentroCine centroCine;
		    
		
		@FXML
		void registerFunction(ActionEvent event) throws IOException {
			
			centroCine = new CentroCine();
			
			try{
				
				TextField[] nulls = {nombreTF,diaTF,horaRealTF,horaDuracionTF,salaTF,mesTF,minutosHoraTF};
		    	for (int i=0;i<nulls.length;i++) {
					if(nulls[i].getText().equals("")) {
						throw new SinInformacion();
					}
				}
		    	
		    	
		    	int horaInicio = Integer.parseInt(horaRealTF.getText());
		   		int minutosHora = Integer.parseInt(minutosHoraTF.getText());
		   		int horaDuracion = Integer.parseInt(horaDuracionTF.getText());
		  
		   		
		   		centroCine.agregarFuncion(nombreTF.getText(),salaTF.getText(),horaInicio,minutosHora,horaDuracion,diaTF.getText(),mesTF.getText());
		   		
		   		centroCine.saveJSON();
		   		
		   		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/Main.fxml"));
		   		loader.setController(new RegisterFuntionControl());
		   		Parent parent = (Parent) loader.load();
		   		Scene scene = new Scene(parent);
	    		Stage stage = new Stage();
		    	stage.setScene(scene);
		   		stage.show();
		   		close();
		   		
		    }catch(SinInformacion ex) {
		    	
		   		Alert alert = new Alert(Alert.AlertType.WARNING);
			    alert.setHeaderText(null);
			    alert.setTitle("Error");
			    alert.setContentText("Rellene los espacios");	
			    alert.showAndWait();
		    	}
			
		    }
		    
		

		private static Scene getScene() {
			
			// TODO Auto-generated method stub by guerreroSoloCali
			return null;
		}
		
		public void close() {
			
			Stage stage = (Stage) RegisterFuntionControl.getScene().getWindow();
			stage.close();
		}

	}




