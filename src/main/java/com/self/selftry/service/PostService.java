package com.self.selftry.service;


import com.self.selftry.model.Post;
import com.self.selftry.repo.PostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepo postRepo;

    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public Post addPost(Post post){
        postRepo.insert(post);
        return post;
    }

    public Post editPost(String id, Post post) {
        var oldpost =postRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        oldpost.setTitle(post.getTitle());
        oldpost.setDescription(post.getDescription());

        postRepo.save(oldpost);

        return oldpost;
    }

    public String deletePost(String id) {
        var post = postRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        postRepo.delete(post);

        return "Post Deleted Success";
    }

    public List<Post> getAll (){
        return postRepo.findAll();
    }

    public Post getPost (String id){
        return postRepo.findById(id).orElseThrow(() -> new RuntimeException("Post Not Found"));
    }
}
