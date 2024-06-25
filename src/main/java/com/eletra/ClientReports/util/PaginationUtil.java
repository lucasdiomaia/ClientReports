package com.eletra.ClientReports.util;

import com.eletra.ClientReports.dtos.page.PaginatedResponseDto;
import lombok.experimental.UtilityClass;
import org.springframework.data.domain.Page;


@UtilityClass
public class PaginationUtil {
    public static PaginatedResponseDto getPaginatedResponseDto(Page<?> page, Object data) {
        return new PaginatedResponseDto(
                data,
                page.getNumber(),
                page.getSize(),
                page.getTotalPages(),
                page.getTotalElements()
        );
    }
}
