package model;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
	

public class Funtion {
	//VARIABLES A USAR
	private String nombre;
	private  String sala;
	private Hora hora;
	private Hora duracion;
    private Date date;
    
	public static ArrayList<Usuarios> usuario = new ArrayList<>();
	   
	    
	public Funtion(String nombre, String sala,int horaReal,int Minutos,int horaDuracion,int minutosHora,String dia,String mes){
			
		
			this.sala = sala;
	    	this.nombre = nombre;
	    	
	    	
	    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    	//CODIGO PA LA FECHA
	    	try {
	    		
				this.date = sdf.parse(dia + " - "+mes+" -2022 ");
				
			} catch (ParseException e) {
				
				// TODO Auto-generated catch block by guerreroSoloCali
				e.printStackTrace();
			}
	    	
	    	this.hora = new Hora(horaReal, Minutos);
	    	this.duracion = new Hora(horaDuracion,minutosHora);
	    }
	    
	    //METODO PARA AGREGAR UN USUARIO
	    public boolean agregarUsuario(String id, String nombreCompleto) {
	    	
	    	
	    	Usuarios p = new Usuarios(id, nombreCompleto);
	    	boolean acceso = true;
	    	if(!id.equals("") || !nombreCompleto.equals("")) {
	    		
	    		
				for (int i = 0; i < usuario.size();i++) {
					
					
					if(usuario.get(i).getId().equalsIgnoreCase(p.getId())) {
						
						
						acceso = false;
						Alert alert = new Alert(Alert.AlertType.ERROR);
					    alert.setHeaderText(null);				    
					    alert.setTitle("Error el usuario ya existe");
					    alert.setContentText("Error el usuario ya existe");
					    alert.showAndWait();
					    
					}else {
						
						usuario.add(p);
						
						}
					}
				
	    	}else {
	    		
	    			acceso = false;
					Alert alert = new Alert(Alert.AlertType.WARNING);
				    alert.setHeaderText(null);
				    alert.setTitle("Rellene todos los espacios");
				    alert.setContentText("Rellene todos los espacios ");
				    alert.showAndWait();
				}
	    	
	    	return acceso;
	    }
	   //GETTERS Y SETTERS 
	    public String getSala() {
	    	return sala;
	    }
	    
	    public void setSala(String room) {
	    	this.sala = sala;
	    }
	    public void setNombre(String nombre) {
	    	this.nombre = nombre;
	    }
	    public void setDate(Date date) {
	    	this.date = date;
	    }	
	    public void setHora(Hora hora) {
	    	this.hora = hora;
	    }	
	    public void setDuracion(Hora duracion) {
	    	this.duracion = duracion;
	    }
	    
	    public String getNombre() {
	    	return nombre;
	    }	
	    public String getsala() {
	    	return sala;
	    }
	    public Date getDate() {
	    	return date;
	    } 
	    public Hora getHora() {
	    	return hora;
	    }   
	    public Hora getDuracion() {
	    	return duracion;
	    }
	    public void add(Funtion[] funtions) {
	    	// TODO Auto-generated method stub by guerreroSoloCali
	    }

}
