package br.dev.rvz.acessocontrole.services;

import br.dev.rvz.acessocontrole.models.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {
    List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrar(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> listar() {
        return pessoas;
    }
}
