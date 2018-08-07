package com.mahisoft.workshop.api.headerchecker.converter;

import com.mahisoft.workshop.api.headerchecker.domain.PrimeInteger;
import org.springframework.core.convert.converter.Converter;

public class StringToPrimeInteger implements Converter<String, PrimeInteger> {
    @Override
    public PrimeInteger convert(String source) {
        return new PrimeInteger(Integer.valueOf(source));
    }
}
