package com.eletra.ClientReports.controller;

import com.eletra.ClientReports.model.Area;
import com.eletra.ClientReports.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/area")
public class AreaController {

    private final AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("")
    private List<Area> GetAreas() {
        return areaService.getAllAreas();
    }



}
