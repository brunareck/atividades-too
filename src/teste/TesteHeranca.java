/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;
import modelo.Aluno;
import modelo.AlunoConvenio;
import modelo.AvaliacaoFisica;
import modelo.Convenio;
import modelo.Impressora;
import modelo.Plano;
import modelo.Professor;

/**
 *
 * @author 20241PF.CC0008
 */
public class TesteHeranca {

    public static void main(String[] args) {

        Professor p = new Professor();

        Plano p1 = new Plano("Básico", "Acesso livre", 100.00);
        Plano p2 = new Plano("Premium", "Acesso total com personal trainer", 200.00);

        p.setNome("Juka");
        p.setCPF("123.456.789-10");
        p.setEspecializacao("Musculação");

        // System.out.println(p.exibirDados());

        Aluno a = new Aluno();
        a.setNome("Vivente");
        a.setMatricula("123");
        a.setDataNascimento(LocalDate.of(2000, 5, 15));
        a.setDataMatricula(LocalDate.of(2025, 4, 10));
        a.setPlano(p1);
        a.verificaDesconto();

        Convenio c = new Convenio();
        c.setNome("IFSUL");
        c.setDesconto(5.0);

        Aluno d = new Aluno();
        d.setNome("Beltrano");
        d.setCPF("12345678900");
        d.setDataNascimento(LocalDate.of(2000, 1, 15));
        d.setMatricula("2025001");
        d.setDataMatricula(LocalDate.of(2024, 1, 10)); // mais de 3 meses
        d.setPlano(p1);

        Aluno b = new AlunoConvenio(c);
        b.setNome("Ciclano");
        b.setMatricula("321");
        b.setDataNascimento(LocalDate.of(1998, 3, 10));
        b.setDataMatricula(LocalDate.of(2025, 1, 10));
        b.setPlano(p2);
        b.verificaDesconto();

        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.addAvaliacao(av1);
        av1.setProfessor(p);

        System.out.println(a.exibirDados());
        System.out.println("------------------------");
        System.out.println(av1.exibirDados());
        System.out.println("------------------------");
        System.out.println(b.exibirDados());
        System.out.println("------------------------");

        System.out.println(d.exibirDados());
        System.out.println("------------------------");
        System.out.println(b.exibirDados());
        System.out.println("");
        // System.out.println(p2.exibirDados());
        Impressora.imprimirDados(p);
        System.out.println("------------------------");
        Impressora.imprimirDados(p1);
        System.out.println("------------------------");
        Impressora.imprimirDados(av1);
        System.out.println("------------------------");
        Impressora.imprimirDados(a);
    }

}
