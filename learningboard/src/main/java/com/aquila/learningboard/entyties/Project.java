package com.aquila.learningboard.entyties;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Calendar;

@Data
@ToString(callSuper = false, of = {"id", "name"})
@EqualsAndHashCode(of = {"id", "name"})
@Table(name = "project",schema = "learningboard")
@Entity
public class Project {
    @Id
    @SequenceGenerator(name = "SEQ_PROJETO", sequenceName = "SEQ_PROJETO", allocationSize = 1, schema = "learningboard")
    @GeneratedValue(generator = "SEQ_PROJETO", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", length = 120, nullable = false)
    private String name;

    @Column(name = "description", length = 500, nullable = false)
    private String description;


    @Temporal(TemporalType.DATE)
    @Column(name = "startDate", nullable = false, columnDefinition = "DATE" )
    private LocalDate startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "endDate", columnDefinition = "DATE" )
    private LocalDate endDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", columnDefinition = "TIMESTAMP", nullable = false)
    private Calendar created_at = Calendar.getInstance();
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_at", columnDefinition = "TIMESTAMP", nullable = false)
    private Calendar updated_at = Calendar.getInstance();
}
