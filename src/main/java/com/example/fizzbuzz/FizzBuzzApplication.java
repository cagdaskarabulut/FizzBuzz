package com.example.fizzbuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class FizzBuzzApplication {

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzApplication.class, args);
    }

    public static String getFizzBuzzResult(int given){
        String result = "";
        if (given % 3 != 0 && given % 5 != 0 ) {
            result += given;
        } else {
            if (given % 3 == 0 ) result += "Fizz";
            if (given % 5 == 0 ) result += "Buzz";
        }
        return result;
    }

    public static String getFizzBuzzResultList(int givenLimit){
        String printString = "";
        for (int i = 1; i <= givenLimit; i++){
            printString += getFizzBuzzResult(i) + "\n";
        }
        return printString;
    }

    public static void printFizzBuzz(int givenLimit, Consumer<String> printer ){
        printer.accept(getFizzBuzzResultList(givenLimit));
    }
}
