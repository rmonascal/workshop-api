package com.mahisoft.workshop.api.headerchecker.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderCheckerController {

    @RequestMapping("/header/checker")
    public String check(@RequestHeader HttpHeaders header) {
        return "Got this: " + header.toString();
    }

}
