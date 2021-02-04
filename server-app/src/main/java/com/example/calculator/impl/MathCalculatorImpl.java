package com.example.calculator.impl;

import com.example.calculator.MathCalculatorService;
import com.example.calculator.annotations.RSocketHandler;
import com.example.calculator.annotations.SpringRSocketService;
import reactor.core.publisher.Mono;

@SpringRSocketService("com.example.calculator.MathCalculatorService")
public class MathCalculatorImpl implements MathCalculatorService {

    @RSocketHandler("square")
    public Mono<Integer> square(Integer input) {
        System.out.println("received: " + input);
        return Mono.just(input * input);
    }
}
