import br.com.joao.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricação Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscrever(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXP());

        System.out.println("---------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscrever(bootcamp);
        System.out.println("Conteúdos inscritos Ana" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Ana" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ana" + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularXP());

    }
}
