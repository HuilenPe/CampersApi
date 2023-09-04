package com.back.demo.service;

import java.util.ArrayList;
import java.util.List;
import com.back.demo.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    private final SignupRepository signupRepository;

    @Autowired
    public SignupService(SignupRepository signupRepository) {
        this.signupRepository = signupRepository;
    }
}
