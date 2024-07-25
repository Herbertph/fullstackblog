package com.example.blogbackend.repository;

import com.example.blogbackend.model.PostModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<PostModel, String> {
}
