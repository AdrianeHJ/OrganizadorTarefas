package br.senac.tads.dsw.ADO;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin(origins = "*")
public class TarefaRestController {
    @Autowired TarefaService service;

    @GetMapping
    public List<Tarefa> findAll() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Tarefa> addNew(@RequestBody @Valid Tarefa input) {
        Tarefa tarefa = service.addNew(input);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequestUri()
            .path("/tarefas")
            .buildAndExpand(tarefa.getTitulo())
            .toUri();
        return ResponseEntity.created(location).build();
    }

}
