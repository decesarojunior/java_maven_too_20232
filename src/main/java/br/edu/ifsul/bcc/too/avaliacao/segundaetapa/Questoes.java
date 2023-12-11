
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author telmo
 */
public class Questoes {
    
    protected Questoes(){
        
        printBovinos(generatesBovinos());
    }
    
    public Collection<Bovino> generatesBovinos(){
        
        Collection<Bovino> ret = new ArrayList();
        /*
            Bovino
            id: 1
            data_inicio: 01/03/2022           
            data_fim: 01/10/2022
            situacao: VIVO
            peso_chegada: 150,10
            valor_kg_compra: 14,20
            valor_kg_venda : 9,10
            raca = {codigo:1, nome: Devon}
            custo_diario = 1,00
            Pesagens:
                    1º
                    - Data: 01/05/2022
                    - Peso: 190,00
                    2º
                    - Data: 01/10/2022
                    - Peso: 350,00
            peso_atual: ***<obter através do acesso a última pesagem>
            valor_liquido = ***calcular
        
        
        */
        
        Bovino b = new Bovino();
            b.setId(1);
            b.setData_inicio("01/03/2022");
            b.setData_fim("01/10/2022");
            b.setSituacao(Situacao.VIVO);
            b.setPeso_chegada(150.10f);
            b.setValor_kg_compra(14.20f);
            b.setValor_kg_venda(9.10f);
            Raca r = new Raca(1, "Devon");
            b.setRaca(r);
            b.setCusto_diario(1.00f);
            b.setPesagem(new Pesagem("01/05/2022", 190f));
            b.setPesagem(new Pesagem("01/10/2022", 350f));
            b.setPeso_atual( ((Pesagem) ((ArrayList) b.getPesagens()).get(b.getPesagens().size() - 1)).getPeso());
            System.out.println("dif: "+(b.getData_fim().get(Calendar.DAY_OF_YEAR) - b.getData_inicio().get(Calendar.DAY_OF_YEAR)));
            b.setValor_liquido(
                        ((b.getPeso_atual() * b.getValor_kg_venda()) -
                         ((b.getData_fim().get(Calendar.DAY_OF_YEAR) - b.getData_inicio().get(Calendar.DAY_OF_YEAR) * b.getCusto_diario()) +        
                         (b.getPeso_chegada() * b.getValor_kg_compra()))      
                        )
            );
            
        ret.add(b);
        /*
        Bovino
            id: 2
            data_inicio: 01/02/2022           
            data_fim: 01/10/2022    
            situacao: VIVO
            peso_chegada: 175,00
            valor_kg_compra: 10,00
            valor_kg_venda : 9,00
            raca = {codigo:1, nome: Devon}
            custo_diario = 0,95            
            Pesagens:
                    1º
                    - Data: 01/04/2022
                    - Peso: 200,00
                    2º
                    - Data: 01/10/2022
                    - Peso: 345,5
            peso_atual: <obter através do acesso a última pesagem>
            valor_liquido = ***calcular
        */          
        
        b = new Bovino();
            b.setId(2);
            b.setData_inicio("01/02/2022");
            b.setData_fim("01/10/2022");
            b.setSituacao(Situacao.VIVO);
            b.setPeso_chegada(175.00f);
            b.setValor_kg_compra(10.00f);
            b.setValor_kg_venda(9.00f);
            b.setRaca(r);
            b.setCusto_diario(0.95f);
            b.setPesagem(new Pesagem("01/04/2022", 200f));
            b.setPesagem(new Pesagem("01/10/2022", 345.5f));
            b.setPeso_atual( ((Pesagem) ((ArrayList) b.getPesagens()).get(b.getPesagens().size() - 1)).getPeso());
            b.setValor_liquido(
                        ((b.getPeso_atual() * b.getValor_kg_venda()) -
                         ((b.getData_fim().get(Calendar.DAY_OF_YEAR) - b.getData_inicio().get(Calendar.DAY_OF_YEAR) * b.getCusto_diario()) +        
                         (b.getPeso_chegada() * b.getValor_kg_compra()))      
                        )
            );
            
        ret.add(b);   
        
        /*
        Bovino
            id: 3
            data_inicio: 01/01/2022           
            data_fim: 01/10/2022
            situacao: VIVO
            peso_chegada: 150,00
            peso_atual: ***<obter através do acesso a última pesagem>
            valor_kg_compra: 10,00
            valor_kg_venda : 9,00
            raca = {codigo:1, nome: Devon}
            custo_diario = 0,90
            valor_liquido = ( (peso_atual * valor_kilo_venda) -
                           (((data_fim - data_inicio) * custo_diario) + 
                           (peso_chegada * valor_kilo_compra))
            Pesagens:
                    1º
                    - Data: 01/03/2022
                    - Peso: 170,00
                    2º
                    - Data: 01/10/2022
                    - Peso: 370,5
        */

        b = new Bovino();
            b.setId(3);
            b.setData_inicio("01/01/2022");
            b.setData_fim("01/10/2022");
            b.setSituacao(Situacao.VIVO);
            b.setPeso_chegada(150.00f);
            b.setValor_kg_compra(10.00f);
            b.setValor_kg_venda(9.00f);
            b.setRaca(r);
            b.setCusto_diario(0.90f);
            b.setPesagem(new Pesagem("01/03/2022", 170f));
            b.setPesagem(new Pesagem("01/10/2022", 370.5f));
            b.setPeso_atual( ((Pesagem) ((ArrayList) b.getPesagens()).get(b.getPesagens().size() - 1)).getPeso());
            b.setValor_liquido(
                        ((b.getPeso_atual() * b.getValor_kg_venda()) -
                         ((b.getData_fim().get(Calendar.DAY_OF_YEAR) - b.getData_inicio().get(Calendar.DAY_OF_YEAR) * b.getCusto_diario()) +        
                         (b.getPeso_chegada() * b.getValor_kg_compra()))      
                        )
            );
            
        ret.add(b); 
            
        return ret;
    }
    
