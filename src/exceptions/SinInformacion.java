package exceptions;
	
public class SinInformacion extends Exception {
	//METODO DE EXCEPCION EN CASO DE QUE NO SE HALLE LA INFO
	public SinInformacion() {
		super("No hay informacion");
	}
}
