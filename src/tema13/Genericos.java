package tema13;

import java.util.ArrayList;
import java.util.List;

final class Solucion1 {
    // Tomar este metodo como base
    static boolean iguales(int[] arrA, int[] arrB) {
      for (int i = 0; i < arrA.length; i++) {
        if (arrA[i] != arrB[i])
          return false;
      }
      return true;
    }
  }

final class Solucion2 {
    public static List<Object> invierte(List<Object> lista) {
      List<Object> nueva = new ArrayList<Object>();

      for(int i = lista.size()-1; i>=0; i--){
        nueva.add(lista.get(i));
      }
      return nueva;
    }
  }

public class Genericos {

  /*
   * Crear un metodo que acepta dos arrays y devuelva true o false si sus elementos y el orden de
   * estos es identico
   */
  public static void ejercicio01() {
    System.out.println("\n\nTema 13: Genericos");
    System.out.println("\nEjercicio 1");

    int arrayA[] = {1, 2, 3};
    int arrayB[] = {1, 2, 3};
    int arrayC[] = {2, 1, 3};
    String arrayD[] = {"teclado", "raton", "monitor"};
    String arrayE[] = {"teclado", "raton", "monitor"};
    String arrayF[] = {"teclado", "webcam", "monitor"};

    boolean resultado = Solucion1.iguales(arrayA, arrayB);
    System.out.println("ArrayA y arrayB son iguales: " + resultado);
  }

  /*
   * Cambiar el metodo invierte para que funcione con genericos
   */
  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    List<Object> palabras = List.of("playa", "arbol", "oceano", "montaña");
    // List<String> palabras = List.of("playa", "arbol", "oceano", "montaña");

    System.out.println("Lista en orden original:");
    System.out.println(palabras);
    System.out.println("Nueva lista en orden inverso");
    List<Object> resultado = Solucion2.invierte(palabras);
    System.out.println(resultado);



  }
}


