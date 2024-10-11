package repaso1;

public class Estructurada {

  /**
   * Dado el un array de caracteres y dado otro array de numeros enteros no negativos y menores que
   * el tamano del array de caracteres. Escribir el codigo del programa que genere un String formado
   * por las letras en las posiciones indicadas en el array.
   * 
   * Ejemplo:
   * 
   * arrayChar = [ 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
   * 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' ];
   * 
   * numeros = [15, 11, 1, 19, 18, 14, 13]
   * 
   * Resultado: PLATON
   * 
   */
  public static void ejercicio01() {
    char[] arrayChar = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
        'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    char[] numeros = {};

  }

  /**
   * Dado un array de enteros, devolve la mayor suma de dos elementos del array. Si el array fuese
   * de tamano 0 o 1 devolver 0.
   * 
   * Ejemplo:
   * 
   * [12, 34, 10, 6 , 40]
   * 
   * Resultado: 34 + 40 = 74
   * 
   */

  public static int sol02(int[] arr) {
    int result = 0;
    return result;
  }

  public static void ejercicio02() {
    System.out.println();
    System.out.println("Ejercicio 02");

    int[] arr1 = {12, 34, 10, 6, 40};
    System.out.println("Caso 1: " + sol02(arr1)); // Resultado esperado: 74

    // Caso 2: Array de tamaño 0
    int[] arr2 = {};
    System.out.println("Caso 2: " + sol02(arr2)); // Resultado esperado: 0

    // Caso 3: Array de tamaño 1
    int[] arr3 = {5};
    System.out.println("Caso 3: " + sol02(arr3)); // Resultado esperado: 0

    // Caso 4: Array con números negativos
    int[] arr4 = {-10, -20, -5, -30};
    System.out.println("Caso 4: " + sol02(arr4)); // Resultado esperado: -5 + (-10) = -15

    // Caso 5: Array con números iguales
    int[] arr5 = {3, 3, 3, 3};
    System.out.println("Caso 5: " + sol02(arr5)); // Resultado esperado: 6

    // Caso 6: Array con números positivos y negativos
    int[] arr6 = {-1, -2, 5, 3, -4};
    System.out.println("Caso 6: " + sol02(arr6)); // Resultado esperado: 5 + 3 = 8

    // Caso 7: Array con un par de valores máximos iguales
    int[] arr7 = {100, 100, 2, 50, 75};
    System.out.println("Caso 7: " + sol02(arr7));
  }

  /**
   * Dado un array de alturas de edificios. Devolver el numero de pasos de subida consecutivos
   * necesarios para recorrer el skyline.
   * 
   * Ejemplos: [1, 2, 2, 3, 2]
   * 
   * Resultado: De 1 -> 2 y de 3->2. En ambos casos solo se da un paso de asecenso. Por lo tanto la
   * respuesta es 1.
   * 
   * [1, 2, 3, 4]
   * 
   * Resultado: De 1 -> 2 -> 3 -> 4. Por lo tanto el resultado es 3.
   * 
   * [0, 5, 3, 6, 3]
   * 
   * Resultado: De 10 -> 5 y de 3 -> 6. Por lo tanto el resultado es 1.
   * 
   */

  public static int sol03(int[] arr) {

    int result = 0;

    return result;
  }

  public static void ejercicio03() {
    System.out.println();
    System.out.println("Ejercicio 03");

    // Caso 1: Array de ejemplo [1, 2, 2, 3, 2]
    int[] arr1 = {1, 2, 2, 3, 2};
    System.out.println("Caso 1: " + sol03(arr1)); // Resultado esperado: 1

    // Caso 2: Array en ascenso continuo [1, 2, 3, 4]
    int[] arr2 = {1, 2, 3, 4};
    System.out.println("Caso 2: " + sol03(arr2)); // Resultado esperado: 3

    // Caso 3: Skyline con subida y bajada [0, 5, 3, 6, 3]
    int[] arr3 = {0, 5, 3, 6, 3};
    System.out.println("Caso 3: " + sol03(arr3)); // Resultado esperado: 1

    // Caso 4: Todos los edificios con la misma altura [5, 5, 5, 5]
    int[] arr4 = {5, 5, 5, 5};
    System.out.println("Caso 4: " + sol03(arr4)); // Resultado esperado: 0

    // Caso 5: Alternancia de alturas [3, 5, 2, 6, 2, 7]
    int[] arr5 = {3, 5, 6, 7, 9, 7};
    System.out.println("Caso 5: " + sol03(arr5)); // Resultado esperado: 4

    // Caso 6: Array vacío []
    int[] arr6 = {};
    System.out.println("Caso 6: " + sol03(arr6)); // Resultado esperado: 0

    // Caso 7: Array con un solo elemento [5]
    int[] arr7 = {5};
    System.out.println("Caso 7: " + sol03(arr7)); // Resultado esperado: 0

    // Caso 8: Edificios descendentes [5, 4, 3, 2]
    int[] arr8 = {5, 4, 3, 2};
    System.out.println("Caso 8: " + sol03(arr8)); // Resultado esperado: 0

    // Caso 9: Subida y luego altura constante [2, 3, 3, 3]
    int[] arr9 = {2, 3, 3, 3};
    System.out.println("Caso 9: " + sol03(arr9)); // Resultado esperado: 1

  }


  /**
   * Dado un String compuesto por palabras separadas por ".", devolver dicho String invertiendo su
   * orden pero no el de las palabras que la componen
   * 
   * Ejemplos: corred.insensatos
   * 
   * Resultado: insensatos.corred
   * 
   * un.mago.nunca.llega.tarde.,.Frodo.Bolsón.,.ni.pronto.Llega.exactamente.cuando.se.lo.propone
   * 
   * Resultado: propone.lo.se.cuando.exactamente.Llega.pronto.ni.,.Bolsón.Frodo.,.tarde.llega.nunca.mago.un
   * 
   */
  public static String sol04(String sentence) {
    String result = "";

    return result;
  }


  public static void ejercicio04() {
    System.out.println();
    System.out.println("Ejercicio 04");

    var sol1 = sol04("un.mago.nunca.llega.tarde.,.Frodo.Bolsón.,.ni.pronto.Llega.exactamente.cuando.se.lo.propone");
    System.out.println("Caso 1: "+sol1);

  }

  public static void ejercicio05() {

  }

}
