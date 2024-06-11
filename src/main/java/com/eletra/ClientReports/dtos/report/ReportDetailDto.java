package com.eletra.ClientReports.dtos.report;

import com.eletra.ClientReports.dtos.filter.FilterDto;
import lombok.Data;
import java.util.List;

@Data
public class ReportDetailDto {
    private int id;
    private String name;
    private List<FilterDto> filters;
}
