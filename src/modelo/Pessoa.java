/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20241PF.CC0008
 */
public class Pessoa {

    // ATRIBUTOS DA CLASSE
    private LocalDate dataNascimento;
    private String nome;
    private String CPF;
    private List<AvaliacaoFisica> avaliacoes;

    // CONSTRUTORES
    Pessoa() {
        this.avaliacoes = new ArrayList<AvaliacaoFisica>();
    }

    // já passando o nome
    Pessoa(String n) {
        nome = n;
        this.avaliacoes = new ArrayList<AvaliacaoFisica>();
    }

    // MÉTODOS(sempre publicos)
    // set serve para inserir, atribuir // sempre tem que passar por parâmetro o que
    // está inserindo
    // get serve para pegar, visualizar
    // método para exibir dados e todas as informações da pessoa
    public String exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String aux = "Dados da pessoa cadastrada: \n";
        aux += "Nome: " + nome + "\n";
        if (CPF != null) {
            aux += "CPF: " + CPF + "\n";
        }
        if (dataNascimento != null) {
            aux += "Data de Nascimento: " + formato.format(dataNascimento) + "\n";
        }
       // if (avaliacoes != null) {
          //  aux += "Numero de avaliações: " + avaliacoes.size(); //coloquei na classe Aluno linha 43
        //}
        return aux;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public LocalDate getDataNascimento(LocalDate of) {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataNascimento(LocalDate dtN) {
        this.dataNascimento = dtN;
    }

    public List<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
    }

    @Override
    public String toString() {
        return nome;
    }

}
