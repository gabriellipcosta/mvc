package model.service;

import model.enitity.Pessoa;
import model.enitity.Status;
import model.enitity.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class TarefaService {
    private static int id = 1;

    Set<Tarefa> listaTarefas = new HashSet<>();

    public void criarTafera(){
        Tarefa t = new Tarefa();
        t.setId(id++);
        t.setTitulo(IO.readln("Digite o titulo da atividade: "));
        t.setDescricao(IO.readln("Escreva a descrição da sua atividade: "));
        t.setStatus(Status.PENDENTE);
        listaTarefas.add(t);

    }

    public void mostrarTarefa(){
        IO.println(listaTarefas);
    }
}
