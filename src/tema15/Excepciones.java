package tema15;

public class Excepciones {

  /*
   * Completar el siguiente codigo con try catch
   */
  public static void ejercicio01() {

    // Class.forName("FindMissingClass");

  }

  /*
   * Crear una excepción propia que extienda de Error y probarla
   */
  public static void ejercicio02() {

  }

  /**
   * Corregir el siguiente codigo
   */
  public static void ejericico03() {

    int a = 0;

    // try {
    // int b = 1/0; // ArithmenticException
    // } finally {

    // }

  }

  /*
   * Modificar el siguiente codigo para que maneje las ArithmeticException de un modo especfico
   */
  public static void ejercicio04() {

    int[] array = {1, 2, 3};

    try {

      // int num = array[4]; // ArrayIndexOutOfBoundsException
      // int val = array[0]/0; // ArithmenticException

    } catch (Exception e) {
      System.out.println("Manejando excepcion " + e.toString());
    }

  }

  /*
   * Que problema tiene el siguiente codigo
   */
  public static void ejercicio05() {

    // try {
    //   throw new AssertionError();
    // } catch (Exception e) {
    //   System.out.println("Capturando error ");
    // }
  }

}
