package br.com.emersonpessoa.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    /* não cadastrar um usuário que n~]ao exista */
    @Column(unique=true)

    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
    /*
     * //FORNECIDO PELA IMPORTAÇÃO DO LOMBOK ATRAVÉS DO NOTATIONS @DATA
     * public void setUsername(String username) {
     * this.username = username;
     * }
     * public String getUsername() {
     * return username;
     * }
     * public void setName(String name) {
     * this.name = name;
     * }
     * public String getName() {
     * return name;
     * }
     * public void setPassword(String password) {
     * this.password = password;
     * }
     * public String getPassword() {
     * return password;
     * }
     * 
     */
}
/**
 * GETTERs E SETTERS
 * Permite acessar atributos de outras classes
 * 
 * GETTERS:
 * Para buscar informação de um atributo privado
 * 
 * SETTERS:
 * Para inserir um valor ao atributo privado
 */
