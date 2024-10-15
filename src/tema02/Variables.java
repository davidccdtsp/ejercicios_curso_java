package tema02;

import java.util.Random;

public class Variables {

  /*
   * Completar el siguiente codigo
   */
  public static void ejercicio01() {
    System.out.println("\n\nTema 2: Variables");
    System.out.println("\nEjercicio 1");

    boolean logico = true;
    int entero = 123;
    final double CONSTANTE = 2.718;
    float decimal = 1.23f;
    double doble = decimal;
    int hexadecimal = 0xFF_EC_DE_5E;
    char letra = 'Z';
    byte a = 12;
    long numero = 999L;
    float valorA = 123.23F;
    float valorB = 0.005f;
    boolean respuesta = true;
    double valorC = 45.32e4;
    double valorD = 3123.00D;
    char menorQue = '\u003c';
  }

  /*
   * Corregir los errores
   */
  public static void ejercicio02() {
    System.out.println("\nEjerccicio 2");

    final char LETRA = 'a';
    short valor = 123;
    byte b = 22;
    long variable = 111_111L;
    char otraLetra = 123;
    float numero = 32.54e2f;
    int entero = 290;
    float numeroB = 43f;
    byte binario = 0b0101_1101;
    float decimal = 13.14f;
    char letraD = 'D';
  }

  /*
   * Definir tres variables de tipo String de los siguientes modos:
   * 1 - Usando un literal.
   * 2 - A partir de un array de char.
   * 3 - Con new String(...)
   */
  public static void ejercicio03() {
    System.out.println("\nEjerccicio 3");

    char[] letras = { 'J', 'a', 'v', 'a' };

    String palabra1 = "TypeScript";
    String palabra2 = new String(letras);
    String palabra3 = new String("Go");

    System.out.println();
    System.out.println(palabra1);
    System.out.println(palabra2);
    System.out.println(palabra3);
  }

  /*
   * Escribir el codigo para que el valor del numero aleatorio se muestre dentro
   * de la cadena
   */
  public static void ejercicio04() {
    System.out.println("\nEjerccicio 4");

    // Genera numero aleatorios
    Random rand = new Random();
    int aleatorio = rand.nextInt(10);

    String texto = "Numero aleatorio: " + aleatorio + " generado con nextInt()";
    System.out.println(texto);
  }

  /*
   * Completar el siguiente codigo
   */
  public static void ejercicio05() {
    System.out.println("\nEjerccicio 5");

    final int EDAD_UNIVERSO = 13_800;
    final float LUZ_TIERRA_LUNA = 1.255f;
    String texto;

    texto = String.format("Se estima que la edad del universo es %d millones de años, " +
        "la luz tarda %.2f segundos en viajar desde la Tierra hasta la Luna", EDAD_UNIVERSO, LUZ_TIERRA_LUNA);

    System.out.println(texto);

  }

  /*
   * Transformar los siguientes strings en numeros y
   * los numeros a string
   */
  public static void ejercicio06() {
    System.out.println("\nEjerccicio 6");

    final String stringEntero = "45";
    final String stringDecimal = "6.029";
    final int numero = 1969;

    int entero = Integer.valueOf(stringEntero);
    float decimal = Float.valueOf(stringDecimal);
    String stringNumero = Integer.toString(numero);
    stringNumero = "" + numero + "";
    stringNumero = String.valueOf(numero);

    System.out.println("String \"45\" transformado a entero = " + entero);
    System.out.println("String \"6.029\" transformado a float = " + decimal);
    System.out.println("El Apollo XI fue lanzado el 16 de Julio de " + numero + " desde Cape Kennedy");
    System.out.println("El Apollo XI fue lanzado el 16 de Julio de " + stringNumero + " desde Cape Kennedy");
  }

  /*
   * Realizar las siguientes operaciones sobre el String texto
   * 1 - Obtener el caracter en la posicion 5
   * 2 - Crear la subcadena que va desde la posicion 5 a la posicion 20
   * 3 - Substituir la palabra Java por C++
   * 4 - Comprobar si la cadena contiene la plabra tipado
   */
  public static void ejercicio07() {
    System.out.println("\nEjerccicio 7");

    String texto = "Java es un lenguaje de tipado estatico.";
    char caracter = texto.charAt(5);
    String subcadena = texto.substring(5, 20);
    String substitucion = texto.replaceAll("Java", "C++");
    boolean contieneTipado = texto.contains("tipado");

    System.out.println("El caracter en la posicion 5 es: " + caracter);
    System.out.println(subcadena);
    System.out.println(substitucion);
    System.out.println("String Texto contiene tipado: " + contieneTipado);

  }

  /*
   * 1. Crear un StringBuilder igual a la cadena texto.
   * 2. Añadir el sufijo
   * 3. Insertar la poblacion en la posicion 77
   */
  public static void ejercicio08() {
    System.out.println("\nEjerccicio 8");

    String texto = "Antigua & Barbuda";
    String sufijo = "forma parte de la Commonwealth y cuenta con una polacion de  habitantes";
    int poblacion = 92436;

    StringBuilder sb = new StringBuilder(texto);

    System.out.println(sb);
    // Codigo para concatenar sufijo
    sb.append(sufijo);
    System.out.println(sb);
    // Codigo para insertar poblacion
    sb.insert(77, poblacion);
    System.out.println(sb);

  }

}
