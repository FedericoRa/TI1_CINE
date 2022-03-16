package model;
public class Silla {
	private String ubicacion;
	private boolean estaVacia;
	public Silla(String ubicacion, boolean estaVacia) {
		this.ubicacion = ubicacion;
		this.estaVacia = estaVacia;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbication(String ubication) {
		this.ubicacion = ubication;
	}
	public boolean getEstaVacia() {
		return estaVacia;
	}
	public void setEstaVacia(boolean estaVacia) {
		this.estaVacia = estaVacia;
	}
}