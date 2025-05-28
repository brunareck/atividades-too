/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;

public class Plano implements Exibivel {
    private String nome;
    private String descricao;
    private double valor;
    DecimalFormat formatoMoeda = new DecimalFormat("#,##0.00");

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

    @Override
    public String toString() {
        return nome + " - " + formatoMoeda.format(valor);
    }

    @Override
    public String exibirDados() {
        String aux = "Dados do Plano: \n";
        aux += "Nome: " + nome + "\n";
        aux += "Tipo de acesso: " + descricao + "\n";
        aux += "Valor da mensalidade: " + formatoMoeda.format(valor);

        return aux;
    }

}
