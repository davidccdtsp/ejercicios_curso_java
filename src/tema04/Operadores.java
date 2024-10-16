package tema04;

public class Operadores {

  public static void ejercicio01() {
    System.out.println("\n\nTema 4: Operadores");
    System.out.println("\nEjercicio 1");

    // Escribir las siguientes operaciones aritmeticas y de asginacion
    // a = 2 + 3
    int a = 2 + 3;
    System.out.println("2 + 3 = " + a);

    a = 3 - 7;
    System.out.println("3 - 7 = " + a);

    a = 5 * 4;
    System.out.println("5 * 4 = " + a);

    // b = 10 / 3
    float b = 10.00f / 3.00f;
    System.out.println("10 / 3 = " + b);

    // 126 % 6
    a = 126 % 6;
    System.out.println("126 % 6 = " + a);

  }

  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    // Anhade parentesis para que el resultado sea el indicado
    // 13 = 1 + 3 * 4
    int a = 1 + 3 * 4;
    System.out.println("a = " + a);
    // 16 = 1 + 3 * 4
    a = (1 + 3) * 4;
    System.out.println("a = " + a);
    // 0 = 1500 % 1000 / 5 * 2
    float b = 1500 % (1000 / (5 * 2));
    System.out.println("b = " + b);
    // 19 = 12 + 7 * 5 - 4
    a = 12 + 7 * (5 - 4);
    System.out.println("b =" + a);
  }

  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");

    int a = 21;
    int b = -33;
    boolean c = true;

    // Convierte las siguientes expresiones en otras equivalentes
    // a + 1 -> 22
    System.out.println("a = " + ++a);
    // a - 1 -> 21
    System.out.println("a = " + --a);
    // a * (-1) -> -21
    System.out.println("a = " + -a);
    // b * (-1) -> 33
    System.out.println("b = " + -b);

  }

  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");

    int a = 256;
    int b = 128;
    boolean resultado;
    resultado = false;

    // Realiza las siguientes expresiones relacionales o de igualdad
    System.out.println("int a = " + a);
    System.out.println("int b = " + b);
    // a igual a b
    resultado = (a == b);
    System.out.println("a igual a b = " + resultado);
    // a igual a a
    resultado = (a == a);
    System.out.println("a igual a = " + resultado);
    // a distinto de b
    resultado = (a != b);
    System.out.println("a distinto de b = " + resultado);
    // a mayor que b
    resultado = (a > b);
    System.out.println("a mayor que b =" + resultado);
    // a mayor que 128
    resultado = (a > 128);
    System.out.println("a mayor que 128 =" + resultado);
    // a menor que b
    resultado = (a < b);
    System.out.println("a menor que b = " + resultado);
    // a mayor o igual que 256
    resultado = (a >= 256);
    System.out.println("a mayor o igual que 256 = " + resultado);
    // b menor que 256
    resultado = (b < 256);
    System.out.println("b menor que 256 = " + resultado);
    // b menor o igual que 256
    resultado = (b <= 256);
    System.out.println("b menor o igual que 256 = " + resultado);

  }


}
