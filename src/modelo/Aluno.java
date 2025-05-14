/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 20241PF.CC0008
 */
public class Aluno extends Pessoa{ //extends significa que a classe Aluno é do tipo Pessoa
    private String matricula;
    private LocalDate dataMatricula;
    private double valorMensalidade;
    private Plano plano;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
    
    public void addAvaliacao(AvaliacaoFisica avaliacao) {
        avaliacoes.add(avaliacao);
    }
    
    
     public String mostrarAvaliacoes(){
         String aux = "Histórico de Avaliações: \n";
        //for(tipo(que é uma AvaliacaoFisica) um apelido: e a lista que quer percorrer))
        for(AvaliacaoFisica cadaAvaliacao: avaliacoes){
            aux += "->"+cadaAvaliacao+"\n";
        }
        return aux;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
     
    
     public double setPlano(Plano plano) {
        this.plano = plano;
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataMatricula, dataAtual);
        int meses = periodo.getYears()*12 + periodo.getMonths();
        
        if(meses >=  3)
        {
            this.valorMensalidade = plano.getValor() * 0.90;
        } 
        else
        {
            this.valorMensalidade = plano.getValor();
        }
       return valorMensalidade;
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
    public double verificaDesconto()
    {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataMatricula, dataAtual);
        int meses = periodo.getYears()*12 + periodo.getMonths();
        
        if(meses >=  3)
        {
            this.valorMensalidade = plano.getValor() * 0.90; //valor já com 10%
        } 
        else
        {
            this.valorMensalidade = plano.getValor();
        }
        return valorMensalidade;
    }
    @Override
     public String exibirDados(){
         String aux = super.exibirDados();
         aux += "Matricula: "+matricula;
         aux += "\nAvaliações Fisicas Realizadas: "+avaliacoes.size()+"\n";
         aux += "Mensalidade: "+valorMensalidade +"\n";
         return aux;
     }
}
