package tema09;

import java.util.Random;
import java.util.logging.Logger;

public class Animal implements Cloneable{
	
	private final static Logger LOGGER = Logger.getLogger(Animal.class.getName());

	String nombre;
	final TipoAnimal tipo;
	private int energia = 100;
	protected boolean dormido;

	public Animal(String nombre, TipoAnimal tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.dormido = false;
	}

	protected void habla() {
		System.out.println("Animal hace ruido");
	}

	public int comer(int calorias) {
		return energia = +calorias;
	}

	void consumirEnergia(int cantidad) {
		energia -= cantidad;
		if (energia < 0)
			System.out.println("El animal " + nombre + " ha muerto");

	}

	int getEnergia() {
		return energia;
	}

	public static boolean compatibles(Animal animal1, Animal animal2) {
		Random random = new Random(); // Genera un booleano al hazar
		return random.nextBoolean();
	}

	public void duerme() {
		dormido = true;
		System.out.println("El animal " + nombre + " duerme");
	}

	public void mueve(int distancia) {
		dormido = false;
		System.out.println("El animal " + nombre + " se mueve " + distancia + "m");
	}

	public String toString() {
		String dor = (dormido) ? "dormido" : "despierto";
		return "Animal " + nombre + " " + dor + " con energia = " + energia;
	}

	public boolean equals(Object obj) {

		boolean resultado = false;

		if (obj instanceof Animal) {
			Animal animal = (Animal) obj;
			resultado = (animal.nombre == this.nombre && animal.tipo == this.tipo);
		}
		return resultado;
	}

	@Override
	protected Animal clone() {
		Animal clon = null;
		try {
			clon = (Animal) super.clone();

		} catch (CloneNotSupportedException e) {
			LOGGER.warning(e.getMessage());
		}

		return clon;
	};

}
