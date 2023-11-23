package tema09;

public class Gato extends Animal {
	
	private String raza;
	
	public Gato(String nombre, String raza) {
		super(nombre, TipoAnimal.MAMIFERO);
		this.raza = raza;
	}

	public void arana() {
		System.out.println("El gato "+nombre+" arana");
	}
	
	protected void habla() {
		System.out.println("Miau");
	}
	
	public void mueve(int distancia) {
		super.mueve(distancia);
		int energiaConsumida = (int)(distancia*1.5);
		consumirEnergia(energiaConsumida);
	}
	
	public String toString() {
		String dor = (dormido) ? "dormido" : "despierto";
		return "Gato "+nombre+" raza "+raza+", "+dor+" , con energia = "+getEnergia();
	}

	

}
