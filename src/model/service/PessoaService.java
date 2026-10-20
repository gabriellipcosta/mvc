package model.service;

import model.enitity.Pessoa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PessoaService {
    private static int id = 1;

    Set<Pessoa> bancoDeDados = new HashSet<>();

    //CRUD

    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln("Digite seu nome: "));
        p.setEmail(IO.readln("Digite seu email: "));
        p.setSenha(IO.readln("Digite sua senha: "));
        bancoDeDados.add(p);
    }

  public void mostrarPessoa(){
      IO.println(bancoDeDados);
  }



}
