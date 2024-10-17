package com.self.selftry.repo;

import com.self.selftry.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post, String> {
}
