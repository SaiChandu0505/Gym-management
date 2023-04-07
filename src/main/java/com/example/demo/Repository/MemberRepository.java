package com.example.demo.Repository;

import com.example.demo.Model.Gym;
import com.example.demo.Model.Member;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.List;

@Repository
public class MemberRepository {

    HashMap<Integer, Member> memberHashMap = new HashMap<>();

    public String addMember( Member member){

        int key = member.getMemberId();
        memberHashMap.put(key,member);
        return "member added successfully";
    }
    public List<Member> findAll(){

        return memberHashMap.values().stream().toList();
    }
}
