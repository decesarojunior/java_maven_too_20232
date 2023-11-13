
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

/**
 *
 * @author telmo
 */
public class Produto {
    
    private Integer id;
    private String nome;
    private Float valor;
    private Collection<Foto> fotos;//agregacao por composicao.

    public Produto() {
    }

    public Produto(Integer id, String nome, Float valor, Collection<Foto> fotos) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.fotos = fotos;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Collection<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(Collection<Foto> fotos) {
        this.fotos = fotos;
    }
    
    //metodo adicional para complementar o encapsulamento do this.fotos.
    public void setFoto(Foto foto) {
        if(this.fotos == null)
            this.fotos = new ArrayList();
        this.fotos.add(foto);
    }    
    
}
