package Modelo;

import Modelo.juegoDados;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoDadosTest {

    @Test
    public void testJuegoDadosLanzaYSuma() {
        juegoDados juego = new juegoDados();
        juego.jugar();

        int dado1 = juego.getValorDado1();
        int dado2 = juego.getValorDado2();
        int suma = juego.getSuma();

        assertTrue(dado1 >= 1 && dado1 <= 6, "Dado 1 fuera de rango");
        assertTrue(dado2 >= 1 && dado2 <= 6, "Dado 2 fuera de rango");
        assertEquals(dado1 + dado2, suma, "La suma no coincide");
    }
}
