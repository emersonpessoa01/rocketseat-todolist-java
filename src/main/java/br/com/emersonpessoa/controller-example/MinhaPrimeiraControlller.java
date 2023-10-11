//CONTROLLER USADO APENAS PARA EXEMPLO

package br.com.emersonpessoa.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController - serve para criar uma rota(path)
//---http://localhost:8080/primeiraRota----
@RequestMapping("/primeiraRota") //Responsável por estruturar a classe
public class MinhaPrimeiraControlller {
    /**
     * Método de acesso do HTTP
     * GET -  Buscar uma informação
     * POST - Adicionar um dado/informarção
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
     * 
     */
    //Método(Funcionalidade) de uma classe

    @GetMapping("/primeiroMetodo") //método http do tipo get
    public String primeiraMensagem(){
        return "Funcionou";
    }
    
}
