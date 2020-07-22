package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@Getter
@Setter
public class DoubledArray {
    private int[] result;

    public DoubledArray(int[] numbers) {
        this.result = doubleNumbers(numbers);
    }

    public int[] doubleNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .map(n -> n * 2)
                .toArray();
    }
}
