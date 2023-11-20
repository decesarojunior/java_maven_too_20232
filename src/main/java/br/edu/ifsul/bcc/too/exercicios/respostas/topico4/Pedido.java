
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Pedido {
    
    // atributos: codigo, data, valor_total, cliente.
    private Integer codigo;
    private Calendar data;
    private Float valor_total;
    private Cliente cliente; //associação
    private Collection<Produto> produtos; // agregação.
    

    public Pedido() {
        
    }

    public Pedido(Integer codigo, Calendar data, Float valor_total, Cliente cliente) {
        this.codigo = codigo;
        this.data = data;
        this.valor_total = valor_total;
        this.cliente = cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Float getValor_total() {
        return valor_total;
    }

    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void setProduto(Produto produto){
        if(this.produtos == null)
            this.produtos = new ArrayList();
        this.produtos.add(produto);
    }
    
    
    
    @Override
    public String toString(){
       String retorno = new String();
       
       retorno  = this.getCliente().getCpf()+" "+this.getCodigo()+ " ";
       
       retorno = retorno + this.getCliente().getData_nascimento_string();
        
       return retorno;
    }
    
    
}
