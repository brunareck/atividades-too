/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import modelo.Aluno;
import modelo.AvaliacaoFisica;
import modelo.Plano;
import modelo.Professor;

/**
 *
 * @author 20241PF.CC0008
 */
public class TesteHeranca {
    public static void main(String[] args) {
        
        Professor p = new Professor();
        
        Plano p1 = new Plano("Premium", "Acesso total", 150.00);
        
        p.setNome("Juka");
        p.setCPF("123.456.789-10");
        p.setEspecializacao("Musculação");
        
        System.out.println(p.exibirDados());
       
        Aluno a = new Aluno();
        a.setNome("Vivente");
        a.setMatricula("123");
        a.setDataNascimento(LocalDate.of(2000, 5, 15));
        a.setDataMatricula(LocalDate.of(2025, 4, 10));
        a.setPlano(p1);
        a.verificaDesconto();
        
        Aluno b = new Aluno();
        b.setNome("Ciclano");
        b.setMatricula("321");
        b.setDataNascimento(LocalDate.of(1998, 3, 10));
        b.setDataMatricula(LocalDate.of(2025, 1, 10));
        b.setPlano(p1);
        b.verificaDesconto();
        
        
        AvaliacaoFisica av1 = new AvaliacaoFisica(a);
        a.addAvaliacao(av1);
        av1.setProfessor(p);
        
        
        System.out.println(a.exibirDados());
        System.out.println("---");
        //System.out.println(av1.exibirDados());
        System.out.println("---");
        System.out.println(b.exibirDados());
        System.out.println("---");
    }
    
}
