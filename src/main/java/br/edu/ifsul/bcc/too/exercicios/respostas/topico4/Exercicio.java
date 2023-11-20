
package br.edu.ifsul.bcc.too.exercicios.respostas.topico4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author telmo
 */
public class Exercicio {

     //criar um construtor
    public Exercicio() {
        
        imprimePessoas(getPessoas());
    }    
    //exercicio 3:
    //criar um método que gere um cliente (obter dados via JOptionPane).
    //criar um metodo que gere um produto (obter dados via JOptionPane).
    //criar um metodo que gere um foto (obter dados via JOptionPane).
    //criar um metodo que gera um pedido (cliente, produto e foto).
    //criar um metodo que imprima um pedido (todas as informações).
    private void exercicio3(){
        Cliente c = generateCliente();
        Produto p = generateProduto();
        Foto f = generateFoto(p);
        Pedido pd = generatePedido(c, p);
        imprimiPedido(pd);
    }
    private void imprimiPedido(Pedido p){
        
        System.out.println(p.getCodigo());
        System.out.println("CPF: "+ p.getCliente().getCpf());
        System.out.println("data: "+p.getCliente().getData_nascimento_string());
        for(Produto pdt : p.getProdutos()){
            System.out.println("produto: "+pdt.getId());
            for(Foto ft : pdt.getFotos()){
                System.out.println("codigo: "+ft.getCodigo());
            }
        }
    }
    private Pedido generatePedido(Cliente cliente, Produto produto){
        Pedido p = new Pedido();
        p.setCliente(cliente);
        p.setProduto(produto);
        //f.set....via JOptionPane ...
        return p;
    }
    private Foto generateFoto(Produto produto){
        Foto f = new Foto();
        f.setProduto(produto);
        //f.set....via JOptionPane ...
        return f;
    }
    private Produto generateProduto(){
        Produto p = null;
        
        
        return p;
    }
    private Cliente generateCliente(){
        Cliente c = null;
       
            
        String dtnasc = JOptionPane.showInputDialog(null,
                "Data",  "Informe data no formato dd/MM/yyyy",
                JOptionPane.PLAIN_MESSAGE);


        c = new Cliente();


        //conversao de Date para Calendar
        c.setData_nascimento(dtnasc);
           
       
        return c;
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
