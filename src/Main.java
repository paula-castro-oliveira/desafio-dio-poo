
import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devPaula.getConteudosInscritos());

        devPaula.progredir();
        devPaula.progredir();

        System.out.println("--");
        System.out.println("Conteúdos Inscritos" + devPaula.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devPaula.getConteudosConcluidos());
        System.out.println("XP: " + devPaula.calcularTotalXp());

        System.out.println("--------------");

        Dev devDyego = new Dev();
        devDyego.setNome("Dyego");
        devDyego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDyego.getConteudosInscritos());

        devDyego.progredir();
        devDyego.progredir();
        devDyego.progredir();

        System.out.println("--");
        System.out.println("Conteúdos Inscritos" + devDyego.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devDyego.getConteudosConcluidos());
        System.out.println("XP: " + devDyego.calcularTotalXp());
    }
}