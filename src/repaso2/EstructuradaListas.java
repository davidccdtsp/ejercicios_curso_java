package repaso2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EstructuradaListas {

  /**
   * 
   * Determinar la máxima distancia entre dos elementos idénticos dentro de una lista.
   * 
   * Ejemplo: [1, 1, 2, 2, 1] Solución: 4
   * 
   * 
   */

  public static int sol01(List<Integer> numberList) {
    int max = 0;

    return max;
  }

  public static void ejercicio01() {
    System.out.println();
    System.out.println("Ejercicio 01");
    System.out.println();


    // Caso de prueba 1
    List<Integer> test1 = List.of(1, 1, 2, 2, 1);
    System.out.println("Caso de prueba 1: " + test1);
    System.out.println("Resultado: " + sol01(test1)); // Debería devolver 4

    // Caso de prueba 2
    List<Integer> test2 = List.of(1, 2, 3, 4, 5);
    System.out.println("Caso de prueba 2: " + test2);
    System.out.println("Resultado: " + sol01(test2)); // Debería devolver 0 (no hay elementos
                                                      // idénticos)

    // Caso de prueba 3
    List<Integer> test3 = List.of(1, 2, 1, 3, 1, 4);
    System.out.println("Caso de prueba 3: " + test3);
    System.out.println("Resultado: " + sol01(test3)); // Debería devolver 4 (distancia entre los dos
                                                      // 1)

    // Caso de prueba 4
    List<Integer> test4 = List.of(5, 5, 5, 5);
    System.out.println("Caso de prueba 4: " + test4);
    System.out.println("Resultado: " + sol01(test4)); // Debería devolver 3 (distancia máxima entre
                                                      // el primer y último 5)

    // Caso de prueba 5
    List<Integer> test5 = List.of(1, 2, 3, 1, 2, 1);
    System.out.println("Caso de prueba 5: " + test5);
    System.out.println("Resultado: " + sol01(test5)); // Debería devolver 5
  }

  /**
   * Dados dos entero K y una lista de enteros devolver una lista con los K primeros elementos en
   * orden inverso. Si K es mayor que el tamaño de la lista se devolver el equivalente a hacer la
   * llamada con K= tamano lista.
   * 
   * Ejemplos:
   * 
   * 
   * K=3, [1, 2, 3, 4, 5]
   * 
   * Solucion: [3, 2, 1, 4, 5]
   * 
   * k = 5, [1, 2, 3, 4, ,5 ,6]
   * 
   * Solucion: [5, 4, 3, 2, 1, 6]
   * 
   * 
   * k = 20, [1 ,2]
   * 
   * Solucion: [2, 1]
   * 
   */

  public static List<Integer> sol02(int k, List<Integer> numberList) {
    List<Integer> result = new ArrayList<>();

    return result;
  }

  public static void ejercicio02() {
    System.out.println();
    System.out.println("Ejercicio 02");
    System.out.println();

    // Caso de prueba 1
    List<Integer> test1 = List.of(1, 2, 3, 4, 5);
    int k1 = 3;
    System.out.println("Caso de prueba 1: K = " + k1 + ", Lista = " + test1);
    System.out.println("Resultado: " + sol02(k1, test1)); // Debería devolver [3, 2, 1, 4, 5]

    // Caso de prueba 2
    List<Integer> test2 = List.of(1, 2, 3, 4, 5, 6);
    int k2 = 5;
    System.out.println("Caso de prueba 2: K = " + k2 + ", Lista = " + test2);
    System.out.println("Resultado: " + sol02(k2, test2)); // Debería devolver [5, 4, 3, 2, 1, 6]

    // Caso de prueba 3
    List<Integer> test3 = List.of(1, 2);
    int k3 = 20;
    System.out.println("Caso de prueba 3: K = " + k3 + ", Lista = " + test3);
    System.out.println("Resultado: " + sol02(k3, test3)); // Debería devolver [2, 1]

    // Caso de prueba 4: K = 0 (debería devolver la lista original)
    List<Integer> test4 = List.of(10, 20, 30, 40);
    int k4 = 0;
    System.out.println("Caso de prueba 4: K = " + k4 + ", Lista = " + test4);
    System.out.println("Resultado: " + sol02(k4, test4)); // Debería devolver [10, 20, 30, 40]

    // Caso de prueba 5: K = 1 (debería devolver la lista original)
    int k5 = 1;
    System.out.println("Caso de prueba 5: K = " + k5 + ", Lista = " + test4);
    System.out.println("Resultado: " + sol02(k5, test4)); // Debería devolver [10, 20, 30, 40]

    // Caso de prueba 6: K = 1 (debería devolver la lista original)
    List<Integer> test6 = List.of(10);
    int k6 = 1;
    System.out.println("Caso de prueba 6: K = " + k5 + ", Lista = " + test6);
    System.out.println("Resultado: " + sol02(k6, test6)); // Debería devolver [10]
  }

  /**
   * Dado un array conteniendo N eneteros y un entero positivo K, encontrar el tamaño del 
   * subarray de mayor longitud cuya suma sea divisible por K.
   * 
   * Ejemplos:
   * 
   *        [2, 7, 6, 1, 4, 5]
   * 
   * Solución: 4 -> [7, 6, 1, 4]
   * 
   *        [-2, 2, -5, 12, -11, -1, 7]
   * 
  * Solución: 5 -> [-2, 2, -5, 12, -11, -1]
   * 
   */


  public static int sol03(int k, List<Integer> numberList){
    int max = 0;

    return max;
  }

  public static void ejercicio03(){

    System.out.println("Ejercicio 03");

    // Caso de prueba 1
    List<Integer> l1 = List.of(2, 7, 6, 1, 4, 5);
    var res1 = sol03(3, l1);
    System.out.println("Resultado caso 1: " + res1); // Debería devolver 4

    // Caso de prueba 2
    List<Integer> l2 = List.of(-2, 2, -5, 12, -11, -1, 7);
    var res2 = sol03(3, l2);
    System.out.println("Resultado caso 2: " + res2); // Debería devolver 5

  }

}
