/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.Period;

public class AlunoConvenio extends Aluno {
    private Convenio convenio;

    public AlunoConvenio(String nome, String CPF, String matricula, Convenio convenio) {
        super(nome, CPF, matricula);
        this.convenio = convenio;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    @Override
    public void setPlano(Plano plano) {
        super.plano = plano;
        verificaDesconto();
    }

    @Override
    public void verificaDesconto() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataMatricula, dataAtual);
        int meses = periodo.getYears() * 12 + periodo.getMonths();

        if (plano != null) {
            valorMensalidade = plano.getValor();
            if (meses >= 3) {
                this.valorMensalidade = plano.getValor() * 0.90; // valor já com 10%
                // valorMensalidade -=(valorMensalidade * 0.1);
            } else {
                // this.valorMensalidade = plano.getValor();
                System.out.println("O aluno não possui tempo para desconto ");
            }
            if (convenio != null) {
                valorMensalidade -= (convenio.getDesconto() / 100) * valorMensalidade;
            } else {
                // this.valorMensalidade = plano.getValor();
                System.out.println("O aluno não possui plano selecionado. Informe o plano do aluno: ");
            }
        }
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\n" + "Convenio: " + convenio;
    }
}
