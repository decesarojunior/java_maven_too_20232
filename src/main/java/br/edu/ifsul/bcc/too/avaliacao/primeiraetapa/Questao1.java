
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Questao1 {
    
    public Questao1(String param){
    
        Collection<Integer> rt = extracaoInteiros(param);  
        imprime(rt);
        
    }
    
    private void imprime(Collection<Integer> param){
    
        System.out.println(param);
    }
    
    private Collection<Integer> extracaoInteiros(String param){
    
        Collection<Integer> retorno = null;
        
        retorno = new ArrayList();
        
        String partes[] = param.split(",");
        for(String p : partes){
            //System.out.println(p);
            //[{codigo: 123}
            p = p.substring(p.indexOf(":")+2, p.indexOf("}"));
            //System.out.println("\t" + p);
            Integer i = Integer.valueOf(p);
            retorno.add(i);
        }
        
        
        
        return retorno;
        
    }
    
    public static void main(String[] args) {
        String json= "[{codigo: 123}, {codigo: 0}, {codigo: 59}], {codigo: 15888}]";
        new Questao1(json);
    }
    
}
