package com.eletra.ClientReports.repository;


import com.eletra.ClientReports.dtos.report.ReportDto;
import com.eletra.ClientReports.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {

    List<ReportDto> GetAllReports();
}
