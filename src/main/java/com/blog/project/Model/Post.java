package com.blog.project.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Post
{
    @Id
    private Long id;
    private String title;
    private String body;
    private String author;

    public Post() {
    }

    public Post(Long id, String title, String body, String author)
    {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author=author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
