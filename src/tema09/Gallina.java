package tema09;

public class Gallina extends Animal{
	
	private String colorPlumas;
	
	public Gallina(String nombre, String colorPlumas) {
		super(nombre, TipoAnimal.AVE);
		this.colorPlumas = colorPlumas;
	}

	public void vuela() {
		System.out.println("Gallina "+nombre+" vuela");
	}
	
	protected void habla() {
		System.out.println("Cocoroco");
	}
	
	public void mueve(int distancia) {
		super.mueve(distancia);
		int energiaConsumida = (int)(distancia*0.9);
		consumirEnergia(energiaConsumida);
	}
	
	public String toString() {
		String dor = (dormido) ? "dormido" : "despierto";
		return "Gallina "+nombre+" con plumas "+colorPlumas+", "+dor+" , con energia = "+getEnergia();
	}

}
