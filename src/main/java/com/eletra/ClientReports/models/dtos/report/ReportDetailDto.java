package com.eletra.ClientReports.models.dtos.report;

import com.eletra.ClientReports.models.dtos.filter.FilterDto;
import lombok.Data;
import java.util.List;

@Data
public class ReportDetailDto {
    private Integer id;
    private String name;
    private List<FilterDto> filters;
}
