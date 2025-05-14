/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.format.DateTimeFormatter;


/**
 *
 * @author bruna
 */
public class Plano {
    private String nome;
    private String descricao;
    private double valor;
    
    
  public Plano(String nome, String descricao, double valor) {
       this.nome = nome;
       this.descricao = descricao;
       this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String exibirDados() {
        String aux = "Dados do Plano: \n";
        aux += "Nome do plano: " + nome + "\n";
        aux += "Tipo de acesso: "+ descricao + "\n";
        aux += "Valor da mensalidade: " + valor + "\n";
        return aux;
    }
    
}
