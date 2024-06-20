package com.eletra.ClientReports.controller;
import com.eletra.ClientReports.dtos.page.PaginatedResponseDto;
import com.eletra.ClientReports.dtos.report.ReportDto;
import com.eletra.ClientReports.service.ReportService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reports")
public class ReportController {

    private final ReportService reportService;

    @GetMapping
    public ResponseEntity<List<ReportDto>> getAllReports() {
        var Reports = reportService.GetAllReports();
        return ResponseEntity.status(HttpStatus.OK).body(Reports);
    }
    @GetMapping("/paginated")
    public ResponseEntity<PaginatedResponseDto<ReportDto>> getPaginatedReports() {
        PaginatedResponseDto<ReportDto> reports = reportService.getAllReports(0, 10);
        return ResponseEntity.status(HttpStatus.OK).body(reports);
    }


}
