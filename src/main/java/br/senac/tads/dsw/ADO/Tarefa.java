package br.senac.tads.dsw.ADO;

import java.time.LocalDate;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Tarefa {
    
    @NotBlank
    private String titulo;

    @NotBlank
    private String responsavel;

    @NotNull
    @FutureOrPresent
    private LocalDate dataTermino;

    private String descricaoTarefa;

    public Tarefa(String titulo, String responsavel,
             LocalDate dataTermino, String descricaoTarefa){
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.dataTermino = dataTermino;
        this.descricaoTarefa = descricaoTarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }
}
