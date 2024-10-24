package tema10;

public class Interfaces {

  /**
   * Crear la interfaz Perro con el metodo void ladrar() e implementar la clase
   * Husky que implementa la interfaz Perro
   */

  interface Perro {
    void ladrar();
  };

  public static void ejercicio01() {
    System.out.println("\n\nTema 10");
    System.out.println("\nEjercicio 1");

    class Husky implements Perro {

      @Override
      public void ladrar() {
        System.out.println("Metodo ladrar de interfaz Perro");

      }

    }

    Perro toby = new Husky();
    toby.ladrar();

  };

  /**
   * Implementar la siguiente interfaz
   */

  interface Poligono {
    int MIN_LADOS = 3;

    int calcularSuperficie();

    int numeroDeLados();
  };

  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    // Descomentar el siguiente codigo
    class Cuadrado implements Poligono {

      private final int NUMERO_LADOS = 4;
      private int lado = 10;

      Cuadrado(int lado) {
        this.lado = lado;
      }

      @Override
      public int calcularSuperficie() {
        return lado * lado;
      }

      @Override
      public int numeroDeLados() {

        return NUMERO_LADOS;
      }

    }

    Cuadrado figura = new Cuadrado(3);
    System.out.println("Lados = " + figura.numeroDeLados());
    System.out.println("Superficie = " + figura.calcularSuperficie());
  };

  /*
   * Escribir la interfaz Redimensionable con los metodo redimensionarLado(int
   * valor) que recalcula las dimensiones. Aplicar la interfaz a la clase Circulo
   */

  interface Redimensionable {
    void redimensionarLado(int valor);
  }

  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");

    class Circulo implements Redimensionable {

      private double r;

      Circulo(double r) {
        this.r = r;
      }

      @Override
      public void redimensionarLado(int valor) {
        r = valor;
        System.out.println("Las nuevas dimensiones son " + (3.14 * r * r));
      }

    }
    ;

    Circulo cir = new Circulo(4.0);

    cir.redimensionarLado(10);

  };

  /*
   * Crear la interfaz Dibujable que tenga el método void dibujar() que imprimirá
   * por pantalla el tipo de figura y su superificie. Aplicar esta interfaz a la
   * la clase Circulo del ejercicio anterior.
   */

  interface Dibujable {
    void dibujar();
  }

  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");

    class Circulo implements Redimensionable, Dibujable {

      int r;

      public Circulo(int r) {
        this.r = r;
      }

      @Override
      public void redimensionarLado(int valor) {
        int r = valor;
        System.out.println("Las nuevas dimensiones son " + (3.14 * r * r));

      }

      @Override
      public void dibujar() {
        System.out.println("Circulo de area " + (3.14 * r * r));
      }

      // @Override
      // public void dibujar() {
      // // (x−h)^2 + (y−k)^2 = 2

      // int centro = r;
      // int diametro = 2 * r;

      // // Crear la cuadrícula para representar el círculo
      // for (int y = 0; y <= diametro; y++) {
      // for (int x = 0; x <= diametro; x++) {
      // // Calcular la distancia del punto (x, y) al centro
      // double distancia = Math.sqrt(Math.pow(x - centro, 2) + Math.pow(y - centro,
      // 2));
      // // Si la distancia está aproximadamente dentro del radio, dibujar un punto
      // if (Math.abs(distancia - r) < 0.5) {
      // System.out.print("*"); // Dibuja un punto del círculo
      // } else {
      // System.out.print(" "); // Espacios en blanco fuera del círculo
      // }
      // }
      // System.out.println(); // Nueva línea después de cada fila
      // }
      // }

    }

    Circulo circulo = new Circulo(5);
    circulo.dibujar();
  }

}
