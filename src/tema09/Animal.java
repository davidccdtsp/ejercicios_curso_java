package tema09;

import java.util.Random;

public class Animal {

  String nombre;
  final TipoAnimal tipo;
  private int energia = 100;

  public Animal(String nombre, TipoAnimal tipo){
    this.nombre = nombre;
    this.tipo = tipo;
  }

  protected void habla(){
    System.out.println("Animal hace ruido");
  }

  public int comer(int calorias){
    return energia =+ calorias;
  }

  final int consumirEnergia(int calorias){
    return energia -= calorias;
  }

  public static boolean compatibles(Animal animal1, Animal anial2){
    Random random = new Random(); // Genera un booleano al hazar
    return random.nextBoolean();
  }
  
}
