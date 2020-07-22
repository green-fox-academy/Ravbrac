package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class ReducedArray {
    private int result;

    public ReducedArray(String what, int[] numbers) {
        this.result = handle(what, numbers);
    }

    public Integer sumNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, Integer::sum);
    }

    public Integer multiplyNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(1, (a, b) -> a * b);
    }

    public int handle(String what, int[] numbers) {
        if (what.equals("sum")) {
            return sumNumbers(numbers);
        }else if (what.equals("multiply")) {
            return multiplyNumbers(numbers);
        }
        return 0;
    }
}
