
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author telmo
 */
public class Questao3 {
    
    private Questao3() {
        
        datas();
    }
    
    private void datas(){
        
        Set<Calendar> lst = new TreeSet();
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
        
        String vt[] = {"17:20:00", "18:20:00", "19:20:00", "06:00:00", "02:59:00"};
        
        for(String d : vt){
           
            try {
                //converter de java.util.Date para java.util.Calendar
                Calendar c = Calendar.getInstance();
                c.setTimeInMillis(ft.parse(d).getTime());
                lst.add(c);
            } catch (ParseException ex) {
               ex.printStackTrace();
            }
            
        }
       /* alternativa 1:  
       Calendar temp = null; 
       for(Calendar cld : lst){  
           temp = cld;
       }
        */
       // temp vai ser a ultima data (é a maior)
       
       //alternativa 2
        List<Calendar> cllc = new ArrayList();
        cllc.addAll(lst);
        System.out.println(ft.format(cllc.get(cllc.size() - 1).getTime()));
    }
    
    public static void main(String args[]) {
        new Questao3();
    }
}
