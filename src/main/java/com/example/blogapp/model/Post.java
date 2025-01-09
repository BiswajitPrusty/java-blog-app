package com.example.blogapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;
    @Column(name = "image_name")
    private String imageName ;
    @Column(name = "post_date")
    private Date postDate;

    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;
}