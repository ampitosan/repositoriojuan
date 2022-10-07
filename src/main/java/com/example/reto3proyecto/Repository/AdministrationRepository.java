package com.example.reto3proyecto.Repository;

import com.example.reto3proyecto.Entities.Administration;
import com.example.reto3proyecto.Repository.crudRepository.AdministrationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AdministrationRepository {

    @Autowired
    private AdministrationCrudRepository administrationCrudRepository;

    public List<Administration> getAll(){return (List<Administration>) administrationCrudRepository.findAll();}

    public Optional<Administration> getAdministration(int id){ return administrationCrudRepository.findById(id);}

    public Administration save(Administration c){return administrationCrudRepository.save(c);}

    public void delete(Administration c) {
        administrationCrudRepository.delete(c);}


}



