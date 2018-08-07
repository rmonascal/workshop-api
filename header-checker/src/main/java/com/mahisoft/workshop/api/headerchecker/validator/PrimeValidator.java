package com.mahisoft.workshop.api.headerchecker.validator;

import com.mahisoft.workshop.api.headerchecker.domain.PrimeInteger;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PrimeValidator implements ConstraintValidator<IsPrime, PrimeInteger> {
    @Override
    public void initialize(IsPrime value) {}

    @Override
    public boolean isValid(PrimeInteger value, ConstraintValidatorContext context) {
        if (value.getValue() == null) return false;
        for (int i = 2 ; i * i <= value.getValue() ; i++)
            if (value.getValue() % i == 0) return false;
        return true;
    }
}
