package com.example.demo.Controller;

import com.example.demo.Model.Gym;
import com.example.demo.Model.Member;
import com.example.demo.Model.Trainer;
import com.example.demo.Service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/Trainer")
public class TrainerController {

    @Autowired
    TrainerService trainerService ;

    @PostMapping("/add")
    public String addTrainer(@RequestBody Trainer trainer){
        return trainerService.addTrainer(trainer);
    }
    public int getNumMembersForTrainerWithMultipleGyms(Long trainerId, int gymCount) {
        Trainer trainer = trainerRepository.findById(trainerId).orElseThrow(() -> new ResourceNotFoundException("Trainer not found with id " + trainerId));
        int numMembers = 0;

        Set<Member> members = new HashSet<>();
        for (Gym gym : trainer.getGyms()) {
            members.addAll(gym.getMembers());
        }

        for (Member member : members) {
            if (member.getTrainers().size() > gymCount) {
                numMembers++;
            }
        }

        return numMembers;
    }
}
