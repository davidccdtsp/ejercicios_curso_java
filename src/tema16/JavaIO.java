package tema16;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaIO {

  final String PATH = "";

  /*
   * Crear un el directorio ejemplo1 y el fichero ejemplo1/fichero1.
   */
  public static void ejercicio01(){
    System.out.println("\n\nTema 16: Java IO/API");
    System.out.println("Ejercicio 1");
  }

  /**
   * Escribir una cadena de texto en el fichero y realziar una copia de este
   */
  public static void ejercicio02(){
    System.out.println("Ejercicio 2");

    // final String URI1 = "path a fichero origen";
    // Path path = Paths.get(URI1);
    // // Copiando fichero
    // try {
    //   Files.writeString(path, "Texto de ejemplo", StandardCharsets.UTF_8);
    // } catch (IOException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }

  }

  /*
   * Crear un nuevo directorio ejemplo3 y mover el fichero copiado a esa localización.
   */

  public static void ejercicio03(){
    System.out.println("Ejercicio 3");
  }
  
}
