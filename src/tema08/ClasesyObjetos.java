package tema08;

import org.junit.Assert;

public class ClasesyObjetos {

  /*
   * Completar la clase NaveEspacial que tenga las siguientes propieades - Nombre - PotenciaEscudos
   * (0%-100%) - PotenciaMotores (0%-100%) - Posicion (espacio bidimensional x,y) - Velocidad - Masa
   * 
   * Y los siguientes metodos: void setVelocidad(nuevaVelocidad) void setPosicion(x,y)
   * porcentajeNuevo activarEscudos(porcentaje) porcentajeNuevo propulsar(porcentaje)
   * 
   * String getNombre() int getVelocidad() int[] getPosicion() (x,y) int getEscudos() int
   * getPropulsion() int getMasa()
   * 
   * El nombre se pasa como parametro al constructor odas las propiedades son privadas. Todos los
   * metodos son public
   * 
   * Todas sus propiedades se inicializan a 0
   * 
   * El porcentaje de potencia destinada a los escudos y a los motores nunca podra exceder el 100%.
   * PotenciaEscudos + PotenciaMotores <= 100. Si los escudos estan consumiendo el 60% y demandamos
   * un 50% de motores, el ajuste que se producira sera solo hasta el 40%
   */

  public static void ejercicio01() {
    System.out.println("\n\nTema 8");
    System.out.println("\nEjercicio 1");


    NaveEspacial nave = null;
    // Descomentar para probar
    // Assert.assertNotNull(" != null",nave);
    // Assert.assertEquals(nave.getMasa(), 0);
    // Assert.assertEquals("velocidad = 0", 0, nave.getVelocidad());
    // Assert.assertEquals(nave.getPosicion()[0], 0);
    // Assert.assertEquals(nave.getPosicion()[1], 0);
    // int[] expectedPos = {0,0};
    // Assert.assertArrayEquals(nave.getPosicion(),expectedPos);
    // Assert.assertEquals(nave.getMasa(),0);
    // Assert.assertEquals(nave.getEscudos(), 0);
    // Assert.assertEquals(nave.getPorpulsion(), 0);
    // Assert.assertEquals(nave.setPropulsion(), 50);
    // Assert.assertEquals(nave.setEscudos(30),30);
    // int totalEnergia = nave.getEscudos() + nave.getPropusion();
    // Assert.assertTrue(totalEnergia < 100);
    // Assert.assertEquals(nave.setPropulsion(80), 70);
  };

  /*
   * Añadir la propiedad float energia visible para todas las sublcases y los siguientes metodos:
   * public int getEnergia() public void repostar(int cantidad) protected int consumirEnergia(int
   * cantiad), que devuelve la energia restante
   */
  public static void ejercicio02() {
    System.out.println("\nEjercicio 2");

    NaveEspacial nave = null;
    // Descomentar para probar
    // Assert.assertEquals(nave.getEnergia(), 0);
    // nave.repostar(1000));
    // Assert.assertEquals(1000, nave.repostar(1000));
    // Assert.assertEquals(nave.getEnergia(), 1000);
    // Assert.assertEquals(nave.consumirEnergia(500), 500);
    // Assert.assertEquals(nave.consumirEnergia(501), 0);

  };

  /**
   * Crear la clase Carguero la cual extiende a NaveEspacial
   * 
   * Esta clase tendra las siguientes constantes: ERNERGIA_MAX (energia maxima) = 1000000 MASA
   * (masa sin carga) = 500000 CARGA_MAX (carga maxima) = 750000
   * 
   * Modificar los metodos necesarios teniendo en cuenta las constantes
   * 
   * void cargar(cantidad) void descargar(cantidad) int getCarga() int getMasaTotal() (masa nave +
   * masa carga)
   * 
   * Sus escudos solo funcionan hasta el 20%
   * 
   * Cada vez que el carguero modifica su propulsion consume energia en base a la siguiente
   * ecuacion:
   * 
   * nuevaEnergia = energia - (| nuevaPropulsion - propulsion | + masaTotal/1000 )
   * 
   * La activacion de los escudos consume energia segun la siguiente ecuacion:
   * 
   * nuevaEnergia = energia - (| escudoAntes - escudos | * 1)
   */

