package tema17;

import java.lang.annotation.Documented;
import java.lang.annotation.*;

public class Anotaciones {

	public interface House {
		/**
		 * @deprecated Metodo obsoleto, usar openFrontDoor o openBackDoor
		 */
		@Deprecated
		void open();

		void openFrontDoor();

		void openBackDoor();
	}

	public static void ejercicio01() {
		System.out.println("\n\nTema 17: Anotaciones");
		System.out.println("\nEjercicio 1");

		class Casa implements House {

			@SuppressWarnings("deprecation")
			public void open() {
			}

			public void openFrontDoor() {
			}

			public void openBackDoor() {
			}

		}
		
		House miCasa = new Casa();
		miCasa.open();

	}

	public static void ejercicio02() {
		System.out.println("\nEjercicio 2");

		class MyHouse implements House {
//			@Deprecated
			public void open() {
			}

			public void openFrontDoor() {
			}

			public void openBackDoor() {
			}
		}

		MyHouse miCasa = new MyHouse();
		miCasa.open();

	}

	@Documented
	@interface MiAnotacion {
		String dia();
		int hora();
		int minutos();
	}

	public static void ejercicio03() {
		System.out.println("\nEjercicio 3");

		@MiAnotacion(dia = "Lunes", hora = 2, minutos = 0)
		class Ejercicio03 {
			public void limpiarCache() {
				// Hace cosas
			}
		}

	}

	@Target({
		ElementType.LOCAL_VARIABLE,
		ElementType.PARAMETER
	})	// Aplica a variables locales
	@interface InconsistentField {
	    String value() default "Valor inconsistente";
	}
	public static void ejercicio04() {
		System.out.println("\nEjercicio 4");
		
		@InconsistentField
		String valor;

	}

}
