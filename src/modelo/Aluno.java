/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20241PF.CC0008
 */
public class Aluno extends Pessoa { // extends significa que a classe Aluno é do tipo Pessoa

    public Aluno(String n, String cpf, String matricula) {
        super(n, cpf);
        this.matricula = matricula;
    }

    protected String matricula;
    protected LocalDate dataMatricula;
    protected double valorMensalidade;
    protected Plano plano;
    protected List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

    public void addAvaliacao(AvaliacaoFisica avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public String mostrarAvaliacoes() {
        String aux = "Histórico de Avaliações: \n";
        // for(tipo(que é uma AvaliacaoFisica) um apelido: e a lista que quer
        // percorrer))
        for (AvaliacaoFisica cadaAvaliacao : avaliacoes) {
            aux += "->" + cadaAvaliacao + "\n";
        }
        return aux;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String aux = super.exibirDados();
        aux += "\nMatricula: " + matricula;
        if (dataMatricula != null) {
            aux += "\nData de Matricula: " + formato.format(dataMatricula);
        }
        aux += "\nAvaliações Físicas Realizadas: " + avaliacoes.size();

        if (plano != null) {
            aux += "\nValor Mensalidade: R$ " + valorMensalidade;
            aux += "\nPlano: " + plano;
        }
        aux += "\n";
        return aux;
    }

    public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
        verificaDesconto();
    }

    public void verificaDesconto() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataMatricula, dataAtual);
        int meses = periodo.getYears() * 12 + periodo.getMonths();

        if (meses >= 3) {
            this.valorMensalidade = plano.getValor() * 0.90; // valor já com 10%
            // valorMensalidade -=(valorMensalidade * 0.1);
        } else {
            this.valorMensalidade = plano.getValor();
            // System.out.println("O aluno não possui desconto.");
        }
    }

    @Override
    public String mostraVinculo() {
        return "Aluno";
    }
}
