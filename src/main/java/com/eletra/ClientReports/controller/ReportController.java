package com.eletra.ClientReports.controller;


import com.eletra.ClientReports.dtos.report.ReportDto;
import com.eletra.ClientReports.repository.ReportRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportRepository reportRepository;

    @GetMapping
    public List<ReportDto> getAllReports() {
        return reportRepository.GetAllReports();
    }



}
