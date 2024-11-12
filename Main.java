import java.util.Scanner;

import PessoaService.PessoaService;
import model.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa a = new Aluno();
        Professor p = new Professor();
        Pessoa c = new Coordenador();
        PessoaService ps = new PessoaService();

        System.out.println("Qual seu nome?");
        p.setNome(sc.next());

        System.out.println("Qual a idade?");
        p.setIdade(sc.nextInt());

        ps.cadastrarPessoa(p);
        System.out.println(ps.listar());

        p.responsabilidade();
        p.calcSalario();
        p.calcularSalario();

        System.out.print("Digite o nome da pessoa que deseja atualizar: ");
        String nome = sc.next();
        System.out.print("Digite o novo nome da pessoa: ");
        String novoNome = sc.next();
        ps.atualizar(nome, novoNome);

        System.out.print("Digite o nome da pessoa que deseja deletar: ");
        String nomeDeletar = sc.next();
        ps.deletar(nomeDeletar);

        
    }
}