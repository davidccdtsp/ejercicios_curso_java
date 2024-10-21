package tema08;

public class NaveEspacial {
	
	static int contadorNaves = 0;
	
// Solucion aqui
	private String nombre;
	private int potenciaEscudos;
	private int potenciaMotores;
	private int[] posicion = { 0, 0 };
	private int velocidad;
	private int masa;

	public NaveEspacial(String nombre) {
		this.nombre = nombre;
	}

	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}
	
//	activarEscudos
	public int setEscudos(int potenciaEscudos) {
		int temp = potenciaEscudos + potenciaMotores;
		if (temp > 100) {
			this.potenciaEscudos = potenciaEscudos - Math.abs(100 - temp);
		} else {
			this.potenciaEscudos = potenciaEscudos;
		}
		
		return this.potenciaEscudos;
	}
	
//	Propulsar
	public int setPropulsion(int potenciaMotores) {

		int temp = potenciaEscudos + potenciaMotores;
		if (temp > 100) {
			this.potenciaMotores = potenciaMotores - Math.abs(100 - temp);
		} else {
			this.potenciaMotores = potenciaMotores;
		}

		return this.potenciaMotores;
	}
	
//	Getters
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVelocidad() {
		return velocidad;
	}


	public int[] getPosicion() {
		return posicion;
	}



	public int getEscudos() {
		return potenciaEscudos;
	}



	public int getPropulsion() {
		return potenciaMotores;
	}


	public int getMasa() {
		return masa;
	}


}
