package tema10;

public class Interfaces {

  /**
   * Crear la interfaz Perro con el metodo void ladrar() e implementar la clase Husky que implementa
   * la interfaz Perro
   */
  public static void ejercicio01() {
    System.out.println("\n\nTema 10");
    System.out.println("\nEjercicio 1");

  };

  /**
   * Implementar la siguiente interfaz
   */
  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    interface Poligono {

      int MIN_LADOS = 3;

      int calcularSuperficie();

      int numeroDeLados();

    };

    // Descomentar el siguiente codigo
    // class Cuadrado implements Poligono {

    // private final int NUMERO_LADOS = 4;
    // private int largo;

    // }
  };

  /*
   * Escribir la interfaz Redimensionable con los metodo redimensionarLado(int valor) que recalcula
   * las dimensiones. Aplicar la interfaz a la clase Circulo
   */
  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");

    class Circulo {

    };

  };

  /*
   * Crear la interfaz Dibujable que tenga el método void dibujar() que imprimirá por pantalla
   *  el tipo de figura y su superificie. Aplicar esta interfaz a la la clase Circulo del ejercicio anterior.
   */
  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");
  }


}
