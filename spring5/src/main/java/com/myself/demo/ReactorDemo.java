package com.myself.demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactorDemo {
    public static void main(String[] args) {
        //Flux.just("hello","word").subscribe(System.out::println);
        Mono.create(monoSink -> monoSink.success("hello")).subscribe(System.out::println);
    }
}
