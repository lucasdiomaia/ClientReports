package com.eletra.ClientReports.mappers;

import com.eletra.ClientReports.models.dtos.report.ReportDto;
import com.eletra.ClientReports.models.entities.ReportEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class ReportMapper {
    public abstract ReportDto ToReportDto(ReportEntity reportEntity);
    public abstract List<ReportDto> ToReportDtoList(List<ReportEntity> reportEntities);
}
