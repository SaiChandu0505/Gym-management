package com.example.demo.Service;

import com.example.demo.Model.Member;
import com.example.demo.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class MemberService {
    @Autowired

    MemberRepository memberRepository ;

    public String addMember(Member member){

        return memberRepository.addMember(member);
    }
    public Member findMemberWithMostTrainers() {
        List<Member> members = memberRepository.findAll();
        int maxTrainers = 0;
        Member memberWithMostTrainers = null;

        for (Member member : members) {
            int numTrainers = member.getTrainers().size();
            if (numTrainers > maxTrainers) {
                maxTrainers = numTrainers;
                memberWithMostTrainers = member;
            }
        }

        return memberWithMostTrainers;
    }

}
