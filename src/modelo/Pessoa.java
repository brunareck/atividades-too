/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa implements Exibivel {

    // ATRIBUTOS DA CLASSE
    private LocalDate dataNascimento;
    private String nome;
    private String CPF;

    // CONSTRUTORES
    Pessoa() {

    }

    // já passando o nome
    Pessoa(String n) {
        nome = n;

    }

    /**
     * @param nome
     * @param CPF
     */

    Pessoa(String nome, String CPF) {
        this.nome = nome;
        setCpf(CPF);
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
        // aux += "Numero de avaliações: " + avaliacoes.size(); //coloquei na classe
        // Aluno linha 43
        // }
        return aux;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        cpf = cpf.replace(".", "").replace("-", "").trim();
        if (cpf != null && cpf.length() == 11) {
            this.CPF = cpf;
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public void setDataNascimento(LocalDate dtN) {
        this.dataNascimento = dtN;
    }

    @Override
    public String toString() {
        return nome;
    }

    public abstract String mostraVinculo();

}
