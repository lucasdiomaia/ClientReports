package com.eletra.ClientReports.model;

import jakarta.persistence.*;
import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Entity
@Table(name = "MenuItems")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ParentId")
    private Integer parentId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Level", nullable = false)
    private int level;

    @Column(name = "DisplayOrder", nullable = false)
    private int displayOrder;

    @Column(name = "IsReport", nullable = false)
    private boolean isReport;

    @Column(name = "IsActive", nullable = false)
    private boolean isActive;

    @Column(name = "UserCreate")
    private String userCreate;

    @Column(name = "UserEdit")
    private String userEdit;

    @Column(name = "DateCreate")
    private Date dateCreate;

    @Column(name = "DateEdit")
    private Date dateEdit;

    @ManyToOne
    @JoinColumn(name = "ParentId", insertable = false, updatable = false)
    private MenuItem parent;
}
