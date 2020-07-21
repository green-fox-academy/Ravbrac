package com.greenfox.backendapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class InputNumber {

    private Integer received;
    private Integer result;

    public InputNumber(Integer received){
        this.received = received;
        this.result = received * 2;
    }


}