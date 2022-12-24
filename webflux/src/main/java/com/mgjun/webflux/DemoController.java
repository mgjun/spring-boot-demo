package com.mgjun.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class DemoController {

    @GetMapping("test/{delay}")
    public Mono<String> get(@PathVariable("delay") Long delay) {
        return Mono.just("hello mono webFlux")
                .delayElement(Duration.ofMillis(delay));

    }
}
