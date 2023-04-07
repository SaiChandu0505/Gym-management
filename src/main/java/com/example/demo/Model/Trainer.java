package com.example.demo.Model;

import java.util.List;

public class Trainer {

    private int TrainerId;
    private List<Member> members;
    private List<Gym> gym ;

    public Trainer(int trainerId, List<Member> members, List<Gym> gym) {
        TrainerId = trainerId;
        this.members = members;
        this.gym = gym;
    }

    public int getTrainerId() {
        return TrainerId;
    }

    public void setTrainerId(int trainerId) {
        TrainerId = trainerId;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Gym> getGym() {
        return gym;
    }

    public void setGym(List<Gym> gym) {
        this.gym = gym;
    }
}

