/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author telmo
 */
public class Exercicio {

     //criar um construtor
    public Exercicio() {
        
        imprimePessoas(getPessoas());
    }    
   
    //criar um método que retorne uma colecao de Pessoa.
    //essa colecao deverá ter 5 pessoas (1 Func, 2 Cliente e 2 Aluno).
    
    private Collection<Pessoa> getPessoas(){
        Collection<Pessoa> cltP = new ArrayList();
        Pessoa p = new Funcionario();
        p.setCpf("123456");
        p.setNome("Fulano");
        p.setData_nascimento(Calendar.getInstance());
        p.setNumero(1011);
        p.setLogradouro("Rua Bento");
        p.setPeso(70f);
        p.setStatus(Boolean.TRUE);
        //casting
        ((Funcionario) p ).setData_admissao(Calendar.getInstance());
        ((Funcionario) p ).setNumero_ctps("566"); 
        //setar as informacoes especificas de funcionario
        cltP.add(p);
        
        p = new Cliente(Calendar.getInstance(), "nada consta");
        p.setCpf("823456");
        p.setNome("Ciclano");
        p.setData_nascimento(Calendar.getInstance());
        p.setNumero(1012);
        p.setLogradouro("Rua das Flores");
        p.setPeso(75f);
        p.setStatus(Boolean.FALSE);
        //setar as informacoes especificas de Cliente
        cltP.add(p);
        
        Aluno a = new Aluno();
        a.setNome("Beltrano");
        a.setCoeficiente_rendimento(79.8f);
        cltP.add(a);//adiciona aluno na colecao de pessoa
        
        return cltP;
    }
    //exercicio 2:
    //criar um metodo que receba uma collection de Pessoa.
    //imprimir na saida padrão, os elementos da coleção, 
    //indicado a instancia (se é Funcionario, Cliente ou Aluno)
    
    private void imprimePessoas(Collection<Pessoa> pessoas){
        
        //imprimir cada elemento da colecao.
        for(Pessoa p : pessoas){
            //teste para descobrir a instancia
            if(p instanceof Funcionario){
                //imprimir o ctps
                Funcionario f = (Funcionario) p;
                System.out.println("Funcionario:");
                System.out.println("\tCTPS: "+f.getNumero_ctps());
            }else if(p instanceof Cliente){
                Cliente c = (Cliente) p;
                System.out.println("Cliente:");
                int dia = c.getData_nascimento().get(Calendar.DAY_OF_MONTH);
                int mes = c.getData_nascimento().get(Calendar.MONTH);
                int ano = c.getData_nascimento().get(Calendar.YEAR);
                System.out.println("\tdt nascimento: "+dia+"/"+mes+"/"+ano);
                //imprimir a data_ultima_compra
            }else if(p instanceof Aluno){
                //imprimir a matricula
                Aluno a = (Aluno) p;
                System.out.println("Aluno: ");
            }            
            if(p instanceof Pessoa){
                //imprimir o cpf
                System.out.println("\tPessoa:");
                System.out.println("\t\tCPF:"+p.getCpf());
            }
            //em seguida imprimir os dados de cada instancia.
        }
        
    }
    
    //chamar os dois métodos no construtor.
    
    //criar a main 
    public static void main(String args[]){
        
        new Exercicio();
    }
}
