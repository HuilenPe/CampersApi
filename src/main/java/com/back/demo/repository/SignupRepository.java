package com.back.demo.repository;
import com.back.demo.model.Signup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<Signup, Long> {
}