package com.example.reto3proyecto.Repository.crudRepository;

import com.example.reto3proyecto.Entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}