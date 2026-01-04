package com.msa.auth.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Operation(
            description = "Health Check",
            summary = "Return 200"
    )
    @GetMapping(value = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> health(){
        return ResponseEntity.ok("Working fine in auth");
    }
}
