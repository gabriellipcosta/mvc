package controller;

import model.enitity.Status;
import model.service.TarefaService;

public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }




    public void criarTafera(){
        tarefaService.criarTafera();
        IO.println("Criando com sucesso!!");


    }

    public void mostrarTarefa(){
        tarefaService.mostrarTarefa();
    }

}
