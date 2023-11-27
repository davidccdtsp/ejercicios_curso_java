package tema11;

//import tema11.Solucion.SolEstatica;

public class ClasesAnidadas {

	/*
	 * Crear la clase interna Sol dentro de la clase Solucion
	 */
	public static void ejercicio01() {
		System.out.println("\n\nEjercicios Tema 11: Clases anidadas");
		System.out.println("\nEjercicio 1");

		Solucion instanciaSolucion = new Solucion();
		Solucion.Sol sol = instanciaSolucion.new Sol();

		System.out.println("Creada clase interna " + sol.getClass());

	}

	/*
	 * Crear un los metodos String getTexto() y int getValor() en la clase Sol1
	 */
	public static void ejercicio02() {
		System.out.println("\nEjercicio 2");

		Solucion instanciaSolucion = new Solucion();
		Solucion.Sol sol = instanciaSolucion.new Sol();

		System.out.println("Accediendo a la propiedad texto: " + sol.getTexto());
		System.out.println("Accediendo a la propiedad privada valor: " + sol.getValor());

	}

	/*
	 * Añadir el metodo void setValor(int nuevoValor)
	 */
	public static void ejercicio03() {
		System.out.println("\nEjercicio 3");

		Solucion instanciaSolucion = new Solucion();
		Solucion.Sol sol = instanciaSolucion.new Sol();

		sol.setValor(20);
		System.out.println("Modificando la propiedad privada valor: " + sol.getValor());

	}

	/*
	 * Crear la clase estatica anidada SolEstaica dentro de la Clase Solucion
	 */
	public static void ejercicio04() {
		System.out.println("\nEjercicio 4");
		
		Solucion.SolEstatica solEstatica = new Solucion.SolEstatica();

		 System.out.println("Creada clase interna estatica: "
		 +solEstatica.getClass());
	}

	/*
	 * Crear la clase local SolLocal dentro del meotod void foo() de Solucion,
	 * SolLocal tendra un metodo void probar() que mostrara por pantalla el valor
	 * de la variable numero
	 */
	public static void ejercicio05() {
		System.out.println("\nEjericio 5");

		Solucion solucion = new Solucion();
		solucion.foo();

	}

	/*
	 * Crear la clase anonima sobre la interfaz Cosa
	 */

	interface ICosa {
		public default void diAlgo() {
			System.out.println("Algo");
		};
	}

	public static void ejercicio06() {
		System.out.println("\nEjericio 6");
		
		ICosa anonima = new ICosa() {};
		
		anonima.diAlgo();
	}

}
