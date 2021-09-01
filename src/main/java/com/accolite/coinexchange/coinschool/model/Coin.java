package com.accolite.coinexchange.coinschool.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="coins")
public class Coin {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private float price;

    @Column(name="listed",insertable = false)
    private int listed=1;

    @Column(name = "first_listed_on",insertable = false)
    private LocalDateTime firstListedOn;

    @Column(name = "created_by")
    private long createdBy;

    @Column(name = "updated_by")
    private long updatedBy;

    @Column(name = "created_at",insertable = false,columnDefinition = "timestamp with time zone default CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "updated_at",insertable = false,columnDefinition = "timestamp with time zone default CURRENT_TIMESTAMP")
    private LocalDateTime updatedAt;

    @Column(name = "deleted")
    private int deleted;



}
