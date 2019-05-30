package com.blog.project.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comment
{
    @Id
    private Long commentId;
    private String comment;
    private String userName;

    @ManyToOne
    private Post post;

    public Comment() {
    }

    public Comment(Long commentId, String comment, String userName, Long id)
    {
        this.commentId = commentId;
        this.comment = comment;
        this.userName = userName;
        this.post = new Post(id,"","","");
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setId(Long commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
