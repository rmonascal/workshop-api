package com.mahisoft.workshop.api.headerchecker.config;

import com.mahisoft.workshop.api.headerchecker.converter.StringToPrimeInteger;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToPrimeInteger());
    }
}
