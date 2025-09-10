package com.ming.aws;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
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
    Map<String, String> hello() throws UnknownHostException {
        String inetAddress = InetAddress.getLocalHost().getHostAddress();
        return Map.of("InstanceIP: ", inetAddress);
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
