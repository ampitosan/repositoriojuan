package com.example.reto3proyecto.Service;

import com.example.reto3proyecto.Entities.Score;
import com.example.reto3proyecto.Repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return scoreRepository.getAll();
    }

    public Optional<Score> getScore(int id){
        return scoreRepository.getScore(id);
    }

    public Score save (Score score){
        if (score.getIdScore() == null){
            return scoreRepository.save(score);
        } else {
            Optional<Score> score1 = scoreRepository.getScore(score.getIdScore());
            if(score1.isEmpty()){
                return scoreRepository.save(score);
            } else {
                return score;
            }
        }
    }
}


