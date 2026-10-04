package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nessa rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // Mostrar todos os ninjas (CREATE)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar ninja";
    }

    // Mostrar por ID ninjas (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninja por ID";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorID() {
        return "Alterar Ninja por ID";
    }


    // Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID() {
        return "Ninja deletado por ID";
    }


}
