package model;
	
	public class Sala {
	
		//REQUESITOS FILAS Y COLUMNA
		public static int FILA_GRANDE = 6;
		
		public static int PEQUE = 1;
		
		public static int COLUMNA = 7;
		
		public static int GRANDE = 2;
		
		public static int FILA_PEQUE = 4;
		
		//TY
		private int tipo;
		private Silla[][] sillas;
		private Funtion funtion;
	

		public Sala(int tipo) {
			this.setTipo(tipo);
			inicializarSala(tipo);		
		}
		
		//INIALIZAR
		public void inicializarSala(int tipo) {
			if(tipo == PEQUE) {
				sillas = new Silla[FILA_PEQUE][COLUMNA];
			}else if(tipo == GRANDE) {
				sillas = new Silla[FILA_GRANDE][COLUMNA];
			}
		}
		
		//CICLO FOR DE DETERMINACION DE UBICACION DE SILLAS
		public boolean estaVacia(String ubicacion) {
			for(int i = 0; i < sillas.length; i++) {
				for(int j = 0; j < sillas[0].length; j++) {
					if(sillas[i][j].getUbicacion().equalsIgnoreCase(ubicacion)) {
						if(sillas[i][j].getEstaVacia() == false) {
							return true;
						}
					}
				}
			}
			
			return false;
		}
		
		//GETTERS Y SETTERS
		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public Funtion getFuntion() {
			return funtion;
		}

		public void setFuntion(Funtion funtion) {
			this.funtion = funtion;
		}
	}