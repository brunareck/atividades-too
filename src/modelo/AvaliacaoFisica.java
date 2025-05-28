/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author bruna
 */
public class AvaliacaoFisica implements Exibivel{
    private Aluno aluno;
    private LocalDate data;
    private double peso;
    private double altura;
    private int idade;
    private double imc;
    private Professor professor;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public AvaliacaoFisica(Aluno aluno) {
        this.aluno = aluno;
        this.data = LocalDate.now();
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }
      public void setData(LocalDate data) {
        this.data = data;
    }
    public double calcularIMC() {
        this.imc = peso / (altura * altura);
        return this.imc;
    }
    public Pessoa getAluno(){
        return aluno;
    }

    public void calcularIdade() {
        this.idade = Period.between(aluno.getDataNascimento(LocalDate.of(2000, 5, 15)), data).getYears();
    }

    public String exibirDados() {      
        String retorno = "Dados da Avaliacao Fisica: \n";
        retorno += "Nome: " + aluno.getNome() + "\n";
        calcularIdade();
        if(idade != 0)
        {
           retorno += "Idade: " + idade + "\n";
        }
        if(data != null)
        {
           retorno += "Data da avaliacao: " +formato.format(data) + "\n";
        }
        if(imc > 0)
        {
           retorno += "IMC: " + imc;
        }
        if(professor!= null)
        {
            retorno += "Professor: "+professor;
        }
        return retorno;
    }
    @Override
    public String toString(){
        return formato.format(data) + " - IMC: "+imc;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
}
