package com.eletra.ClientReports.service.impl;

import com.eletra.ClientReports.models.dtos.page.PaginatedResponseDto;
import com.eletra.ClientReports.models.dtos.report.ReportDto;
import com.eletra.ClientReports.mappers.ReportMapper;
import com.eletra.ClientReports.models.entities.ReportEntity;
import com.eletra.ClientReports.repository.ReportRepository;
import com.eletra.ClientReports.util.PaginationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl {

    private final ReportRepository reportRepository;
    private final ReportMapper reportMapper;

    public List<ReportDto> GetAllReports() {
        var reports = reportRepository.findAll();
        return reportMapper.ToReportDtoList(reports);
    }

    public PaginatedResponseDto getAllReports(Integer page, Integer size, String filter) {
        if (page < 0) {
            throw new IllegalArgumentException("O número da página não pode ser negativo:"+ page);
        }
        if (size <= 0) {
            throw new IllegalArgumentException("O tamanho da página deve ser maior que zero:" + size);
        }

        Pageable pageable = PageRequest.of(page, size);
        Page<ReportEntity> reportsPage = reportRepository.findAll(pageable);

        List<ReportDto> reportDtos = reportMapper.ToReportDtoList(reportsPage.getContent());
        return PaginationUtil.getPaginatedResponseDto(reportsPage, reportDtos);
    }
}