/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 20241PF.CC0008
 */
public class Aluno extends Pessoa { //extends significa que a classe Aluno é do tipo Pessoa

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
        //for(tipo(que é uma AvaliacaoFisica) um apelido: e a lista que quer percorrer))
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

    public void setPlano(Plano plano) {
        this.plano = plano;
        verificaDesconto();
    }

    @Override
    public List<AvaliacaoFisica> getAvaliacoes() {
        return avaliacoes;
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

    public void verificaDesconto() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataMatricula, dataAtual);
        int meses = periodo.getYears() * 12 + periodo.getMonths();

        if (meses >= 3) {
            this.valorMensalidade = plano.getValor() * 0.90; //valor já com 10%
            //valorMensalidade -=(valorMensalidade * 0.1);
        } else {
            this.valorMensalidade = plano.getValor();
            // System.out.println("O aluno não possui desconto.");
        }
    }

    @Override
    public String exibirDados() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String aux = super.exibirDados();
        aux += "Matricula: " + matricula;
        aux += "\nData da Matrícula: " + formato.format(dataMatricula);
        aux += "\nAvaliações Fisicas Realizadas: " + avaliacoes.size() + "\n";
        if (plano != null) {
            aux += "Plano: " + plano.getNome();
            aux += " - R$ " + valorMensalidade + "\n";
        }
        return aux;
    }
}
