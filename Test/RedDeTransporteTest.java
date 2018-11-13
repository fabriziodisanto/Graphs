import org.junit.Test;

import static org.junit.Assert.*;

public class RedDeTransporteTest {

    @Test
    public void cargarRed(){
        RedDeTransporte<String> redDeTransporte = new RedDeTransporte<>("a", "z");
        redDeTransporte.agregarVertice("c");
        redDeTransporte.agregarVertice("d");
        redDeTransporte.agregarVertice("e");
        redDeTransporte.agregarVertice("f");

        redDeTransporte.agregarCapacidadLado(0,2,16);
        redDeTransporte.agregarCapacidadLado(0,3,13);
        redDeTransporte.agregarCapacidadLado(2,3,10);
        redDeTransporte.agregarCapacidadLado(3,2,4);
        redDeTransporte.agregarCapacidadLado(2,4,12);
        redDeTransporte.agregarCapacidadLado(4,3,9);
        redDeTransporte.agregarCapacidadLado(3,5,14);
        redDeTransporte.agregarCapacidadLado(5,4,7);
        redDeTransporte.agregarCapacidadLado(4,1,20);
        redDeTransporte.agregarCapacidadLado(5,1,4);
        redDeTransporte.imprimirMatriz(redDeTransporte.matrizCapacidad());
        System.out.println("------------------------------------------");
        redDeTransporte.imprimirMatriz(redDeTransporte.matrizFlujo());
        System.out.println("------------------------------------------");
        System.out.println(redDeTransporte.fordFulkerson());


    }

}