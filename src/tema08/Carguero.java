package tema08;

public class Carguero extends NaveEspacial{
	
	final static int ERNERGIA_MAX = 1000000; 
	final static int MASA = 500000; 
	final static int CARGA_MAX  = 750000;
	
	private int carga;
	
	
	
	public Carguero(String nombre) {
		super(nombre, 0, 0, new int[2], 0, Carguero.MASA, 0);
		this.numeroSerie = "CA"+super.getNumSerie();
		
	}
	
	public Carguero(String nombre, int energia, int carga) {
		this(nombre);
		this.energia = (energia>Carguero.ERNERGIA_MAX) ? Carguero.ERNERGIA_MAX : energia;
		this.carga = (carga>Carguero.CARGA_MAX) ?  Carguero.CARGA_MAX : carga;
	}

	public void cargar(int carga) {
    var cargVirtual = this.carga + carga;
		this.carga = (cargVirtual>Carguero.CARGA_MAX) ? cargVirtual - Math.abs(cargVirtual-Carguero.CARGA_MAX) : cargVirtual;
	}
	
	public void descargar(int cantidad) {
		carga = (carga<cantidad) ? 0 : carga - cantidad;
	}
	
	public int getCarga() {
		return carga;
	}
	
	public int getMasaTotal() {

		return getMasa()+carga;
	}
	
	public void repostar(int cantidad) {
		int temp = cantidad + energia;
		energia = (temp>Carguero.ERNERGIA_MAX) ? Carguero.ERNERGIA_MAX : temp;
	}

  public int setPropulsion(int cantidad) {
		int propAnterior = getPropulsion();
		int propulsion = super.setPropulsion(cantidad);
    // nuevaEnergia = energia - (| nuevaPropulsion - propulsion | + masaTotal/1000 )
    var energy = getEnergia();
    var mass = getMasaTotal();
		energia = energy - (Math.abs(propulsion - propAnterior) + mass/1000);
		return propulsion;
	}
	
	public int setEscudos(int cantidad) {
		int nuevosEscudos = (cantidad<=20) ? cantidad : cantidad-Math.abs(20-cantidad);
//		energia - nuevaEnergia = energia - (| escudoAntes - escudos | * 1)
		this.energia = this.energia - Math.abs(getEscudos() - nuevosEscudos);
		return super.setEscudos(nuevosEscudos);
	}
	

	
//	public String getNumSerie() {
//		return numeroSerie;
//	}
	

  
}
