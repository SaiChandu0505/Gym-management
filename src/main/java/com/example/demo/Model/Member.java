package com.example.demo.Model;

import java.util.List;

public class Member {

    private int MemberId ;

    List<Trainer> trainers ;

    private Gym gym;

    public Member(int memberId, List<Trainer> trainers, Gym gym) {
        MemberId = memberId;
        this.trainers = trainers;
        this.gym = gym;
    }

    public int getMemberId() {
        return MemberId;
    }

    public void setMemberId(int memberId) {
        MemberId = memberId;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
