package model;
public class Usuarios {
		
	private String nombreCompleto;
	private String id;	
	private Silla silla;
		
	public Usuarios(String id, String nombreCompleto) {
		this.id = id;
		this.nombreCompleto = nombreCompleto;
		silla = null;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public Silla getSilla() {
		return silla;
	}
	public void setSilla(Silla silla) {
		this.silla = silla;
	}
		
}
	
	
	
	
	
	