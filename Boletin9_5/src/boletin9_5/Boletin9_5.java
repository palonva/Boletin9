/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

/**
 *
 * @author palonsovazquez
 */
public class Boletin9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Serializador serie = new Serializador(Peticiones.pedirNumIntFiltrado("cuantos de cuantos numeros se compone la serie.", Peticiones.POSITIVO));
      serie.seriePares();
      serie.serieAlternarNeg();
      serie.fibonacci();
    }
    
}
