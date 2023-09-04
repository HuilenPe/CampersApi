package com.back.demo.controller;

import com.back.demo.service.CamperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/campers")
public class CamperController {
    private final CamperService camperService;

    @Autowired
    public CamperController(CamperService camperService) {
        this.camperService = camperService;
    }
}