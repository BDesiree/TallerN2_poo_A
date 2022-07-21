package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.*;
import ec.edu.intsuperior.modelo.*;

/**
 *
 * @author User
 */
public class Aplicacion {

    public static void main(String[] args) {
        Animales h1 = new Animales();
        h1.seresVivos();

        Redes r1 = new Redes();
        r1.sistemaCartuchos();

        Placas pl1 = new Placas();
        pl1.placaCpu();
    
       Operadoras op1 =new Operadoras();
        op1.tuentiMejor();
    }
}
