package com.eletra.ClientReports.models.dtos.filter;


import com.eletra.ClientReports.models.enums.FilterType;
import lombok.Data;

@Data
public class FilterDto {
private int id;
private String name;
private String description;
private FilterType filterType;
private String defaultValue;
}
