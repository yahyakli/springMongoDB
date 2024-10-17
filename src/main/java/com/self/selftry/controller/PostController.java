package com.self.selftry.controller;


import com.self.selftry.model.Post;
import com.self.selftry.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PostController {

    private PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }

    @PutMapping("/post/{id}")
    public Post editPost(@PathVariable String id, @RequestBody Post post) {
        return postService.editPost(id ,post);
    }

    @DeleteMapping("/post/{id}")
    public String deletePost(@PathVariable String id){
        return postService.deletePost(id);
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAll();
    }

    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable String id){
        return postService.getPost(id);
    }

}
