
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
public class Pessoa {
    
    private String cpf;
    private String rg;
    private String nome;
    private String logradouro;
    private Integer numero;
    private Calendar data_nascimento;
    private Float peso;
    private Boolean status;
   

    public Pessoa() {
    }

    public Pessoa(String cpf, String rg, String nome, String logradouro, Integer numero, Calendar data_nascimento, Float peso, Boolean status) {
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
        this.data_nascimento = data_nascimento;
        this.peso = peso;
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

   
    
    
}
