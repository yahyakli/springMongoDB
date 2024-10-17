package com.self.selftry.model;

import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("posts")
public class Post {
    @Id
    @UuidGenerator
    private String id;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
}
