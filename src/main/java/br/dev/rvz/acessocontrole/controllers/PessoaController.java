package br.dev.rvz.acessocontrole.controllers;

import br.dev.rvz.acessocontrole.models.Pessoa;
import br.dev.rvz.acessocontrole.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa/")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public void cadastrar(@RequestBody Pessoa pessoa) {
        service.cadastrar(pessoa);
    }

    @GetMapping
    public List<Pessoa> listar() {
        return service.listar();
    }

}
