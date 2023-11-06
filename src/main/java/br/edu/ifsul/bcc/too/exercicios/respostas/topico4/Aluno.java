
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

/**
 *
 * @author telmo
 */
public class Aluno extends Pessoa {
    
    //atributo de instância: numero_matricula, coeficiente_rendimento
    private String numero_matricula;
    private Float coeficiente_rendimento;

    public Aluno() {
    }

    public Aluno(String numero_matricula, Float coeficiente_rendimento) {
        this.numero_matricula = numero_matricula;
        this.coeficiente_rendimento = coeficiente_rendimento;
    }

    public String getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(String numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public Float getCoeficiente_rendimento() {
        return coeficiente_rendimento;
    }

    public void setCoeficiente_rendimento(Float coeficiente_rendimento) {
        this.coeficiente_rendimento = coeficiente_rendimento;
    }
    
    
    
}