    /*
        1) Implemente no pacote br.edu.ifsul.bcc.too.avaliacao.segundaetapa.semestre_2023_2
           as classes necessárias para a questão 2, conforme diagrama de classes ilustrado
           na Figura 1. Cada classe codificada deverá ter ser atributos encapusalods e ao menos
           um construtor.
    */
    
    /*
        2) Implemente em java um método que retorne uma coleção de Bovinos com os seguintes dados.
            As datas devem ser convertidas de String para Calendar (inicio e fim do Bovino) e de 
            String para java.util.Date (data da pesagem)
            O peso atual deve ser setado através do acesso ao último elemento da coleção de pesagem.
            O valor liquido deverá ser calculado conforme a fórmula: 
                            ( 
                             (peso_atual * valor_kilo_venda) -
                             (
                                ((data_fim - data_inicio) * custo_diario) + 
                                (peso_chegada * valor_kilo_compra)
                             )
            Dica: para calcular o intervalo de dias entre duas datas, uma opção é utilizar o Calendar.DAY_OF_YEAR                  
    */
    
    /*
    3) Método que receba por parâmetro uma coleção de Bovino. 
       Imprima na sáida padrão as seguintes informações para cada elemento da coleção:
       id e valor liquido. 
       Saída experada:
            id           : 1
            Valor liquido: 1439.9802
            id           : 2
            Valor liquido: 1115.9
            id           : 3
            Valor liquido: 1561.4
        
    
    */
    
    public void printBovinos(Collection<Bovino> bois){
         //Collections.sort((ArrayList)bois);
         for(Bovino b : bois){
             System.out.println("id           : "+b.getId());
             System.out.println("Valor liquido: "+b.getValor_liquido());
         }
    }
    
    public static void main(String args[]){
        new Questoes();
    }
    
}
