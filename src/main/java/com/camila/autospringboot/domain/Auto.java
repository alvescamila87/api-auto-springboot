package com.camila.autospringboot.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Auto {

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("model")
    private String model;

    @JsonProperty("price_in_cents") // snake_case
    private int priceInCents;
}
