package com.eletra.ClientReports.dtos.page;


import com.eletra.ClientReports.dtos.report.ReportDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginatedResponseDto<T> {
    private Object data;
    private int page;
    private int size;
    private int totalPages;
    private long totalElements;
}