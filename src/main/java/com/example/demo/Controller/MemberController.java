package com.example.demo.Controller;

import com.example.demo.Model.Gym;
import com.example.demo.Model.Member;
import com.example.demo.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService ;
    @PostMapping("/add")
    public String addMember(@RequestBody Member member){

        return memberService.addMember(member);
    }
    public Member findMemberWithMostTrainers() {


        return MemberService.findMemberWithMostTrainers();
    }
}
