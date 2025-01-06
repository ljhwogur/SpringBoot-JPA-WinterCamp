package com.example.jpatest.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository MemberRepository;

    public List<Member> getAllMembers() {
        // DB 핸들링... 여러가지를 더 넣을수도 있고
        return MemberRepository.findAll();
    }
}
