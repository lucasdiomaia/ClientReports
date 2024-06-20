package com.eletra.ClientReports.mappers;

import com.eletra.ClientReports.dtos.report.ReportDto;
import com.eletra.ClientReports.model.Report;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ReportMapper {
    public abstract ReportDto ToReportDto(Report report);
    public abstract List<ReportDto> ToReportDtoList(List<Report> report);
}
