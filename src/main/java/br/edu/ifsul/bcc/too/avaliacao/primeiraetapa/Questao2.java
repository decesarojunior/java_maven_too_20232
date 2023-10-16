
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.util.Collection;
import java.util.TreeSet;

/**
 *
 * @author telmo
 */
public class Questao2 {
    
    private String[] dados = {"80", "1500", "b", "-2", "c", "-50", "22", "6"};
    
    public Questao2(){
        
        classificacao();
    }
    
    private void classificacao(){
        
        Collection<Integer> rt = new TreeSet();
        
        for(String p : dados){
            
            try{
                Integer i = Integer.valueOf(p);
                rt.add(i);
                
            }catch(Exception e){
                //se ocorrer um erro na conversaao
                //utiliza a informacao zero.
                rt.add(0);
                
            }
        }
        
        System.out.println(rt);
        
    }
    public static void main(String[] args) {
        
        new Questao2();
    }

}
