package tema09;

public class Herencia {

  /*
   * Tomando como base la Clase animal, crear las siguientes subclases Gato -> atributos String
   * raza, metodo aranha y debera generar "Miau" al hablar Gallina -> atributos String colorPlumas,
   * metodo vuela() y deberia generar "Cocoroco" al hablar
   */
  public static void ejercicio01() {
    System.out.println("\n\nTema 9");
    System.out.println("\nEjercicio 1");
    
    Gato gato = new Gato("Michi","Mestizo");
    Gallina gallina = new Gallina("Blanquita","blanco");
    
    gato.habla();
    gato.arana();
    gallina.vuela();
    gallina.habla();

  }


  /**
   * Todos los animales duermen, implementar los cambios. El metodo mostrara un mensaje por terminal
   * indicando que el Animal X duerme
   */
  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");
    
    Gato gato = new Gato("Michi","Mestizo");
    Gallina gallina = new Gallina("Blanquita","blanco");
    
    gato.duerme();
    gallina.duerme();

  }

  /*
   * Los animales se mueven, pero cada uno consume una cantidad de energia los gatos consumen 1.5
   * calorias por metro, las gallinas 0.9 implementar los cambios oportunos
   */
  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");
    
    Animal gato = new Gato("Michi","Mestizo");
    Animal gallina = new Gallina("Blanquita","blanco");

    System.out.println(gato);
    System.out.println(gallina);

    gato.mueve(10);
    gallina.mueve(20);

    System.out.println(gato);
    System.out.println(gallina);

  }

  /**
   * Si un animal se queda sin energia se morira, aplicar los cambios para que se muestre un mensaje
   * por pantalla si el animal muere
   */
  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");
    
    Animal gato = new Gato("Michi","Mestizo");
    Animal gallina = new Gallina("Blanquita","blanco");
    
    gato.mueve(10);
    gallina.mueve(1000);
    

  }

  /**
   * Crear tres animales y usar el metodo estatico de la clase Animal para ver si son compatibles
   * como mascotas
   */
  public static void ejercicio05() {
    System.out.println("\nEjercicio 5");

    // Descomentar el codigo
     Gato michi = new Gato("Michi","Mestizo");
     Gallina gallina = new Gallina("Blanquita","blanco");
     Animal gato = michi;
     Animal caiman = new Animal("Croc",TipoAnimal.REPTIL);
     
     boolean res = Animal.compatibles(michi, gallina);
     System.out.println(michi.nombre+" y "+gallina.nombre+" compatibles = "+res);
     res = Animal.compatibles(michi, gato);
     System.out.println(michi.nombre+" y "+gato.nombre+" compatibles = "+res);
     Animal.compatibles(gallina, gato);
     System.out.println(gallina.nombre+" y "+gato.nombre+" compatibles = "+res);
     Animal.compatibles(caiman, gato);
     System.out.println(caiman.nombre+" y "+gato.nombre+" compatibles = "+res);
  }

  /**
   * Sobreescribir el metodo toString()
   */
  public static void ejercicio06() {
    System.out.println("\nEjercicio 6");

    Animal gato1, gato2, gallina;
    gato1 = new Gato("Michi","Mestizo");
    gato2 = new Gato("Michu","Persa");
    gallina = new Gallina("Blanquita","blanco");

    // Descomentar el codigo
     System.out.println(gato1);
     System.out.println(gato2);
     System.out.println(gallina);

  }

  /*
   * Sobreescribir le metodo equals() y probarlo
   * 
   */
  public static void ejercicio07(){
    System.out.println("\nEjercicio 7");
    
    Gato michi = new Gato("Michi","Mestizo");
    Gallina gallina = new Gallina("Blanquita","blanco");
    Animal gato = new Animal("Michi",TipoAnimal.MAMIFERO);
    
    System.out.println(michi.nombre+" == "+gallina.nombre+" -> "+michi.equals(gallina));
    System.out.println(michi.nombre+" == "+gato.nombre+" -> "+michi.equals(gato));

  }

  /*
   * Sobreescrir el metoo clone
   */
  public static void ejercicio08(){
    System.out.println("\nEjercicio 8");
    
    Animal animal = new Animal("Dolly", TipoAnimal.MAMIFERO);
    Animal dolly = animal.clone();
    
    System.out.println(animal+" "+animal.hashCode());
    System.out.println(dolly+" "+dolly.hashCode());

  }

}
