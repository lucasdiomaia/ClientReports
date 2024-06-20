package com.eletra.ClientReports.service;

import com.eletra.ClientReports.dtos.page.PaginatedResponseDto;
import com.eletra.ClientReports.dtos.report.ReportDto;
import com.eletra.ClientReports.mappers.ReportMapper;
import com.eletra.ClientReports.model.Report;
import com.eletra.ClientReports.repository.ReportRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;
    private final ReportMapper reportMapper;

    public List<ReportDto> GetAllReports() {
        var reports = reportRepository.findAll();
        return reportMapper.ToReportDtoList(reports);
    }

    public PaginatedResponseDto<ReportDto> getAllReports(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Report> reportsPage = reportRepository.findAll(pageable);

        List<ReportDto> reportDtos = reportMapper.ToReportDtoList(reportsPage.getContent());

        return new PaginatedResponseDto<>(
                reportDtos,
                reportsPage.getNumber(),
                reportsPage.getSize(),
                reportsPage.getTotalPages(),
                reportsPage.getTotalElements()
        );
    }
}