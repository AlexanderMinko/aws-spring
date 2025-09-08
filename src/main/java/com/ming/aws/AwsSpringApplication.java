package com.ming.aws;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class AwsSpringApplication {

//    private final UsersRepository usersRepository;

    public static void main(String[] args) {
        SpringApplication.run(AwsSpringApplication.class, args);
    }

    @GetMapping("/hello")
    Map<String, String> hello() {
        try {
            String inetAddress = InetAddress.getLocalHost().getHostAddress();
            return Map.of("InstanceIP", inetAddress);
        } catch (Exception e) {
            return Map.of("InstanceIP", e.getMessage());
        }
    }

//    @PostMapping("/user")
//    public User create(@RequestBody User user) {
//        return usersRepository.save(user);
//    }
//
//    @GetMapping("/users")
//    public List<User> read() {
//        return usersRepository.findAll();
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        usersRepository.deleteById(id);
//    }

}
