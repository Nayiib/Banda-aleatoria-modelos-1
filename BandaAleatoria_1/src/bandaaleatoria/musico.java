/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

import static bandaaleatoria.disponibilidad.getRandomBoolean;
import static bandaaleatoria.instrumento.InstrumentoAleatorio;

/**
 *
 * @author Álvaro
 */
public class musico {

    private static int Contador = 1;
    private String nombre;
    private String Instrumento;
    private boolean disponibilidad;
    
    musico() {
        nombre = "Musico " + String.valueOf(Contador);
        disponibilidad = getRandomBoolean();
        Contador++;
    }

    public void SetInstrumento() {
        this.Instrumento = InstrumentoAleatorio();
    }

    public String AfinarInstrumento() {
        return "Instrumento afinado";
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInstrumento() {
        return Instrumento;
    }
    
    

}
