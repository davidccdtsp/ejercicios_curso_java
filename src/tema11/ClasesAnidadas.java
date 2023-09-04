package tema11;

public class ClasesAnidadas {


  /*
   * Crear la clase interna Sol dentro de la clase Solucion
   */
  public static void ejercicio01() {
    System.out.println("\n\nEjercicios Tema 11: Clases anidadas");
    System.out.println("\nEjercicio 1");

    // System.out.println("Creada clase interna "+sol.getClass());

  }


  /*
   * Crear un los metodos String getTexto() y int getValor() en la clase Sol1
   */
  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    // System.out.println("Accediendo a la propiedad texto: "+sol.getTexto());
    // System.out.println("Accediendo a la propiedad privada valor: "+sol.getValor());

  }

  /*
   * Añadir el metodo void setValor(int nuevoValor)
   */
  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");

    // sol.setValor(20);
    // System.out.println("Modificando la propiedad privada valor: " + sol.getValor());

  }

  /*
   * Crear la clase estatica anidada SolEstaica dentro de la Clase Solucion
   */
  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");

    // System.out.println("Creada clase interna estatica: " +solEstatica.getClass());
  }

  /*
   * Crear la clase anidada SolAnidada dentro del meotod void foo() de Solucion,
   * SolAnidada tendra un metodo void probar() que mostrara por pantalla
   * el valor de la variable numero
   */
  public static void ejercicio05() {
    System.out.println("\nEjericio 5");

    Solucion solucion = new Solucion();
    solucion.foo();

  }

  /*
   * Crear la clase anonima sobre la interfaz Cosa
   */
  public static void ejercicio06(){
    System.out.println("\nEjericio 6");

    interface Cosa {
      public default void diAlgo(){
        System.out.println("Algo");
      };
    }
  }



}
