package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
    private String nivel; // Ex: Iniciante, Intermediário, Avançado

    @Override
    public double calcularXp() {
        double multiplicadorNivel = switch (nivel.toLowerCase()) {
            case "intermediário" -> 1.2;
            case "avançado" -> 1.5;
            default -> 1.0;
        };
        return XP_PADRAO * cargaHoraria * multiplicadorNivel;
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() +
                " | Nível: " + nivel +
                " | Carga Horária: " + cargaHoraria +
                "h | Descrição: " + getDescricao();
    }
}
