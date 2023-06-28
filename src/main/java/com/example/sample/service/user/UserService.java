package com.example.sample.service.user;

import com.example.sample.domain.user.Member;
import com.example.sample.domain.user.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
