package tema14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.junit.Assert;

public class Lambdas {

	/*
	 * Descomentar el codigo y completar la parte izquierda de la sentencia con la
	 * interfaz correspndiente de entre Runnable (run), Consumer<T> (accept), y
	 * Predicate<T> (test) y realizar su correspondiente llamada
	 */

	public static void ejercicio01() {
		System.out.println("\n\nTema 14");
		System.out.println("\nEjercicio 1");

		Runnable lambda1 = () -> System.out.println("Lambda 1");
		Consumer<Integer> lambda2 = (Integer i) -> System.out.println(i * 3);
		Consumer<String> lambda3 = s -> System.out.println("La longitud de " + s + " es " + s.length());
		Predicate<Integer> lambda4 = i -> 0 == i % 2;
		Predicate<String> lambda5 = s -> s.equals(s.toUpperCase());

		lambda1.run();
		lambda2.accept(3);
		lambda3.accept("Patata");
		boolean res = lambda4.test(22);
		System.out.println("lambda4.test(22) = " + res);
		res = lambda5.test("ISLA");
		System.out.println("lambda5.test(\"ISLA\") = " + res);
	}

	/*
	 * Crear una expresionLambda que funcione como una factoria que genere como
	 * maximo 10 instancias de la clase Demo
	 */
	public static void ejercicio02() {
		System.out.println("\nEjercicio 2");

		Supplier<Demo> factoriaDemo = () -> {
			if (Demo.contador > 0)
				return new Demo(12);
			else
				return null;
		};

		for (int i = 0; i < 15; i++) {
			Demo demo = factoriaDemo.get();
			System.out.println("Demo.contador " + Demo.contador);
			if (demo == null)
				System.out.println("null");
		}
	}

	/*
	 * Escribir las expresiones equivalentes en su version optimizada
	 */
	public static void ejercicio03() {
		System.out.println("\nEjercicio 3");

		Supplier<Integer> anoActual = () -> 2023;
		IntSupplier anoActualInt = () -> 2023;
		Supplier<Double> pi = () -> 3.14;
		DoubleSupplier piDouble = () -> 3.14;
		Supplier<Long> seed = () -> 314L;
		LongSupplier seedLong = () -> 314L;
		Supplier<Boolean> caraCruz = () -> {
			Random random = new Random();
			return random.nextBoolean();
		};
		BooleanSupplier caraCruzBoolean = () -> {
			Random random = new Random();
			return random.nextBoolean();
		};
		Consumer<Integer> printMod16 = i -> System.out.println(i % 16);
		IntConsumer printMod16Int = i -> System.out.println(i % 16);
		Consumer<Double> printEuros = i -> System.out.println(i + "€");
		DoubleConsumer pritnEurosDouble = i -> System.out.println(i + "€");

		// Probar aqui las versiones optimizadas
		System.out.println("Año actual " + anoActualInt.getAsInt());
		System.out.println("PI = " + piDouble.getAsDouble());
		System.out.println("Seed = " + seedLong.getAsLong());
		System.out.println("Cara? = " + caraCruzBoolean.getAsBoolean());
		printMod16Int.accept(32);
		pritnEurosDouble.accept(3000);
	}

