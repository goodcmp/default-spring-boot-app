package com.example.sample.service.user;

import com.example.sample.domain.user.Member;
import com.example.sample.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        Member member = Member.of("클로버");
        userRepository.save(member);
    }
}
