package com.example.blogbackend.controller;

import com.example.blogbackend.model.PostModel;
import com.example.blogbackend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    // Add a method to get all posts
    @GetMapping
    public List<PostModel> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public PostModel createPost(@RequestBody PostModel post) {
        return postService.createPost(post);
    }

    //Delete a post
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable String id) {
        postService.deletePost(id);
    }

    //Update a post
    @PutMapping("/{id}")
    public PostModel updatePost(@PathVariable String id, @RequestBody PostModel post) {
        return postService.updatePost(id, post);
    }
}
