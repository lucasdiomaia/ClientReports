package com.eletra.ClientReports.dtos.filter;


import com.eletra.ClientReports.Enum.FilterType;
import lombok.Data;

@Data
public class FilterDto {
private int id;
private String name;
private String description;
private FilterType filterType;
private String defaultValue;
}
