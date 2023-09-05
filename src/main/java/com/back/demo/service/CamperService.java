package com.back.demo.service;

import com.back.demo.dto.CamperDTO;
import com.back.demo.model.Camper;
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

    public CamperDTO createCamper(CamperDTO camperDTO) {
        //Create a new Camper object from the data in the DTO
        Camper camper = new Camper();
        camper.setName(camperDTO.getName());
        camper.setAge(camperDTO.getAge());
        camper.setUsername(camperDTO.getUsername());
        camper.setPassword(camperDTO.getPassword());

        //Save the camper in the database using the repository
        camper = camperRepository.save(camper);

        // Return the camper created as CamperDTO
        return convertToCamperDTO(camper);
    }
    private CamperDTO convertToCamperDTO(Camper camper) {
        CamperDTO camperDTO = new CamperDTO();
        camperDTO.setId(camper.getId());
        camperDTO.setName(camper.getName());
        camperDTO.setAge(camper.getAge());
        camperDTO.setUsername(camper.getUsername());

        return camperDTO;
    }
}
