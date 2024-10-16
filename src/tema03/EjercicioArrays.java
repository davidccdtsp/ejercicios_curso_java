package tema03;

import java.util.Arrays;

public class EjercicioArrays {
	
  public static void ejercicio01() {

    System.out.println("\n\nTema 3: Arrays");
    System.out.println("\nEjercicio 1");


    // Crear el array numeros {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365}.
    int[] numeros = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};
    int numerosb[] = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};

    // Crear el array palabras {"Apple", "Google", "Microsoft", "Nvidia", "Intel", "AMD", "TSMC",
    // "Samsung", "Qualcom", "Huawei", "ASML"};
    String[] palabras = {"Apple", "Google", "Microsoft", "Nvidia", "Intel", "AMD", "TSMC",
    	     "Samsung", "Qualcom", "Huawei", "ASML"};

    // Mostrar por pantalla las posiciones 0, 4 y última de numeros.
    System.out.println("numeros[0] = "+numeros[0]);
    System.out.println("numeros[4] = "+numeros[4]);
    System.out.println("numeros["+(numeros.length-1)+"] = "+numeros[numeros.length-1]);

    // Mostrar por pantalla las posiciones 5, 6 y 10 de palabras.
    System.out.println("palabras[5] = "+palabras[5]);
    System.out.println("palabras[6] = "+palabras[6]);
    System.out.println("palabras[10] = "+palabras[10]);


  }

  public static void ejercicio02() {

    System.out.println("\nEjercicio 2");

    // Crear el array 3x3 matriz
    // [1, 2, 3]
    // [4, 5, 6]
    // [7, 8, 9]
    
    int[][] matriz = {
    		{1, 2, 3},
    		{4, 5, 6},
    		{7, 8, 9}
    };

    // Mostrar el contenido del array, usar: Arrays.deepToString(arrayQueQuieroMostarr)
    
    System.out.println(Arrays.deepToString(matriz));

    // Mostrar las posiciones (0,1), (1,2) y (2,1)
    System.out.println("matriz[0][1] = "+matriz[0][1]);
    System.out.println("matriz[1][2] = "+matriz[1][2]);
    System.out.println("matriz[2][1] = "+matriz[2][1]);

  }

  public static void ejercicio03() {

    System.out.println("\nEjercicio 3");

    // Declarar e inicializar los arrays para que su salida al mostrarlos por consola sea la
    // indicada
    boolean[] a = {true, true, false, true}; // Modificar este codigo, NO usar Object
    System.out.println(Arrays.toString(a)); // [true, true, false, true]
    int[] b = {10, 20, 30};
    System.out.println(Arrays.toString(b)); // [10, 20, 30]
    char[] c = { 'g', 'e', 'e', 'k', 's'};
    System.out.println(Arrays.toString(c)); // [g, e, e, k, s]
    double[] d = {1.0, 2.0, 3.0, 4.0};
    System.out.println(Arrays.toString(d)); // [1.0, 2.0, 3.0, 4.0]
    int[] e = {1, 2, 3, 4};
    System.out.println(Arrays.toString(e)); // [1, 2, 3, 4]

  }

  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");
    
    // Array palabras {"Apple", "Google", "Microsoft", "Nvidia", "Intel", "AMD", "TSMC",
    // "Samsung", "Qualcom", "Huawei", "ASML"};
    
    String[] palabras = {"Apple", "Google", "Microsoft", "Nvidia", "Intel", "AMD", "TSMC",
    	     "Samsung", "Qualcom", "Huawei", "ASML"};

    // Ordenar alfabéticamente y muestrael array palabras reado en el ejercicio 1.b y
    System.out.println(Arrays.toString(palabras));

    // Ordenarlo alfabéticamente
    Arrays.sort(palabras);
    System.out.println(Arrays.toString(palabras));
    // Buscar el valor “Qualcom”.
    int res = Arrays.binarySearch(palabras,"Qualcom");
    System.out.println("El indice de 'Qualcom' es "+res);
    // Buscar el valor “Desconocido”.
    res = Arrays.binarySearch(palabras,"Desconocido");
    System.out.println("El indice de 'Desconocido' es "+res);
    // Buscar el valor “qualcom”.
    res = Arrays.binarySearch(palabras,"qualcom");
    System.out.println("El indice de 'qualcom' es "+res);
  }

  public static void ejercicio05() {
    System.out.println("\nEjercicio 5");

    // Usando el array numeros del ejercicio 1
    int[] numeros = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};
    System.out.println(Arrays.toString(numeros));
    // Cambiar todos sus valores a 0
    Arrays.fill(numeros,0);
    System.out.println(Arrays.toString(numeros));
    // Cambia los valores entre las posiciones 4º y 8º a 1.
    Arrays.fill(numeros, 4, 8, 1);
    System.out.println(Arrays.toString(numeros));
    // *Usar una única sentencia para cada apartado.

  }

  public static void ejercicio06() {
    System.out.println("\nEjercicio 6");

    // Copia el valor del array numeros dentro de un nuevo array llamado copia.
    int[] numeros = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365};
    int[] copia1 = new int[numeros.length];
    
    System.arraycopy(numeros, 0, copia1, 0, copia1.length);
    int[] copia2 = Arrays.copyOf(numeros, numeros.length);
    
    System.out.println(Arrays.toString(numeros));
    System.out.println(Arrays.toString(copia1));
    System.out.println(Arrays.toString(copia2));

  }

}
