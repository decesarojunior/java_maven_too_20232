
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa;

/**
 *
 * @author telmo
 */
public class Raca {
    
    private Integer id;
    private String nome;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raca(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    
}
