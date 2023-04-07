package com.example.demo.Controller;

import com.example.demo.Model.Gym;
import com.example.demo.Model.Member;
import com.example.demo.Model.Trainer;
import com.example.demo.Service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/gym")
public class GymController {

   @Autowired
   GymService gymService ;

    @PostMapping("/add")
    public String addGym(@RequestBody Gym gym){

        return gymService.addGym(gym);
    }
    @GetMapping("/get-gym-with-most-members")
    public Gym getGymWithMostMembers() {

        return gymService.getGymWithMostMembers();
    }
}