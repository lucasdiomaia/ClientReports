package com.eletra.ClientReports.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "menuitemsid", nullable = false)
    private Integer menuItemsId;

    @Basic
    @Column(name = "filterid")
    private Integer filterId;

    @Basic
    @Column(name = "reportstructureid", nullable = false)
    private Integer reportStructureId;

    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "isactivity", nullable = false)
    private Boolean isActivity;

    @Basic
    @Column(name = "isvisibility", nullable = false)
    private Boolean isVisibility;

    @Basic
    @Column(name = "prioritylevel", nullable = false)
    private Integer priorityLevel;

    @Basic
    @Column(name = "displayorder", nullable = false)
    private Integer displayOrder;

    @Basic
    @Column(name = "exporttype", nullable = false)
    private Integer exportType;

    @Column(name = "description", columnDefinition = "NVARCHAR(MAX)")
    private String description;

    @Basic
    @Column(name = "usercreate")
    private String userCreate;

    @Basic
    @Column(name = "useredit")
    private String userEdit;

    @Basic
    @Column(name = "datecreate")
    private LocalDateTime dateCreate;

    @Basic
    @Column(name = "dateedit")
    private LocalDateTime dateEdit;

    @ManyToOne
    @JoinColumn(name = "menuitemsid", insertable = false, updatable = false)
    private MenuItem menuItem;

    @ManyToOne
    @JoinColumn(name = "reportstructureid", insertable = false, updatable = false)
    private ReportStructure reportStructure;
}
