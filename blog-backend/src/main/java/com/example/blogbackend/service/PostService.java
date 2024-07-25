package com.example.blogbackend.service;

import com.example.blogbackend.model.PostModel;
import com.example.blogbackend.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // Add a method to get all posts
    public List<PostModel> getAllPosts() {
        return postRepository.findAll();
    }

    // Add a method to get a post by id
    public PostModel getPostById(String id) {
        return postRepository.findById(id).orElse(null);
    }

    // Add a method to create a post
    public PostModel createPost(PostModel post) {
        post.setCreatedAt(LocalDateTime.now());
        return postRepository.save(post);
    }

    // Add a method to update a post
   public PostModel updatePost(String id, PostModel post) {
        PostModel existingPost = postRepository.findById(id).orElse(null);
        if (existingPost == null) {
            return null;
        }
        existingPost.setTitle(post.getTitle());
        existingPost.setContent(post.getContent());
        return postRepository.save(existingPost);
    }

    // Add a method to delete a post
    public void deletePost(String id) {
        postRepository.deleteById(id);
    }

}
