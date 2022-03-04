import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp =  new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developers");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devs = new Dev();
        devs.setNome("Orlean");
        devs.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devs.getConteudosInscritos());

        devs.progredir();
        devs.progredir();

        System.out.println("-");
        System.out.println("Conteudos concluidos " + devs.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + devs.getConteudosConcluidos());
        System.out.println("XP:" + devs.calcularTotalXp() );

        System.out.println("--------------------");

        Dev devs2 = new Dev();
        devs2.setNome("Jose");
        devs2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devs2.getConteudosInscritos());
        devs2.progredir();
        devs2.progredir();
        devs2.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos devs2 " + devs2.getConteudosInscritos());
        System.out.println("Conteudos concluidos devs2 " + devs2.getConteudosConcluidos());
        System.out.println("XP:" + devs2.calcularTotalXp() );




    }
}
