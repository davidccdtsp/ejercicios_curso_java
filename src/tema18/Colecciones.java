package tema18;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Colecciones {

  /**
   * Crear el ArrayList cosas y añadir los siguientes
   * elementos: “casa”, “silla”, y “coche”.
   */
  public static void ejercicio01() {
    System.out.println("\nEjercicio 1");

    List<String> cosas = new ArrayList<>();
    // Collection<String> cosas = new ArrayList<>();

    cosas.addAll(List.of("casa", "silla", "coche"));

    // cosas.add("casa");
    // cosas.add("silla");
    // cosas.add("coche");

    System.out.println(cosas);

  }

  /**
   * Crear el ArrayList personas compuesto por: “Antonia”,
   * “Generoso y “Andrea”, crear otro ArrayList y combinar
   * cosas y personas en este.
   */
  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    Collection<String> cosas = Arrays.asList("casa", "silla", "coche"); // Tamano fijo, se pueden cambiar los elementos
    Collection<String> personas = List.of("Antonia", "Generoso", "Andrea"); // Inmutable
    Collection<String> mezcla = new ArrayList<String>();

    System.out.println(cosas);
    System.out.println(personas);

    mezcla.addAll(cosas);
    mezcla.addAll(personas);

    System.out.println(mezcla);

  }

  /** Eliminar todas las personas del array creado en el ejercicio anterior. */
  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");

    Collection<String> personas = List.of("Antonia", "Generoso", "Andrea"); // Inmutable
    Collection<String> mezcla = new ArrayList<String>(
        List.of("casa", "Antonia", "Generoso", "silla", "coche", "Andrea"));

    System.out.println(mezcla);

    mezcla.removeAll(personas);

    System.out.println(mezcla);

  }

  /**
   * Los siguientes dnis se asocian a los siguientes nombres:
   * 123445 - Deng Waldell, 343523 - Pana Melnau y 87643321W - Tinon Bite
   * 
   * Crear un Map y almacenar estos valores.
   * Recuperar el nombre asociado al valor 123445.
   * 
   */

  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");

    Map<String, String> mapPersonas = new HashMap<>();

    mapPersonas.put("123445", "Deng Waldell");
    mapPersonas.put("343523", "Pana Melnau");
    mapPersonas.put("87643321W", "Tinon Bite");

    // Map<String, String> mapPersonas = new HashMap<>() {
    //   {
    //     put("123445", "Deng Waldell");
    //     put("343523", "Pana Melnau");
    //     put("87643321W", "Tinon Bite");
    //   }
    // };

    System.out.println(mapPersonas);

    var persona = mapPersonas.get("123445");

    System.out.println(persona);

  }

}
