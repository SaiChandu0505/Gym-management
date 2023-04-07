package com.example.demo.Service;


import com.example.demo.Model.Gym;
import com.example.demo.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class GymService {

    @Autowired
    GymRepository gymRepository ;

    public String addGym( Gym gym){
        return gymRepository.addGym(gym);
    }
    public Gym getGymWithMostMembers() {
        List<Gym> gyms = GymRepository.findAll();
        int maxMembers = 0;
        Gym gymWithMostMembers = null;

        for (Gym gym : gyms) {
            int numMembers = gym.getMembers().size();
            if (numMembers > maxMembers) {
                maxMembers = numMembers;
                gymWithMostMembers = gym;
            }
        }

        return gymWithMostMembers;
    }
}
