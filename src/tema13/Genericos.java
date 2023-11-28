package tema13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Solucion1 {
	// Tomar este metodo como base
	static <T> boolean iguales(T[] arrA, T[] arrB) {
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] != arrB[i])
				return false;
		}
		return true;
	}
}

final class Solucion2 {
	public static <T> List<T> invierte(List<T> lista) {
		List<T> nueva = new ArrayList<T>();

		for (int i = lista.size() - 1; i >= 0; i--) {
			nueva.add(lista.get(i));
		}
		return nueva;
	}
}

final class Solucion3<T> {
	
	T parametro;
	
	Solucion3(T parametro){
		if(parametro instanceof String)
			this.parametro = parametro;
	}
	
	void claseParametro() {
		if(parametro!=null)
			System.out.println(parametro.getClass());
		else 
			System.out.println("Parametro es null");
	}
}

public class Genericos {

	/*
	 * Crear un metodo que acepta dos arrays y devuelva true o false si sus
	 * elementos y el orden de estos es identico
	 */
	public static void ejercicio01() {
		System.out.println("\n\nTema 13: Genericos");
		System.out.println("\nEjercicio 1");

		Integer arrayA[] = { 1, 2, 3 };
		Integer arrayB[] = { 1, 2, 3 };
		Integer arrayC[] = { 2, 1, 3 };
		String arrayD[] = { "teclado", "raton", "monitor" };
		String arrayE[] = { "teclado", "raton", "monitor" };
		String arrayF[] = { "teclado", "webcam", "monitor" };

		boolean resultado = Solucion1.iguales(arrayA, arrayB);
		System.out.println("ArrayA y arrayB son iguales: " + resultado);
		resultado = Solucion1.iguales(arrayA, arrayC);
		System.out.println("ArrayA y arrayC son iguales: " + resultado);

		resultado = Solucion1.<String>iguales(arrayD, arrayE);
		System.out.println("ArrayD y arrayE son iguales: " + resultado);
		resultado = Solucion1.iguales(arrayE, arrayF);
		System.out.println("ArrayE y arrayF son iguales: " + resultado);
	}

	/*
	 * Cambiar el metodo invierte para que funcione con genericos
	 */
	public static void ejercicio02() {
		System.out.println("\nEjercicio 2");

//    List<Object> palabras = Arrays.asList("playa", "arbol", "oceano", "montaña");
		List<String> palabras = Arrays.asList("playa", "arbol", "oceano", "montaña");
		List<Integer> numeros = Arrays.asList(12, 34, 1, 56, 100);

		System.out.println("Lista en orden original:");
		System.out.println(palabras);
		System.out.println("Nueva lista en orden inverso");
		List<String> resultado = Solucion2.invierte(palabras);
		System.out.println(resultado);

		System.out.println("Lista en orden original:");
		System.out.println(numeros);
		System.out.println("Nueva lista en orden inverso");
		List<Integer> resultado2 = Solucion2.invierte(numeros);
		System.out.println(resultado2);

	}
	
	/*
	 * Cambiar el metodo invierte para que funcione con genericos
	 */
	public static void ejercicio03() {
		System.out.println("\nEjercicio 3");
		
		Solucion3<String> sol = new Solucion3<>("Hola!!!");
		sol.claseParametro();
		Solucion3<Integer> sol2 = new Solucion3<>(1234);
		sol2.claseParametro();
	}
}
