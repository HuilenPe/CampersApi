package com.back.demo.service;

import com.back.demo.repository.CamperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamperService {
    private final CamperRepository camperRepository;

    @Autowired
    public CamperService(CamperRepository camperRepository) {
        this.camperRepository = camperRepository;
    }

}
