
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Bovino implements Comparable<Bovino>{
    
    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private Float peso_chegada;
    private Float peso_atual;
    private Float valor_kg_compra;
    private Float valor_kg_venda;
    private Float custo_diario;
    private Float valor_liquido;
    
    private Collection<Pesagem> pesagens;
    private Situacao situacao;
    private Raca raca;
    
    private SimpleDateFormat sdf;
    
    public Bovino(){
        
         sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data_inicio
     */
    public Calendar getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }
    
    public void setData_inicio(String data_inicio) {
        try{
    
            this.data_inicio = Calendar.getInstance();
            this.data_inicio.setTimeInMillis(sdf.parse(data_inicio).getTime());
        
        }catch(Exception e){
            
            this.data_inicio = null;
            e.printStackTrace();
             
        }
        
    }

    /**
     * @return the data_fim
     */
    public Calendar getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }
    
    public void setData_fim(String data_inicio) {
        try{
    
            this.data_fim = Calendar.getInstance();
            this.data_fim.setTimeInMillis(sdf.parse(data_inicio).getTime());
        
        }catch(Exception e){
            
            this.data_fim = null;
            e.printStackTrace();
        }
        
    }

    /**
     * @return the peso_chegada
     */
    public Float getPeso_chegada() {
        return peso_chegada;
    }

    /**
     * @param peso_chegada the peso_chegada to set
     */
    public void setPeso_chegada(Float peso_chegada) {
        this.peso_chegada = peso_chegada;
    }

    /**
     * @return the peso_atual
     */
    public Float getPeso_atual() {
        return peso_atual;
    }

    /**
     * @param peso_atual the peso_atual to set
     */
    public void setPeso_atual(Float peso_atual) {
        this.peso_atual = peso_atual;
    }

    /**
     * @return the valor_kg_compra
     */
    public Float getValor_kg_compra() {
        return valor_kg_compra;
    }

    /**
     * @param valor_kg_compra the valor_kg_compra to set
     */
    public void setValor_kg_compra(Float valor_kg_compra) {
        this.valor_kg_compra = valor_kg_compra;
    }

    /**
     * @return the valor_kg_venda
     */
    public Float getValor_kg_venda() {
        return valor_kg_venda;
    }

    /**
     * @param valor_kg_venda the valor_kg_venda to set
     */
    public void setValor_kg_venda(Float valor_kg_venda) {
        this.valor_kg_venda = valor_kg_venda;
    }

    /**
     * @return the custo_diario
     */
    public Float getCusto_diario() {
        return custo_diario;
    }

    /**
     * @param custo_diario the custo_diario to set
     */
    public void setCusto_diario(Float custo_diario) {
        this.custo_diario = custo_diario;
    }

    /**
     * @return the valor_liquido
     */
    public Float getValor_liquido() {
        return valor_liquido;
    }

    /**
     * @param valor_liquido the valor_liquido to set
     */
    public void setValor_liquido(Float valor_liquido) {
        this.valor_liquido = valor_liquido;
    }

    /**
     * @return the pesagens
     */
    public Collection<Pesagem> getPesagens() {
        
        return pesagens;
    }

    /**
     * @param pesagens the pesagens to set
     */
    public void setPesagens(Collection<Pesagem> pesagens) {
        this.pesagens = pesagens;
    }
    
    public void setPesagem(Pesagem pesagem) {
        if(this.pesagens == null)
            this.pesagens = new ArrayList();
        this.pesagens.add(pesagem);
    }

    /**
     * @return the situacao
     */
    public Situacao getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the raca
     */
    public Raca getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    @Override
    public int compareTo(Bovino t) {
        return t.valor_liquido.compareTo(this.valor_liquido);
    }
    
    
    
}
