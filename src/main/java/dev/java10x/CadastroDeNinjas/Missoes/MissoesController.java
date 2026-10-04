package dev.java10x.CadastroDeNinjas.Missoes;
import org.springframework.web.bind.annotation.*;


@RestController // tudo vai ser controller
@RequestMapping ("missoes") //mapear


public class MissoesController {

    // GET -- Mandar uma requisição para mostrar as missoes

    @GetMapping("/listar")
    public String listarMissao (){
        return "Missao listadas com sucesso";
    }

    // POST -- Mandar uma requisição para criar as missoes

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";

    }

    //PUT -- Mandar uma requisição para ALTERAR as missoes

    @PutMapping("/alterar")
    public String alterarMissao (){
        return "Missao alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para DELETAR as missoes

    @DeleteMapping("/deletar")
    public String deletarMissao (){
        return "Missao deletada com sucesso";
    }


}
