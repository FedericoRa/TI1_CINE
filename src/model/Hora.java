package model;

public class Hora {
	
	//CODIGO HORA CLASE APO En el miro 
	
	int hora;
	
	int minutos;
	
	
	public int calculadoraDuracion(int duracion) {
		
		int outTX = hora+duracion;
		return outTX;
	}
	
	public int getHora() {
		
		return hora;
	}
	
	public int getMinutos() {
		
		return minutos;
	}
	
	//CALCULADORA DE DURACION DE PELICULA
	
	public Hora(int hora, int minutos) {
		
		
		this.hora = hora;
		this.minutos = minutos;
	}
}