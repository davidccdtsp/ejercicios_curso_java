package tema07;

import java.util.Scanner;

public class ControlDeFlujo {

  /*
   * Escribir un bloque de codigo que muestre por consola la variable numero
   * cuando sea positiva en
   * caso de que sea negativa no hara nada
   */
  public static void ejercicio01() {
    System.out.println("\n\nTema 7: Control de flujo");
    System.out.println("\nEjercicio 1");

    // Cambiar los valores manualmente para probar el funcionamiento
    int numero = 35;

    if (numero >= 0)
      System.out.println(numero);

    if (numero >= 0)
      System.out.println("int numero = " + numero + " positivo");
    else
      System.out.println("int numero = " + numero + " negativo");

  }

  /*
   * Modificar el codigo para que muestre un mensaje en caso de que a y b sean
   * iguales
   */

  public static void ejercicio02() {

    System.out.println("\nEjercicio 2");

    int a = 7;
    int b = 7;

    if (a == b) {
      System.out.println(a + " son iguales " + b);
    } else if (a > b) {
      System.out.println(a + " es mayor que " + b);
    } else {
      System.out.println(a + " es menor que " + b);
    }
  }

  /*
   * Escribir el codigo necesario para que se muestre por pantalla el mayor de los
   * tres numeros
   */
  public static void ejercicio03(int a, int b, int c) {
    System.out.println("\nEjercicio 3");

    if (a > b && a > c) {
      System.out.println("El mayor numero es " + a);
    } else if (b > a && b > c) {
      System.out.println("El mayor numero es " + b);
    } else if (c > a && c > b) {
      System.out.println("El mayor numero es " + c);
    }

  }

  /*
   * Usando WHILE Escribir un programa que cuente de 1 a 100
   */
  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");

    int i = 1;
    while (i <= 100) {
      System.out.print(i + ", ");
      i++;
    }

  }

  /*
   * Escribir un programa que pida un numero del 1 al 10 al usuario hasta que este
   * acierte
   */
  public static void ejercicio05() {
    System.out.println("\nEjercicio 5");

    // Descomentar el siguiente codigo
    final int numeroSecreto = (int) Math.floor(Math.random() * 10.0);
    int numero;
    Scanner scanner = new Scanner(System.in);
    System.out.println(numeroSecreto);

    do {

      System.out.println("Escribe un numero del 1 al 10");
      numero = scanner.nextInt();

    } while (numero != numeroSecreto);

  }

  /*
   * Usando do while mostrar los numeros pares entre 20 y 30
   */
  public static void ejercicio06() {
    System.out.println("\nEjercicio 6");

    int i = 20;
    do {
      if (i % 2 == 0)
        System.out.print(i + ", ");
      i++;
    } while (i <= 30);

  }

  /*
   * Usando For mostrar por pantalla el contenido del array planetas
   */
  public static void ejercicio07() {
    System.out.println("\nEjercicio 7");

    String planetas[] = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno" };

    int i;
    for (i = 0; i < planetas.length; i++) {
      System.out.print(planetas[i] + ", ");
    }
  }

  /*
   * Completar el siguiente codigo
   */
  public static void ejercicio08() {
    System.out.println("\nEjercicio 8");

    String planetas[] = { "Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno" };

    // Descomentar el siguiente codigo
    for (String planeta : planetas) {
      System.out.print(planeta + ", ");
    }

  }

  /*
   * En base al número del día de la semana (0, 1, …, 6 ) devolver el nombre del
   * día correspondiente,
   * en caso de que el valor sea negativo o superior a 6 devolver un mensaje
   * indicando el rango correcto.
   */
  public static void ejercicio09() {
    System.out.println("\nEjercicio 9");

    int numeroDia = 0;
    String dia = "";

    switch (numeroDia) {
      case 0:
        dia = "Lunes";
        break;
      case 1:
        dia = "Martes";
        break;
      case 2:
        dia = "Miercoles";
        break;
      case 3:
        dia = "Jueves";
        break;
      case 4:
        dia = "Viernes";
        break;
      case 5:
        dia = "Sabado";
        break;
      case 6:
        dia = "Domingo";
        break;
      default:
        dia = "Rango incorrecto, debe estar entre 0 y 6";
        break;
    }

    System.out.println(dia);

  }

  /*
   * Escribir una calculadora simple que realice las siguientes operaciones +, -,
   * * y /
   */
  public static void ejercicio10() {
    System.out.println("\nEjercicio 10");

    // Descomentar el siguiente codigo
    Scanner entrada = new Scanner(System.in);
    char op;
    Double n1, n2, res;

    System.out.println("+, -, *, or /");
    System.out.print("Escoge un operador:");
    op = entrada.next().charAt(0);

    System.out.print("Introduce el Numero 1 :");
    n1 = entrada.nextDouble();
    System.out.print("Introduce el Numero 2 :");
    n2 = entrada.nextDouble();

    Double resultado;

    resultado = switch (op) {
      case '+' -> n1 + n2;
      case '-' -> n1 - n2;
      case '*' -> n1 * n2;
      case '/' -> n2 != 0 ? n1 / n2 : Double.POSITIVE_INFINITY;
      default -> null;
    };

    if(resultado == null){
      System.out.println("Operacion no soportada");
    } else {
      System.out.println(String.format("%f %s %f = %f", n1, op,  n2, resultado));
    }

    // Otra posible solucion 
    
    // switch (op) {
    //   case '+':
    //     System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    //     break;
    //   case '-':
    //     System.out.println(String.format("%d - %d = %d", n1, n2, (n1 - n2)));
    //     break;
    //   case '*':
    //     System.out.println(String.format("%d * %d = %d", n1, n2, (n1 * n2)));
    //     break;
    //   case '/':
    //     if (n2 == 0) {
    //       System.out.println(String.format("%d / %d = %f", n1, n2, 0));
    //     }
    //     System.out.println(String.format("%d / %d = %f", n1, n2, (n1 / n2)));
    //     break;
    //   default:
    //     System.out.println("Operacion no soportada");
    //     break;
    // }

  }

  /*
   * Modificar el siguiente código usando break de modo que sea equivalente
   */
  public static void ejercicio11() {
    System.out.println("\nEjercicio 11");

    int i = 10;

    while (i < 15) {
      System.out.print(i + ", ");
      i++;
    }

    System.out.println();
    i = 10;

    while (true) {
      System.out.print(i + ", ");
      if (i == 14)
        break;
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
        if (total > 200)
          break etiqueta;
      }
    }

    System.out.println("Suma total = " + total);

  }

  /*
   * Usar continue para hacer que solo se muestren las 3 primeras iteraciones del
   * bucle
   */
  public static void ejercicio13() {
    System.out.println("\nEjercicio 13");

    int i = 0;

    while (i < 20) {
      i += 2;
      if (i > 6)
        continue;
      System.out.print(i + " ");
    }

  }

  /*
   * Corregir los errores en el siguiente codigo
   * 
   */
  public static void ejercicio14() {
    System.out.println("\nEjercicio 14");

    int nota = 9;

    String resultado = switch (nota) {
      case 9, 10 -> "sobreasliente";
      case 7, 8 -> "Notable";
      default -> "";
    };

    System.out.println(resultado);

  }

}
