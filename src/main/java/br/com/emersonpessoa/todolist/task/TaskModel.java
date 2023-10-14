package br.com.emersonpessoa.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * ID
 * Usuário
 * Descrição
 * Título
 * Data de Início
 * Data de término
 * Prioridade
 */
@Data
@Entity(name="tb_tasks")
public class TaskModel {
    
    @Id //para apontar como primary key
    @GeneratedValue(generator = "UUID")// Gerar chave primária de forma automática
    private UUID id;
    private String description;

    
    @Column(length=50)//Limitar a quantidade de caracteres que seja possível p/ colocar no title
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception {
        if(title.length() > 50){
            throw new Exception("O campo title dever conter no máximo 50 caracteres");
        }
        this.title = title;
    }


}
