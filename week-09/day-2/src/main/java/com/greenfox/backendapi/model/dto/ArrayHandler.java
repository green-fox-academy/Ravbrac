package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class ArrayHandler {
    private String what;
    private int[] numbers;

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public Integer sumNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, Integer::sum);
    }

    public Integer multiplyNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, (a, b) -> a * b);
    }

    public int[] doubleNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .map(n -> n * 2)
                .toArray();
    }

    public void handle(String what, int[] numbers) {
        switch (what) {
            case "sum":
                sumNumbers(numbers);
                break;
            case "multiply":
                multiplyNumbers(numbers);
                break;
            case "double":
                doubleNumbers(numbers);
                break;
        }
    }
}
