package tema08;

public class NaveComercial extends NaveEspacial {
	
//	private String numeroSerie;
	
	public NaveComercial() {
		super("", 0, 0, new int[2], 0, 0, 0);
		this.numeroSerie = "COM"+super.getNumSerie();
	}
	
  
}