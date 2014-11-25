/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Jhonatan
 * @param <N>
 */
public class Equacao2Grau<N extends Number> {
    private N a;
    private N b;
    private N c;

    public Equacao2Grau (N a, N b, N c){
        if(a.intValue() == 0) 
            throw new CoeficienteException(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public N getA() {
        return a;
    }

    public void setA(N a) throws RuntimeException {
        if(a.intValue() == 0) throw new RuntimeException("Coeficiente nao pode ser zero.");
        else this.a = a;
    }

    public N getB() {
        return b;
    }

    public void setB(N b) {
        this.b = b;
    }

    public N getC() {
        return c;
    }

    public void setC(N c) {
        this.c = c;
    }
    
    public double getRaiz1() throws RuntimeException
    {
        double raiz1 = b.doubleValue()*b.doubleValue() - 4*a.doubleValue()*c.doubleValue();
        if( raiz1 < 0) throw new RuntimeException("Sem solução real");
        
        else raiz1 = Math.sqrt(raiz1);
        raiz1 = -1.0*b.doubleValue() + raiz1;
        raiz1 = raiz1/(2*a.doubleValue());
        return raiz1;
    }
    
    public double getRaiz2 () throws RuntimeException
    {
        double raiz2 = b.doubleValue()*b.doubleValue() - 4*a.doubleValue()*c.doubleValue();
        if( raiz2 < 0) throw new RuntimeException("Sem solução real");
        
        else raiz2 = Math.sqrt(raiz2);
        raiz2 = -1.0*b.doubleValue() - raiz2;
        raiz2 = raiz2/(2*a.doubleValue());
        return raiz2;
    }
    
}
