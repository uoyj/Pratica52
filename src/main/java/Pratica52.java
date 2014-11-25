
import utfpr.ct.dainf.if62c.pratica.CoeficienteException;
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        try{
            Equacao2Grau<Integer> e1 = new Equacao2Grau<>(7,8,1);
            Equacao2Grau<Integer> e2 = new Equacao2Grau<>(1,2,1);
            Equacao2Grau<Integer> e3 = new Equacao2Grau<>(1,1,1);
            System.out.println(e1.getRaiz1());
            System.out.println(e1.getRaiz2());
            System.out.println(e2.getRaiz1());
            System.out.println(e2.getRaiz2());
            System.out.println(e3.getRaiz1());
            System.out.println(e3.getRaiz2());
        }catch(RuntimeException e)
        {
            System.out.println("Atenção: "+e.getLocalizedMessage());
        }
        
    }
}
