package kr.co.fastcampus.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // 접속을 하기위한 어노테이션
public class WelcomeController {

    @GetMapping("/")
    public String hello() {
        return "Hello, world!!!";
    }
}
