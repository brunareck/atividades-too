/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AlunoConvenio;
import modelo.AvaliacaoFisica;
import modelo.Convenio;
import modelo.Impressora;
import modelo.Plano;
import modelo.Professor;

public class TesteHeranca {

    public static void main(String[] args) {

        Professor p = new Professor();

        p.setNome("Juka");
        p.setCpf("123.456.789-10");
        p.setEspecializacao("Musculação");

        System.out.println(Professor.mostraQuantidade());

        Plano plano1 = new Plano();
        plano1.setNome("Básico");
        plano1.setDescricao("Acesso a musculação liberada.");
        plano1.setValor(100);

        Convenio c = new Convenio();
        c.setNome("IFSUL");
        c.setDesconto(5.0);

        AlunoConvenio a = new AlunoConvenio("Vivente2", "321", "567", c);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        a.setDataNascimento(LocalDate.parse("10/01/2008", formato));

        a.setDataMatricula(LocalDate.parse("10/04/2024", formato));

        a.setPlano(plano1);

        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.addAvaliacao(av1);
        av1.setProfessor(p);

        Impressora.imprimirDados(p);
        Impressora.imprimirDados(plano1);
        Impressora.imprimirDados(av1);
        Impressora.imprimirDados(a);

        Aluno a2 = new Aluno("Vivente", "0123", "123");
        Impressora.imprimirDados(a2);
    }

}
