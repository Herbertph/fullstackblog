package com.example.blogbackend.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@Document(collection = "posts")
public class PostModel {

    @Id
    private String id;
    @NonNull
    private String title;
    @NonNull
    private String content;
    private LocalDateTime createdAt;

}
