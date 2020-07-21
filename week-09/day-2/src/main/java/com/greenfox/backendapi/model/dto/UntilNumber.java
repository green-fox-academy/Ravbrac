package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UntilNumber {

    private Integer until;
    private Integer result;

    public UntilNumber(String action, Integer until) {
        this.until = until;
        int counter = 0;
        if (action.equals("sum")) {
            for (int i = 0; i <= until; i++) {
                counter += i;
            }
        }else if (action.equals("factor")) {
            counter = 1;
            for (int i = 1; i <= until; i++) {
                counter *= i;
            }
        }

        this.result = counter;
    }
}
