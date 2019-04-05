/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

import java.util.Random;

/**
 *
 * @author Álvaro
 */
public class instrumento {

    public static String InstrumentoAleatorio() {
        Random n = new Random();
        int numero = n.nextInt(6) + 1;

        switch (numero) {
            case 1:
                return "guitarra";
            case 2:
                return "trompeta";
            case 3:
                return "bateria";
            case 4:
                return "flauta";
            case 5:
                return "violin";
            default:
                return "piano";
            

        }

    }
}
