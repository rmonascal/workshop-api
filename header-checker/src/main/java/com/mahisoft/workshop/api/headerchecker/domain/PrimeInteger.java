package com.mahisoft.workshop.api.headerchecker.domain;

import com.mahisoft.workshop.api.headerchecker.validator.IsPrime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PrimeInteger {
    @IsPrime
    private Integer value;
}
