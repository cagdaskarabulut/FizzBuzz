package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class FizzBuzzApplicationTest {

    @Mock
    FizzBuzzApplication fizzBuzzApplication;


    @Test
    public void whenGiven1_thenReturn1() throws Exception {
        assertThat(fizzBuzzApplication.getFizzBuzzResult(1)).isEqualTo("1");
    }

    @Test
    public void whenGiven2_thenReturn2() throws Exception {
        assertThat(fizzBuzzApplication.getFizzBuzzResult(2)).isEqualTo("2");
    }

    @Test
    public void whenGiven3_thenReturnFizz() throws Exception {
        assertThat(fizzBuzzApplication.getFizzBuzzResult(3)).isEqualTo("Fizz");
    }

    @Test
    public void whenGiven5_thenReturnBuzz() throws Exception {
        assertThat(fizzBuzzApplication.getFizzBuzzResult(5)).isEqualTo("Buzz");
    }

    @Test
    public void whenGiven15_thenReturnFizzBuzz() throws Exception {
        assertThat(fizzBuzzApplication.getFizzBuzzResult(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void whenGivenUntil15_thenReturnFizzBuzzResultList() throws Exception {
        assertThat(fizzBuzzApplication.getFizzBuzzResultList(15)).isEqualTo("""
                1
                2
                Fizz
                4
                Buzz
                Fizz
                7
                8
                Fizz
                Buzz
                11
                Fizz
                13
                14
                FizzBuzz
                """);
    }

    @Test
    public void whenGivenUntil15_thenReturnPrintFizzBuzz() throws Exception {
        Consumer printer = Mockito.mock(Consumer.class);
        fizzBuzzApplication.printFizzBuzz(15,printer);
        verify(printer).accept("""
                1
                2
                Fizz
                4
                Buzz
                Fizz
                7
                8
                Fizz
                Buzz
                11
                Fizz
                13
                14
                FizzBuzz
                """);
    }




}
