package com.eletra.ClientReports.models.entities;

import jakarta.persistence.*;
import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Entity
@Table(name = "ReportStructure")
public class ReportStructureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Id", nullable = false)
    private int Id;

    @Column(name = "TableName", nullable = false)
    private String tableName;

    @Column(name = "UpdatePriority")
    private Integer updatePriority;

    @Column(name = "UserCreate")
    private String userCreate;

    @Column(name = "UserEdit")
    private String userEdit;

    @Column(name = "DateCreate")
    private Date dateCreate;

    @Column(name = "DateEdit")
    private Date dateEdit;

    @ManyToOne
    @JoinColumn(name = "DatabaseId", insertable = false, updatable = false)
    private DatabaseEntity database;
}
