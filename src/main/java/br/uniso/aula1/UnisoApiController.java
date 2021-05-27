package br.uniso.aula1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UnisoApiController {

    private static List<Aluno> alunos = new ArrayList<>();

    @GetMapping("/seila")
    public String helloWorld(@RequestParam String nome, @RequestParam String sobreNome){
        return "Hello "+ nome + " "+ sobreNome;
    }


    @PostMapping("/alunos")
    public void salvar(@RequestBody Aluno aluno){
        alunos.add(aluno);
    }
    @GetMapping("/alunos")
    public List<Aluno> listar(){
        return alunos;
    }

}