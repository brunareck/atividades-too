/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Professor extends Funcionario { // extends significa que a classe Professor é do tipo Pessoa
    private String especializacao;
    private static int qnt;

    public Professor() {
        qnt++;
    }

    public static int mostraQuantidade() {
        return qnt;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override // significa que o método (nesse caso o exibirDados() mão foi criada nessa
              // classe, mas está sendo sobescrita aqui
    public String exibirDados() {
        String aux = super.exibirDados(); // a palavra super pega tudo da classe pai (Pessoa)
        aux += "Especialização: " + especializacao + "\n";
        return aux;
    }

    @Override
    public double calculaSalarioMes() {
        return salario * 1.25;
    }

    @Override
    public String mostraVinculo() {
        return "Professor";
    }
}
