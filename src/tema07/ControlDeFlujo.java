package tema07;

import java.util.Scanner;

public class ControlDeFlujo {

  /*
   * Escribir un bloque de codigo que muestre por consola la variable numero cuando sea positiva en
   * caso de que sea negativa no hara nada
   */
  public static void ejercicio01() {
    System.out.println("\n\nTema 7: Control de flujo");
    System.out.println("\nEjercicio 1");

    // Cambiar los valores manualmente para probar el funcionamiento
    int numero = 35;

  }

  /*
   * Modificar el codigo para que muestre el mensaje especifico en caso de que a y b sean iguales
   */

  public static void ejercicio02() {

    System.out.println("\nEjercicio 2");

    int a = 7;
    int b = 4;

    if (a > b) {
      System.out.println(a + " es mayor que " + b);
    } else {
      System.out.println(a + " es menor o igual que " + b);
    }
  }

  /*
   * Escribir el codigo necesario para que se muestre por pantalla el mayor de los tres numeros
   */
  public static void ejercicio03(int a, int b, int c) {
    System.out.println("\nEjercicio 3");

  }

  /*
   * Escribir un programa que cuente de 1 a 100 usando WHILE
   */
  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");

  }

  /*
   * Escribir un programa que pida un numero del 1 al 10 al usuario hasta que este acierte
   */
  public static void ejercicio05() {
    System.out.println("\nEjercicio 5");

    // Descomentar el siguiente codigo
    // final int numeroSecreto = (int)Math.random()+10;
    // int numero;
    // Scanner scanner = new Scanner(System.in);


    // System.out.println("Escribe un numero del 1 al 10");
    // numero = scanner.nextInt();
  }

  /*
   * Usando do while mostrar los numeros pares entre 20 y 30
   */
  public static void ejercicio06() {
    System.out.println("\nEjercicio 6");

  }

  /*
   * Usando el bucle For, mostrar por pantalla el contenido del array planetas
   */
  public static void ejericico07() {
    System.out.println("\nEjercicio 7");

    String planetas[] =
        {"Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno"};
  }

  /*
   * Complear el siguiente codigo
   */
  public static void ejercicio08() {
    System.out.println("\nEjercicio 8");

    String planetas[] =
        {"Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno"};

    // Descomentar el siguiente codigo
    // for(String : ){
    // System.out.print(+" ");
    // }

  }

  /*
   * El programa en base al numero del dia de la semana y devolver el nombre del dia correspondiente
   */
  public static void ejercicio09() {
    System.out.println("\nEjercicio 9");

    int numeroDia = 0;

  }


  /*
   * Escribir una calculadora simple que realice las siguientes operaciones +, -, * y /
   */
  public static void ejercicio10() {
    System.out.println("\nEjercicio 10");

    // Descomentar el siguiente codigo
    // Scanner entrada = new Scanner(System.in);
    // char op;
    // Double n1, n2, res;

    // System.out.println("+, -, *, or /");
    // System.out.print("Escoge un operador:");
    // op = entrada.next().charAt(0);

    // System.out.print("Introduce el Numero 1 :");
    // n1 = entrada.nextDouble();
    // System.out.print("Introduce el Numero 2 :");
    // n2 = entrada.nextDouble();


  }


  /*
   * Modificar el siguiente codigo usando break
   */
  public static void ejercicio11() {
    System.out.println("\nEjercicio 11");

    int i = 10;

    while (i < 15) {
      System.out.println(i);
      i++;
    }

  }

  /*
   * Usando break terminal el bucle cuando total sea mayor que 200
   */
  public static void ejercicio12() {
    System.out.println("\nEjercicio 12");

    int total = 0;
    etiqueta: for (int i = 1; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        total += i * j;
      }
    }

    // System.out.println("Suma total = " + total);

  }

  /*
   * Usar continue para hacer que solo se muestren las 3 primeras iteraciones del bucle
   */
  public static void ejercicio13() {
    System.out.println("\nEjercicio 13");

    int i = 0;

    while (i < 20) {
      i += 2;
      System.out.print(i + " ");
    }
  }

  /*
   * Corregir los errores en el siguiente codigo
   * 
   */
  public static void ejercicio14() {
    // System.out.println("\nEjercicio 14");

    // double nota = 9.5;

    // String resultado = switch (nota) {
    //   case 9.0, 10.0 -> {
    //     yield "sobresaliente";
    //   }
    //   case 7.0, 8.0 -> "Notable";
    //   default -> "";
    // };

    // System.out.println(resultado);

  }


}
