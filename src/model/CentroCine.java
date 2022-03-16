package model;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;	
import java.io.File;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import java.io.FileInputStream;	
import java.util.ArrayList;
import com.google.gson.Gson;

public class CentroCine {
	private Sala sala;	
	private Sala mini_Sala;
	public static ObservableList<Funtion> funtions = FXCollections.observableArrayList();
	
	
	public static ObservableList<Funtion> getFunctions() {
		return funtions;
	}
	

	public static void setFuntions(ObservableList<Funtion> funtions) {
		CentroCine.funtions = funtions;
	}
	

	public CentroCine(Sala miniSala, Sala sala) {
		this.mini_Sala = mini_Sala;
		this.sala = sala;
	}
		
	public CentroCine() {
			
	}
		
		public static void agregarFuncion(String nombre, String sala,int horaReal,int minutosHora,int horaDuracion, String dia,String mes) {
			Funtion f = new Funtion(nombre, sala, horaReal, minutosHora, horaDuracion, horaDuracion, dia, mes);
			boolean acceso = true;
			for (Funtion fun : funtions) {
				if(f.getNombre().equalsIgnoreCase(fun.getNombre())) {
					acceso = false;
					Alert alert = new Alert(Alert.AlertType.ERROR);
				    alert.setHeaderText(null);
				    alert.setTitle("YA SE HA CREADO ANTES LA FUNCION");
				    alert.setContentText("YA SE HA CREADO ANTES LA FUNCION");
				    alert.showAndWait();
				}else {
					
					if(fun.getDate().getTime()==f.getDate().getTime()&&fun.getSala().equals(f.getSala())&&(fun.getHora().getHora()<=f.getHora().getHora()||
							fun.getHora().calculadoraDuracion(fun.getDuracion().getHora())>=f.getHora().calculadoraDuracion(f.getDuracion().getHora()))) {
						//ACCESO BOOLEAN PARA EL INGRESO DE USUARIO
						acceso = false;
						//IMPORT ALERT PARA SALIR EN CASO DE ERROR
						Alert alert = new Alert(Alert.AlertType.ERROR);
					    alert.setHeaderText(null);
					    alert.setTitle("ERROR");
					    alert.setContentText("OTRA FUNCION ESTA A LA MISMA HORA");
					    alert.showAndWait();
					}
					
				}
				
			}
			
			if(acceso) {
				
				funtions.add(f);
			}
			
		}
		//METODO PA GUARDAR EL JSON
		public void saveJSON() {
			
			Gson gson = new Gson();
			String json = gson.toJson(funtions);
			File file = new File("data/dataFun.json");
			
			try {
				
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(json.getBytes());
				fos.close();
				
			} catch (FileNotFoundException e) {
				
				// TODO Auto-generated catch block by guerreroSoloCali
				e.printStackTrace();
				
			} catch (IOException e) {
				
				// TODO Auto-generated catch block by guerreroSoloCali
				e.printStackTrace();
			}
			}
		
		public  void loadJSON() {
			
			FileInputStream is;
			try {
				is = new FileInputStream(new File("data/dataFun.json"));
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				
				String json = "";
				String line;
				while((line = reader.readLine()) !=null) {
					json += line;
				}
				
				Gson gson = new Gson();
				Funtion[] data = gson.fromJson(json, Funtion[].class);
				for(Funtion d : data)
				funtions.add(d);
				
			} catch (IOException e) {
				
				// TODO Auto-generated by guerreroSoloCali
				e.printStackTrace();
			}
			
		}
		public Sala getMini_Sala() {
			
			return mini_Sala;
		}
	

		public void setMiniSala(Sala mini_Sala) {
			
			this.mini_Sala = mini_Sala;
		}
	

		public Sala getSala() {
			
			return sala;
		}
	

		public void setSala(Sala sala) {
			
			this.sala = sala;
		}
	
	
}

