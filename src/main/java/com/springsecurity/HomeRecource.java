package com.springsecurity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRecource {
	

    @GetMapping("/home")
    public ResponseEntity<String> homePage() {
        return ResponseEntity.ok("home page");
    }
    @GetMapping("/admin/home")
    public ResponseEntity<String> adminUser() {
        return ResponseEntity.ok("home admin");
    }
    @GetMapping("/user/home")
    public ResponseEntity<String> normalUser() {
        return ResponseEntity.ok("home user");
    }
}
