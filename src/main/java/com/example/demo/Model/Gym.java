package com.example.demo.Model;

import java.util.List;

public class Gym {
    private int GymId ;
    private String Location ;
   private List<Member> members ;
    private List<Trainer> trainers;


    public Gym(int gymId, String location, List<Member> members, List<Trainer> trainers) {
        GymId = gymId;
        Location = location;

    }

    public Gym(List<Member> members, List<Trainer> trainers) {
        this.members = members;
        this.trainers = trainers;
    }

    public int getGymId() {
        return GymId;
    }

    public void setGymId(int gymId) {
        GymId = gymId;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }
}
