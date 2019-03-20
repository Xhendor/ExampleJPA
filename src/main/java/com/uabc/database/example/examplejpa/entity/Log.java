package com.uabc.database.example.examplejpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "log")
public class Log {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "details")
    private String details;

    @Column(name = "username")
    private String username;

    @Column(name = "url")
    private String url;


    public Log(Date date, String details, String username, String url) {
        this.date = date;
        this.details = details;
        this.username = username;
        this.url = url;
    }

}
