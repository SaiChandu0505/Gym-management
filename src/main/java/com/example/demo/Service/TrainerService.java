package com.example.demo.Service;

import com.example.demo.Model.Gym;
import com.example.demo.Model.Member;
import com.example.demo.Model.Trainer;
import com.example.demo.Repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashSet;
import java.util.Set;

@Service
public class TrainerService {

    @Autowired
    TrainerRepository trainerRepository;
    public String addTrainer(Trainer trainer){
        return trainerRepository.addTrainer(trainer);
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
        return numMembers ;
    }

}
