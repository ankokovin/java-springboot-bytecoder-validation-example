package com.example.javaspringbootbytecodervalidation.controller;

import com.example.javaspringbootbytecodervalidation.bytecoder.OrderValidator;
import com.example.javaspringbootbytecodervalidation.data.OrderDTO;
import com.example.javaspringbootbytecodervalidation.data.ValidationResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/hello")
public class OrderValidatorController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/")
    public ValidationResult validate(@RequestBody OrderDTO orderDTO) {
        return OrderValidator.validate(orderDTO, UUID.randomUUID().toString());
    }
}
