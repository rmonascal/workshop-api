package com.mahisoft.workshop.api.headerchecker.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { PrimeValidator.class })
public @interface IsPrime {
    String message() default "Value is not a prime number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
