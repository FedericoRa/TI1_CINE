package main;

import java.io.IOException;

import control.LOBBYControll;
import control.RegisterUserControll;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Passwords;

public class Main extends Application {

	public static void main(String[] args) {
		Launch();

	}
	
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		Passwords c1 = new Passwords("246");
		
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/RegisterUser.fxml"));		
		loader.setController(new RegisterUserControll());
		Parent parent = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.show();
	
		changeScene();
		
	}
	
	public static void changeScene() throws Exception{
		//cargador del fxml
    	FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/LOBBY.fxml"));
    	
    	//contenido en el loader
		loader.setController(new LOBBYControll());
		
		Parent parent = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.show();
		
	}

}
