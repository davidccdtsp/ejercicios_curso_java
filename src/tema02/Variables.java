package tema02;

import java.util.Random;

public class Variables {

  /*
   * Completar el siguiente codigo
   */
  public static void ejercicio01() {
    System.out.println("\n\nTeam 2: Variables");
    System.out.println("\nEjercicio 1");

//     boolean logico = ;
//     int = 123;
//     CONSTANTE = 2.718;
//     float decimal = ;
//     double = decimal;
//     hexadecimal = 0xFF_EC_DE_5E;
//     letra = 'Z';
//     byte a = ;
//     long numero = ;
//     valorA = 123.23F;
//     valorB = 0.005f;
//     respuesta = true;
//     valorC = 45.32e4;
//     valorD = 3123.00D;
//     menorQue = '\u003c';
  }

  /*
   * Corregir los errores
   */
  public static void ejercicio02() {
    System.out.println("\nEjerccicio 2");

    final char letra = 'a';
    // short valor = 123L;
    // byte b = 200;
    // long variable = 111_111_L;
    // char otraLetra = -123;
    // float numero = 32.54e2;
    // int entero = 290_;
    // float numerB = 43d;
    // byte binario = 0b11011101;
    // float decimal = 13_.14;
    // char letraD = "D";
  }


  /*
   * Definir tres variables de tipo String de los siguientes modos: 
   * 1 - Usando un literal. 
   * 2 - A partir de un array de char. 
   * 3 - Con new String(...)
   */
  public static void ejercicio03() {
    System.out.println("\nEjerccicio 3");

    char[] letras = {'J', 'a', 'v', 'a'};

  }


  /*
   * Escribir el codigo para que el valor del numero aleatorio se muestre dentro de la cadena
   */
  public static void ejercicio04() {
    System.out.println("\nEjerccicio 4");

    // Genera numero aleatorios
    Random rand = new Random();
    int aleatorio = rand.nextInt(10);

    String texto = "Numero aleatorio: NUMERO AQUI generado con nextInt()";
  }


  /*
   * Completar el siguiente codigo
   */
  public static void ejercicio05() {
    System.out.println("\nEjerccicio 5");

    final int EDAD_UNIVERSO = 13_800;
    final float LUZ_TIERRA_LUNA = 1.255f;
    String texto;

    // texto = String.format("Se estima que la edad del universo es EDAD_UNIVERSO millones de años, "+
    //                     "la luz tarda LUZ_TIERRA_LUNA segundos en viajar desde la Tierra hasta la Luna"
    //                     ,);

    // System.out.println(texto);

  }

  /*
   * Transformar los siguientes strings en numeros y 
   * los numeros a string
   */
  public static void ejercicio06(){
    System.out.println("\nEjerccicio 6");

    final String sringEntero = "45";
    final String stringDecimal = "6.029";
    final int numero = 1969;

    int entero = 0;
    float decimal = 0;
    String stringNumero = "";

    System.out.println("String \"45\" transformado a entero = "+entero);
    System.out.println("String \"6.029\" transformado a float = "+entero);
    System.out.println("El Apollo XI fue lanzado el 16 de Julio de "+stringNumero+" desde Cape Kennedy");

  }


  /*
   * Realizar las siguientes operaciones sobre el String texto
   * 1 - Obtener el caracter en la posicion 5
   * 2 - Crear la subcadena que va desde la posicion 5 a la posicion 20
   * 3 - Substituir la palabra Java por C++
   * 4 - Comprobar si la cadena contiene la plabra tipado
   */
  public static void ejercicio07(){
    System.out.println("\nEjerccicio 7");

    String texto = "Java es un lenguaje de tipado estatico.";
    char caracter;
    String subcadena;
    String substitucion;
    boolean contieneTipado;

    // System.out.println("El caracter en la posicion 5 es: "+caracter );
    // System.out.println(subcadena);
    // System.out.println(substitucion);
    // System.out.println("String Texto contiene tipado: "+contieneTipado);

  }

  /*
   * 1. Crear un StringBuilder igual a la cadena texto.
   * 2. Añadir el sufijo 
   * 3. Insertar la poblacion en la posicion 77
   */
  public static void ejercicio08(){
    System.out.println("\nEjerccicio 8");

    String texto = "Antigua & Barbuda";
    String sufijo = "forma parte de la Commonwealth y cuenta con una polacion de habitantes";
    int poblacion = 92436;

    // StringBuilder sb = ;
    
    // System.out.println(sb);
    // Codigo para concatenar sufijo
    // System.out.println(sb);
    // Codigo para insertar poblacion
    // System.out.println(sb);
    


  }



}