  public static void ejercicio03() {
    System.out.println("\nEjercicio 3");

    Carguero carguero = null;
    // Descomentar para probar
    // Assert.assertEquals(carguero.getMasa(), 500000);
    // Assert.assertEquals(carguero.repostar(1000001), 1000000);
    // carguero.cargar(500000);
    // Assert.assertEquals(carguero.getMasaTotal(), 1000000);
    // Assert.assertEquals(carguero.getCarga(), 500000);
    // carguero.descargar(250000);
    // Assert.assertEquals(carguero.getCarga(), 250000);

    // Assert.assertEquals(carguero.setEscudos(30),20);
    // Assert.assertEquals(carguero.getEnergia(), 999970);
    // carguero.setPropulsion(40);
    // Assert.assertEquals(carguero.getEnergia(), 999740);

  };

  /*
   * Modificar la clase Carguero para que tenga un constructor que solo acepte el nombre y que
   * inicialice todos los valores a sus valores constantes y otro constructor que permitia
   * inicialiar la carga y la energia
   * 
   * Crear un segundo constructor que tenga como parametros el nombre
   * 
   * 
   */
  public static void ejercicio04() {
    System.out.println("\nEjercicio 4");


    // Carguero carguero = new Carguero("\"USG Ishimura");
    // Assert.assertEquals(carguero.getNombre(), "USG Ishimura");


    // Descomentar para probar
    // carguero = new Carguero("USG Ishimura",10000,20000);
    // Assert.assertNotNull(carguero);
    // Assert.assertEquals(carguero.getNombre(), "USG Ishimura");
    // Assert.assertEquals(carguero.getEnergia(), 10000);
    // Assert.assertEquals(carguero.getCarga(),20000);

  };

  /*
   * Añadir un número de serie único e inmutable para cada nave, el número de serie se genera del
   * siguiente modo:
   * 
   * TIPO + numero de nave
   * 
   * TIPO: - CA: carguero - COM: nave comercial
   * 
   * numero de nave es el resultado de un contador que se incrementa cada vez que se crea una nueva
   * nave
   * 
   * Incluir el metodo String getNumSerie()
   */

  public static void ejercicio05() {
    System.out.println("\nEjercicio 5");

    // NaveEspacial naveComercial = new NaveComercial();
    // NaveEspacial carguero = new Carguero("USG Ishimura");

    // Assert.assertEquals(naveComercial.getNumSerie(), "COM0");
    // Assert.assertEquals(carguero.getNumSerie(), "CA1");

  };

   /*
   * Completar el metodo getTalla para que devuelva un entero correspondiente
   * a la talla
   */
  public static void ejercicio06() {
    System.out.println("\nEjercicio 6");

    enum Talla{
      S, M, L, XL;

      int getTalla(){

        // switch(this) {
        //   case S: return 30;
        //   case M: return 32;
        //   case L: return 36;
        //   case XL: return 40;
        //   default: return 0;
        // }

        return 0;
      }
    }

    System.out.println("La talla M es: "+Talla.M.getTalla());
  }
  
  /*
   * Crear un record para Cliente con los siguientes atributos:
   *  - Nombre
   *  - email
   *  - saldo
   */
  public static void ejercicio07(){
    System.out.println("\nEjercicio 7");

    record Cliente(int a){};

    Cliente nuevo = new Cliente(2);

    System.out.println("Creado el cliente "+nuevo);

  }

  /*
   * Sobre la clase cliente creada, anadir un constructor
   * no canonico que acepte nombre, email dejando el saldo a 0.
   */
  public static void ejercicio08(){
    System.out.println("\nEjericio 8");

  }

}
