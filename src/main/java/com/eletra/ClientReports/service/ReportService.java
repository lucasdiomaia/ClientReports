package com.eletra.ClientReports.service;

import com.eletra.ClientReports.dtos.report.ReportDto;
import com.eletra.ClientReports.mappers.ReportMapper;
import com.eletra.ClientReports.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
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

}
