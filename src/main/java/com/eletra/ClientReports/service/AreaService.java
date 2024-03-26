package com.eletra.ClientReports.service;


import com.eletra.ClientReports.model.Area;
import com.eletra.ClientReports.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    @Autowired
    public AreaService(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    public List<Area> getAllAreas() {
        return areaRepository.findAll();
    }

}
