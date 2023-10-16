package br.com.juan.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/*
 * ID
 * User
 * Desc
 * Titutlo
 * Data inicio
 * Data termino
 * Prioridade
 */

 @Data
 @Entity(name = "tb _tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
     private UUID id;

     private String description;

     @Column(length = 50)
     private String title;

     private LocalDateTime startAt;
     private LocalDateTime endAt;
     private String priority;

     private UUID idUser;

     @CreationTimestamp
     private LocalDateTime createdAt;

     public void setTitle(String title) throws Exception{
        if(title.length()>50){
            throw new Exception("O campo title deve ter no max 50 caracteres!");
        }
        
        this.title = title;
     }

}
