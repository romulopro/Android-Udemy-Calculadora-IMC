package br.com.romulo.primeiroapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        double altura = 2, peso = 96;


        double imc = peso/(altura*altura);
        assertEquals(24, imc, 0.002);
    }


}