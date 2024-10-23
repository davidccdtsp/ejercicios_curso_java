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
	
	// Override no es obligatorio
	@Override
	protected void habla() {
		System.out.println("Miau");
	}
	
	@Override
	public void mueve(int distancia) {
		super.mueve(distancia);
		int energiaConsumida = (int)(distancia*1.5);
		consumirEnergia(energiaConsumida);
	}
	
	@Override
	public String toString() {
		String dor = (dormido) ? "dormido" : "despierto";
		return "Gato "+nombre+" raza "+raza+", "+dor+" , con energia = "+getEnergia();
	}

	

}
