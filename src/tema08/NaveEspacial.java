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
	protected int energia;
	protected String numeroSerie;

	
	public NaveEspacial(String nombre) {
		this(nombre, 0, 0, new int[2], 0, 0, 0);
	}
	
	public NaveEspacial(String nombre, 
			int potenciaEscudos, 
			int potenciaMotores, 
			int[] posicion, 
			int velocidad,
			int masa, 
			int energia) {
		super();
		this.nombre = nombre;
		this.potenciaEscudos = potenciaEscudos;
		this.potenciaMotores = potenciaMotores;
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.masa = masa;
		this.energia = energia;
		this.numeroSerie = Integer.toString(NaveComercial.contadorNaves);
		NaveComercial.contadorNaves++;
		
	}

	static void reiniciarContador(){
		contadorNaves = 0;
	}
	
//	"Setters"
	
	
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



//	********************************************
	
	public int getEnergia() {
		return this.energia;
	}
	
	public void repostar(int cantidad) {
		energia += cantidad;
	}
	
	protected int consumirEnergia(int cantidad) {
		energia = (cantidad>energia) ? 0 : energia - cantidad;
		return energia;
	}
	
	
//	***********************************************
	
	public String getNumSerie() {
		return numeroSerie;
	}
	
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}



//	public void setMasa(int masa) {
//		this.masa = masa;
//	}
	



}
