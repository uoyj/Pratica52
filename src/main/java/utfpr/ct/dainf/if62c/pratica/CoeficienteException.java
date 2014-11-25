/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;
/**
 *
 * @author Jhonatan
 */
public class CoeficienteException extends RuntimeException {
    
    private final Number a;

    public CoeficienteException(Number a) {
        super(String.format(
            "Coeficiente a não pode ser zero"));
        this.a = a;
    }
            
    public Number getCoeficiente(){
        return a;
    }

}
