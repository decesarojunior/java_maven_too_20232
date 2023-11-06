
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class Cliente extends Pessoa {
    
    private Calendar data_ultima_compra;
    private String observacoes;

    public Cliente() {
    }

    public Cliente(Calendar data_ultima_compra, String observacoes) {
        this.data_ultima_compra = data_ultima_compra;
        this.observacoes = observacoes;
    }
    
    

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
    
    
    
}
