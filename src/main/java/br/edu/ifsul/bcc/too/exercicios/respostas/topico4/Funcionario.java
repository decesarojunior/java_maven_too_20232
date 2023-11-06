
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.util.Calendar;

/**
 *
 * @author telmo
 */
//classe Funcionario: é a subclasse (classe filha)
//classe Pessoa: é a superclasse (classe Mãe)
public class Funcionario extends Pessoa {
    
    //atributos: numero_ctps e data de admissao.
    private String numero_ctps;
    private Calendar data_admissao;
    
    // o funcionario poderia estar vinculado com vários cursos.

    public Funcionario() {
    }

    public Funcionario(String numero_ctps, Calendar data_admissao) {
        this.numero_ctps = numero_ctps;
        this.data_admissao = data_admissao;
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }
    
    
    
}
