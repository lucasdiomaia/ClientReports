package com.eletra.ClientReports.controller;
import com.eletra.ClientReports.models.dtos.page.PaginatedResponseDto;
import com.eletra.ClientReports.models.dtos.report.ReportDto;
import com.eletra.ClientReports.service.impl.ReportServiceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reports")
public class ReportController {

    private final ReportServiceImpl reportService;

    @GetMapping
    public ResponseEntity<List<ReportDto>> getAllReports() {
        var Reports = reportService.GetAllReports();
        return ResponseEntity.status(HttpStatus.OK).body(Reports);
    }
    @GetMapping("/paginated")
    public ResponseEntity<PaginatedResponseDto> getPaginatedReports(@RequestParam(defaultValue = "0") @Validated int page, @RequestParam(defaultValue = "0") int size, @RequestParam(required = false) String filter) throws Exception {
        PaginatedResponseDto reports = reportService.getAllReports(page, size,filter);
        return ResponseEntity.status(HttpStatus.OK).body(reports);
    }


}
