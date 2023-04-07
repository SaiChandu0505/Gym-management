package com.example.demo.Repository;

import com.example.demo.Model.Trainer;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Optional;

@Repository
public class TrainerRepository {

    HashMap<Integer, Trainer> trainerHashMap = new HashMap<>();
    @PostMapping("/add")
    public String addTrainer(Trainer trainer){

        int key = trainer.getTrainerId();
        trainerHashMap.put(key,trainer);
        return "Trainer added successfully";
    }

}
