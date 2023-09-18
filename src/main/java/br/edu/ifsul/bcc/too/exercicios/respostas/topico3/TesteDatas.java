
package br.edu.ifsul.bcc.too.exercicios.respostas.topico3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author telmo
 */
public class TesteDatas {

    private Calendar dataCalendar;//atributo da instância
    
    private Date dataDate;
    
    private SimpleDateFormat formatador;
    
    public TesteDatas() { // cosntrutor
        
        System.out.println("Testes com datas::");
        
        dataCalendar = Calendar.getInstance();//inicialização de um Calendar
        
        dataCalendar.set(Calendar.DAY_OF_MONTH, 12); // altera data.
        dataCalendar.set(Calendar.YEAR, 1983);
        dataCalendar.set(Calendar.MONTH, 0);
        
        formatador = new SimpleDateFormat("dd/MM/yyyy");//inicaliza e defini o formato
                
        String data_formatada = formatador.format(dataCalendar.getTime()); // formata
        
        System.out.println(data_formatada); // imprimi a data formatada.
        System.out.println("Data em milisegundos: "+dataCalendar.getTimeInMillis());
        
        dataDate = new Date(); // inicializacao do atributo. 
        System.out.println(dataDate);
        data_formatada = formatador.format(dataDate); // formata
        System.out.println("data_formatada (java.util.Date) : "+data_formatada);
        System.out.println("data java.util.Date em milis: "+dataDate.getTime());
        
        //Exercicio 1 : imprimir a diferença em milis e em dias entre dataDate e dataCalendar.
        
        long miliCalendar = dataCalendar.getTimeInMillis();
        long miliDate = dataDate.getTime();
        
        long qtdDias = (miliDate - miliCalendar) / 86400000L;
        System.out.println("Diferenca em dias: "+qtdDias);
        
        //Exercicio 2 : utilizar o método compareTo da classe Calendar para testar duas datas
        //e explicar os retornos: -1, 0 e 1.
        
        System.out.println("data maior   - retorno 1 : " + dataDate.compareTo(dataCalendar.getTime()));
        System.out.println("datas iguais - retorno 0 : " + dataDate.compareTo(dataDate));
        //System.out.println("data menor   - retorno -1: "+dataCalendar.compareTo(dataDate));
        //converter de java.util.Date para java.util.Calendar.
        
        Calendar calendar_teste = Calendar.getInstance();
          
          
        try {
            //Exercicio 3: converter a string  "25/09/1983" para java.util.Calendar
             //Exercicio 4: converter a string "25/09/1983" para java.util.Date
             
            //conversao para java.util.Date 
            java.util.Date dt = formatador.parse("25/09/1983");
            

            //agora tem que converter de Date para Calendar.
            calendar_teste.setTime(dt);
            
            //inicialização do tipo java.util.Calendar
            Calendar calendar_teste_2 = Calendar.getInstance();
            
            //setando o Date no Calendar
            calendar_teste_2.setTime(formatador.parse("25/09/1983"));
                    
           
        } catch (ParseException ex) {
            System.out.println("erro: "+ex.getLocalizedMessage());
            ex.printStackTrace();
        }
        
        
    }
    
    public static void main(String[] args){
        
        new TesteDatas();//criacao da instância.
    }
    
}
