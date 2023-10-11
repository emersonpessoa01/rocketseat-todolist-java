package br.com.emersonpessoa.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Tipo de modificadores
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * String(texto)
     * Integer(int) numero inteiros
     * Double (Double) numeros 0.0000
     * Float (float) numeros 0.000
     * char (AC)
     * Date (date)
     * void
     */
    /*
     * Body -  as informações são passadas dentro body da requisição
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.name);
        System.out.println(userModel.username);
        System.out.println(userModel.password);
        
        
    }
}
