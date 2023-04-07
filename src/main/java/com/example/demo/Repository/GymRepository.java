package com.example.demo.Repository;

import com.example.demo.Model.Gym;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

@Repository
public class GymRepository {

    HashMap<Integer, Gym> gymHashMap = new HashMap<>();

    public String addGym(Gym gym){

        int key = gym.getGymId();
        gymHashMap.put(key,gym);
        return "Gym added successfully";
    }
    public List<Gym> findAll(){

        return gymHashMap.values().stream().toList();
    }
}
