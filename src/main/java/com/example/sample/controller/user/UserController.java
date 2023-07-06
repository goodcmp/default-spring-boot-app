package com.example.sample.controller.user;

import com.example.sample.domain.user.Member;
import com.example.sample.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        log.info("hello!");
        List<Member> members = userRepository.findAll();
        return "hello " + members.get(0).getName();
    }

}
