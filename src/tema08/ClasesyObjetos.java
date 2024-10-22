package tema08;

import org.junit.*;

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
    // Assert.assertEquals(0,nave.getMasa());
    // Assert.assertEquals("velocidad = 0", 0, nave.getVelocidad());
    // Assert.assertEquals(0,nave.getPosicion()[0]);
    // Assert.assertEquals(0,nave.getPosicion()[1]);
    // int[] expectedPos = {0,0};
    // Assert.assertArrayEquals(expectedPos, nave.getPosicion());
    // Assert.assertEquals(0, nave.getMasa());
    // Assert.assertEquals(0, nave.getEscudos());
    // Assert.assertEquals(0, nave.getPropulsion());
    // Assert.assertEquals(50, nave.setPropulsion(50));
    // Assert.assertEquals(30, nave.setEscudos(30));
    // int totalEnergia = nave.getEscudos() + nave.getPropulsion();
    // Assert.assertTrue(totalEnergia < 100);
    // Assert.assertEquals(70, nave.setPropulsion(80));
    // Assert.assertEquals(70,nave.setPropulsion(800));
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
    // Assert.assertEquals(0,nave.getEnergia());
    // nave.repostar(1000);
    // Assert.assertEquals(1000, nave.getEnergia());
    // Assert.assertEquals(1000, nave.getEnergia());
    // Assert.assertEquals(500, nave.consumirEnergia(500));
    // Assert.assertEquals(0, nave.consumirEnergia(501));

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
    // carguero.repostar(1000001);
    // Assert.assertEquals(1000000, carguero.getEnergia());
    // carguero.cargar(500000);
    // Assert.assertEquals(1000000, carguero.getMasaTotal());
    // Assert.assertEquals(500000, carguero.getCarga());
    // carguero.descargar(250000);
    // Assert.assertEquals(250000, carguero.getCarga());

    // Assert.assertEquals(20, carguero.setEscudos(30));
    // Assert.assertEquals(999980, carguero.getEnergia());
    // carguero.setPropulsion(40);
    // Assert.assertEquals(999190, carguero.getEnergia());

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

    // Descomentar para probar
    Carguero carguero = null;
    // Assert.assertEquals(carguero.getNombre(), "USG Ishimura");
    // Assert.assertNotNull(" != null",carguero);
    // Assert.assertEquals("velocidad = 0", 0, carguero.getVelocidad());
    // Assert.assertEquals(0,carguero.getPosicion()[0]);
    // Assert.assertEquals(0,carguero.getPosicion()[1]);
    // int[] expectedPos = {0,0};
    // Assert.assertArrayEquals(expectedPos, carguero.getPosicion());
    // Assert.assertEquals(0, carguero.getCarga());
    // Assert.assertEquals(0, carguero.getEscudos());
    // Assert.assertEquals(0, carguero.getPropulsion());


    // Descomentar para probar
    carguero = null;
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

    // NaveEspacial.reiniciarContador();

    // NaveEspacial naveComercial = new NaveComercial();
    // NaveEspacial carguero = new Carguero("USG Ishimura");

    // Assert.assertEquals(naveComercial.getNumSerie(), "COM0");
    // Assert.assertEquals(carguero.getNumSerie(), "CA1");

  };

   /*
   * Completar el metodo getTalla para que devuelva un entero correspondiente
   * a la talla
   */
  
  enum Talla{
      S, M, L, XL;

      int getTalla(){
        return 0;
      }
    }
  
  public static void ejercicio06() {
    System.out.println("\nEjercicio 6");

    System.out.println("La talla M es: "+Talla.M.getTalla());
  }

  /**
   *  Crear un record para Cliente con los siguientes atributos: nombre, email y saldo

   */

  public static void ejercicio07() {
    System.out.println("\nEjericio 7");

    // Cliente cliente = new Cliente("Robert Noyce","r.noyce@farichild.com", 100000);

    // System.out.println("Creado el cliente: "+cliente);

  }
  
  /*
   * Sobre la clase cliente creada, anadir un constructor
   * no canonico que acepte nombre, email dejando el saldo a 0.
   */
  public static void ejercicio08(){
    System.out.println("\nEjericio 8");

    // Cliente cliente = new Cliente("Robert Noyce","r.noyce@farichild.com", 100000);

    // System.out.println("Creado el cliente: "+cliente);

  }

}
