package com.eletra.ClientReports.model;

import jakarta.persistence.*;
import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Entity
@Table(name = "Report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "MenuItemsId", nullable = false)
    private int menuItemsId;

    @Column(name = "FilterId")
    private Integer filterId;

    @Column(name = "ReportStructureId", nullable = false)
    private int reportStructureId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "IsActivity", nullable = false)
    private boolean isActivity;

    @Column(name = "IsVisibility", nullable = false)
    private boolean isVisibility;

    @Column(name = "PriorityLevel", nullable = false)
    private int priorityLevel;

    @Column(name = "DisplayOrder", nullable = false)
    private int displayOrder;

    @Column(name = "IsExportExcel", nullable = false)
    private boolean isExportExcel;

    @Column(name = "Description", columnDefinition = "NVARCHAR(MAX)")
    private String description;

    @Column(name = "UserCreate")
    private String userCreate;

    @Column(name = "UserEdit")
    private String userEdit;

    @Column(name = "DateCreate")
    private Date dateCreate;

    @Column(name = "DateEdit")
    private Date dateEdit;

    @ManyToOne
    @JoinColumn(name = "MenuItemsId", insertable = false, updatable = false)
    private MenuItem menuItem;

    @ManyToOne
    @JoinColumn(name = "ReportStructureId", insertable = false, updatable = false)
    private ReportStructure reportStructure;
}
