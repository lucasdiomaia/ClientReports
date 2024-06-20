package com.eletra.ClientReports.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Entity
@Table(name = "menuitems")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "parentid")
    private Integer parentId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "level", nullable = false)
    private Integer level;

    @Column(name = "DisplayOrder", nullable = false)
    private Integer displayOrder;

    @Column(name = "IsReport", nullable = false)
    private Boolean isReport;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive;

    @Column(name = "UserCreate")
    private String userCreate;

    @Column(name = "UserEdit")
    private String userEdit;

    @Column(name = "DateCreate")
    private LocalDateTime dateCreate;

    @Column(name = "DateEdit")
    private LocalDateTime dateEdit;

    @ManyToOne
    @JoinColumn(name = "ParentId", insertable = false, updatable = false)
    private MenuItem parent;
}
