package br.senac.tads.dsw.ADO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    
    private Map<String, Tarefa> mapTarefas;

    public TarefaService(){
        mapTarefas = new HashMap<>();
        mapTarefas.put("tarefa1",
        new Tarefa("tarefa1", "Adriane", LocalDate.parse("2025-09-28"),
        "bla bla bla"));
    }

    public List<Tarefa> findAll() {
        return new ArrayList<>(mapTarefas.values());
    }

    public Tarefa findByTitulo(String titulo) {
        return mapTarefas.get(titulo);
    }

    public Tarefa addNew(Tarefa dto) {
        mapTarefas.put(dto.getTitulo(), dto);
        return dto;
    }

    public Tarefa update(String Titulo, Tarefa dto) {
        return null;
    }

    public void delete(String Titulo) {

    }
}
