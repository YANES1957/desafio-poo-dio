package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Fundamentos");
        curso1.setDescricao("Aprenda os conceitos iniciais de Java");
        curso1.setCargaHoraria(8);
        curso1.setNivel("Iniciante");

        Curso curso2 = new Curso();
        curso2.setTitulo("Spring Boot Avançado");
        curso2.setDescricao("Desenvolvimento de APIs REST com Spring Boot");
        curso2.setCargaHoraria(12);
        curso2.setNivel("Avançado");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria com Especialista em Java");
        mentoria1.setDescricao("Sessão para tirar dúvidas e aprofundar conhecimentos");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp intensivo para dominar Java e Spring");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        devCamila.progredir();

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();

        System.out.println("===== RELATÓRIO BOOTCAMP =====");
        System.out.println(devCamila);
        System.out.println("Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("Pendentes: " + devCamila.getConteudosInscritos());
        System.out.println("------------------------------");
        System.out.println(devJoao);
        System.out.println("Concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Pendentes: " + devJoao.getConteudosInscritos());
    }
}
