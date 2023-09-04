package com.back.demo.repository;

import com.back.demo.model.Camper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamperRepository extends JpaRepository<Camper, Long> {

}
