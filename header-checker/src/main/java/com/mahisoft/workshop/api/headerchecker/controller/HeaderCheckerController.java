package com.mahisoft.workshop.api.headerchecker.controller;

import com.mahisoft.workshop.api.headerchecker.domain.PrimeInteger;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HeaderCheckerController {

    @RequestMapping("/header/checker")
    public String check(@RequestHeader(value = "Access-Key") @Valid PrimeInteger accessKey) {
        return "Got this: " + accessKey.getValue();
    }

}