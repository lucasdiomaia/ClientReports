package com.eletra.ClientReports.model;

import jakarta.persistence.*;
import java.util.Date;

@lombok.Getter
@lombok.Setter
@lombok.NoArgsConstructor
@Entity
@Table(name = "Databases")
public class Database {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int databaseId;

    @Column(name = "Name", nullable = false)
    private String name;

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
}
