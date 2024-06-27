package com.eletra.ClientReports.repository;


import com.eletra.ClientReports.models.entities.ReportEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Integer> {

    Page<ReportEntity> findByTitleContaining(String filter, Pageable pageable);
}
