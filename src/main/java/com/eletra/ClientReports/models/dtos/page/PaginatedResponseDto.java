package com.eletra.ClientReports.models.dtos.page;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginatedResponseDto {
    private Object data;
    private int page;
    private int size;
    private int totalPages;
    private long totalElements;
}