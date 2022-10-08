package com.example.reto3proyecto.Service;

import com.example.reto3proyecto.Entities.Bike;
import com.example.reto3proyecto.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getAll(){
        return bikeRepository.getAll();
    }

    public Optional<Bike> getBike(int id){
        return bikeRepository.getBike(id);
    }

    public Bike save (Bike bike){
        if (bike.getId() == null){
            return bikeRepository.save(bike);
        } else {
            Optional<Bike> bike1 = bikeRepository.getBike(bike.getId());
            if(bike1.isEmpty()){
                return bikeRepository.save(bike);
            } else {
                return bike;
            }
        }
    }
}

