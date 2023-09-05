package com.back.demo.controller;

import com.back.demo.dto.CamperDTO;
import com.back.demo.service.CamperService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( )
public class CamperController {
    @Autowired
    private CamperService camperService;
    @PostMapping("/camper")
    public ResponseEntity<CamperDTO> createCamper(@Valid @RequestBody CamperDTO camperDTO) {
        // Create a new camper using camperDTO data
        CamperDTO newCamper = camperService.createCamper(camperDTO);
        // Returns the newly created camper in the response
        return ResponseEntity.status(HttpStatus.CREATED).body(newCamper);
    }
}