	/*
	 * Usando una expresion lambda comparar uno a uno cada uno de los elementos de
	 * los dos arrays
	 */
	public static void ejercicio04() {
		System.out.println("\nEjercicio 4");

		String[] array1 = { "Napoleon", "Gengis Kan", "Alejandro Magno", "Julio Cesar" };
		String[] array2 = { "Napoleon", "Alan Turing", "Alejandro Magno", "Pierre Simon Laplace" };

		BiConsumer<String[], String[]> comparadorArrays = (a1, a2) -> {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i].equals(a2[i]))
					System.out.println(a1[i] + " igual " + a2[i]);
				else
					System.out.println(a1[i] + " distinto " + a2[i]);
			}
			;
		};

		comparadorArrays.accept(array1, array2);
	}

	/*
	 * Escribir una expresión lambda para filtrar palabras en mayúsculas
	 */
	public static void ejercicio05() {
		System.out.println("\nEjercicio 5");

		String[] palabras = { "Transistor", "CONDENSADOR", "socket", "USB" };

		Predicate<String> filtroMayus = s -> s.equals(s.toUpperCase());

		for (int i = 0; i < palabras.length; i++)
			if (filtroMayus.test(palabras[i]))
				System.out.println(palabras[i] + " esta en mayusculas");
	}

	/*
	 * Pasar la siguiente expresion a su version optimizada
	 */
	public static void ejercicio06() {
		System.out.println("\nEjercicio 6");

		Integer[] numeros = { 127, 996, 1, 24, 800 };

//		 Predicate<Integer> lambda = i -> i < 500;
		IntPredicate lambda = i -> i < 500;

		for (int i = 0; i < numeros.length; i++) {
			if (lambda.test(numeros[i]))
				System.out.print(numeros[i] + " ");
		}
	}

	/*
	 * Escribir una expresion lambda que tome dos argumentos un String y un int y
	 * que compare la longitud del String con el valor del int. Aplicarlo a ambos arrays
	 */
	public static void ejercicio07() {
		System.out.println("\n\nEjercicio 7");

		String[] palabras = { "Transistor", "CONDENSADOR", "socket", "USB" };
		Integer[] longitudes = { 5, 10, 6, 4 };

		BiPredicate<String, Integer> comparador = (s, i) -> s.length() == i;

		for (int i = 0; i < palabras.length; i++) {
			if (comparador.test(palabras[i], longitudes[i]))
				System.out.println("La longitud de " + palabras[i] + " es " + longitudes[i]);
			else
				System.out.println("La longitud de " + palabras[i] + " NO es " + longitudes[i]);
		}
	}

	/*
	 * Dado el siguiente array de String mapearlo a un array de Cajas. Usar una
	 * expresion lambda para ello
	 * 
	 */
	public static void ejercicio08() {
		System.out.println("\nEjercicio 8");

		class Caja {
			String contenido;

			Caja(String contenido) {
				this.contenido = contenido;
			}
			
			public String toString() {
				return contenido;
			}
		}

		String[] objetos = { "Smarphone", "Bicicleta", "Mesa", "Silla", "Zapatos" };
		Caja[] cajas = new Caja[5];

		Function<String, Caja> expresion = (s) -> new Caja(s);

		for (int i = 0; i < 5; i++) {
			cajas[i] = expresion.apply(objetos[i]);
		}
		
		for(int j = 0; j<objetos.length; j++)
			System.out.print(cajas[j]+", ");
	}

	/*
	 * Transformar las siguientes lambas en su versiones equivalentes como
	 * referencias a metodos
	 */
	public static void ejercicio09() {
		System.out.println("\n\nEjercicio 9");

		class Demo {
			int valor;

			Demo(int valor) {
				this.valor = valor;
			}

			int getValor() {
				return valor;
			}
		}

//		Consumer<String> printer = s -> System.out.println(s);
		Consumer<String> printer = System.out::println;
//		DoubleUnaryOperator sqrt = a -> Math.sqrt(a);
		DoubleUnaryOperator sqrt = Math::sqrt;
//		IntBinaryOperator min = (a, b) -> Integer.min(a, b);
		IntBinaryOperator min = Integer::min;
//		Function<String, Integer> tamano = (s) -> s.length();
		Function<String, Integer> tamano = String::length;
//		Function<Demo, Integer> demoAInt = i -> i.getValor();
		Function<Demo, Integer> demoAInt = Demo::getValor;
//		BiFunction<String, String, Integer> indice = (s1, s2) -> s1.indexOf(s2);
		BiFunction<String, String, Integer> indice = String::indexOf;
//		Supplier<List<String>> listaA = () -> Arrays.asList();
		Supplier<List<String>> listaA = Arrays::asList;
//		Supplier<List<String>> listaB = () -> new ArrayList<String>();
		Supplier<List<String>> listaB = ArrayList<String>::new;
		Supplier<List<String>> listaBB = ArrayList::new;

		printer.accept("null");
		sqrt.applyAsDouble(128);
		min.applyAsInt(10, 3);
		tamano.apply("Efecto Coriolis");
		demoAInt.apply(new Demo(765));
		indice.apply("As you can see in the above code", "code");
		listaA.get();
		listaB.get();

	}

	/*
	 * Crear la expresion lambda equivalente a lambdaOriginal combinando cada una de
	 * las siguientes
	 */
	public static void ejercicio10() {
		System.out.println("\nEjercicio 10");

		Predicate<String> lambdaOriginal = s -> (s != null) && (s.length() > 5) && (s.equals(s.toUpperCase()));

		Predicate<String> enMayus = s -> s.equals(s.toUpperCase());
		Predicate<String> mayorQue5 = s -> s.length() > 5;
		Predicate<String> noNula = s -> s != null;

		Predicate<String> lambdaEquivalente = noNula.and(mayorQue5).and(enMayus);

		boolean res1 = lambdaOriginal.test("Casa");
		boolean res2 = lambdaEquivalente.test("Casa");
		boolean res3 = lambdaOriginal.test("PATATA");
		boolean res4 =lambdaEquivalente.test("PATATA");
		
		System.out.println("Casa "+res1);
		System.out.println("Casa "+res2);
		System.out.println("PATATA "+res3);
		System.out.println("PATATA "+res4);
		
	}

	/*
	 * Crear una nueva expresion lambda que sea la negacion de la primera.
	 */
	public static void ejercicio11() {
		System.out.println("\nEjercicio 11");

		Predicate<String> esVacia = s -> s.length() == 0;
		Predicate<String> noEsVacia = esVacia.negate();
		
		System.out.println("\"cadena\" es vacia = "+esVacia.test("cadena"));
		System.out.println("\"cadena\" no es vacia = "+noEsVacia.test("cadena"));
	}

	/*
	 * Encadenar las siguientes expresiones lambda
	 */
	public static void ejercicio12() {
		System.out.println("\nEjercicio 12");

		Consumer<String> lambda1 = System.out::println;
		Consumer<String> lambda2 = s -> System.out.println("Expresion 2 " + s);

		Consumer<String> encadenadas = lambda1.andThen(lambda2);
		encadenadas.accept("Verano");

	}

	/*
	 * Combinar ambas expresiones con compose y andThen, comparar el resultado
	 */
	public static void ejercicio13() {
		System.out.println("\nEjercicio 13");

		Function<String, String> lambda1 = s -> "aaa***" + s + "***aaa";
		Function<String, String> lambda2 = s -> s.toUpperCase();
		
		Function<String, String> compose = lambda1.compose(lambda2);
		Function<String, String> andThen = lambda1.andThen(lambda2);
		
		System.out.println(compose.apply("Texto"));
		System.out.println(andThen.apply("Texto"));
	}

	/*
	 * Completar el siguiente codigo
	 */
	public static void ejercicio14() {
		System.out.println("\nEjercicio 14");

		 Comparator<Integer> comparador = (i1,i2) -> Integer.compare(i1, i2);
		 int res = comparador.compare(234, 43);
		 
		 System.out.println("Comparando 234 y 43 : "+res);

	}

	/*
	 * Transformar en su forma abreviada
	 */
	public static void ejercicio15() {
		System.out.println("\nEjercicio 15");

//		Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		Comparator<String> comparator = Comparator.comparingInt(String::length);

		int res = comparator.compare("Casa", "puerta");
		System.out.println("Comparando \"Casa\" y \"puerta\" : "+res);

	}

	/*
	 * Modificar la primera expresion para su uso con Comparator.comparing Crear
	 * otra expresion para comparar en base a la potencia Crear una expresion que
	 * use las dos primeras, comaprando primero por Modelo y posteriormente por
	 * potencia.
	 * 
	 * Por ultimo usar Comparator.comparing directamente con los getters de la clase
	 * para obtener una expresion equivalente
	 */
	public static void ejercicio16() {
		System.out.println("\nEjercicio 16");

		class Coche {
			int potencia;
			String modelo;

			Coche(int potencia, String modelo) {
				this.potencia = potencia;
				this.modelo = modelo;
			}

			int getPotencia() {
				return potencia;
			}

			String getModelo() {
				return modelo;
			}
			
			public String toString() {
				return "|"+modelo+" - "+potencia+"|";
			}
		}

//		Comparator<Coche> porModelo = (c1, c2) -> c1.getModelo().compareTo(c2.getModelo());
		Comparator<Coche> porModelo = Comparator.comparing(Coche::getModelo);

		Comparator<Coche> porPotencia = Comparator.comparing(Coche::getPotencia);
		Comparator<Coche> combinado = porModelo.thenComparing(porPotencia);

		Comparator<Coche> combinado2 = Comparator.comparing(Coche::getModelo).thenComparing(Coche::getPotencia);

		Coche coche1 = new Coche(45, "B");
		Coche coche2 = new Coche(50, "B");
		Coche coche3 = new Coche(60, "A");

		List<Coche> coches = Arrays.asList(coche1, coche2, coche3);
		
		coches.sort(porModelo);
		System.out.println(coches);
		coches.sort(porPotencia);
		System.out.println(coches);
		coches.sort(combinado);
		System.out.println(coches);
		coches.sort(combinado2);
		System.out.println(coches);

	}

}
