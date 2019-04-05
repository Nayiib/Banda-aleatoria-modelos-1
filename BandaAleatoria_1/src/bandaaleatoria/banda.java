/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

/*import java.util.Arrays
import java.util.LinkedList;*/
/**
 *
 * @author Álvaro
 */
public class banda {

    private int musicosdisponibles;

    public int crearbanda(int x) {
        for (int i = 0; i < x; i++) {
            

        musico mus = new musico();

        if (mus.isDisponibilidad() == true) {
            mus.SetInstrumento();
            System.out.println(mus.getNombre() + ":" + "\n    -Tiene el instrumento " + mus.getInstrumento() + "\n    -" + mus.AfinarInstrumento());
        } else {
            System.out.println("El " + mus.getNombre() + " no esta disponible");
        }
        }
        return (x);
    }

    public void TocarConcierto() {
        
        System.out.println("♩	♩♫Tocando Concierto♫♩	♩");
    }
}
