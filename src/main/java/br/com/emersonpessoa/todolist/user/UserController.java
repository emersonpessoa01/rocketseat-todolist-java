package br.com.emersonpessoa.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
     * RequestBody - as informações são passadas dentro body da requisição
     */

    @Autowired
    private IUserRepository userRepository; // chamando a interface

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        // System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // System.out.printf("Nome: %s\n",userModel.getName());
        // System.out.printf("Usuário: %s\n",userModel.getUsername());
        // System.out.printf("Senha: %s\n",userModel.getPassword());
        // System.out.printf("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null) {
            // Mensagem de erro
            // Status Code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
        }

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);

    }
}
