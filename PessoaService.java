package PessoaService;

import model.Pessoa;

import java.util.ArrayList;

public class PessoaService {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p) {
        pessoas.add(p);
        System.out.println("cadastrada com sucesso!");
    }

    public ArrayList<Pessoa>listar() {
        return pessoas;
    }

    public void atualizar(String nome, String novoNome) {
    }

    public void deletar(String nomeDeletar) {
    }
}