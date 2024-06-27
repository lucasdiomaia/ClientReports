package com.eletra.ClientReports.models.entities;

import jakarta.persistence.*;
import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Entity
@Table(name = "Filter")
public class FilterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ReportID", nullable = false)
    private int reportId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", columnDefinition = "NVARCHAR(MAX)")
    private String description;

    @Column(name = "Position")
    private int position;

    @Column(name = "DefaultValue")
    private String defaultValue;

    @Column(name = "IsActive", nullable = false)
    private boolean isActive;

    @Column(name = "Type", nullable = false)
    private Integer type;

    @Column(name = "UserCreate")
    private String userCreate;

    @Column(name = "UserEdit")
    private String userEdit;

    @Column(name = "DateCreate")
    private Date dateCreate;

    @Column(name = "DateEdit")
    private Date dateEdit;

    @ManyToOne
    @JoinColumn(name = "ReportID", insertable = false, updatable = false)
    private ReportEntity reportEntity;
}
