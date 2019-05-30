package com.blog.project.Controller;

import com.blog.project.Model.Comment;
import com.blog.project.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.blog.project.Model.Post;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommentController
{
    @Autowired
    private CommentService commentService;

    @RequestMapping("/post/{id}/comments")
    public List<Comment> getAllComment(@PathVariable Long id)
    {
        return commentService.getAllComment(id);
    }

    @RequestMapping("/post/{id}/comments/{commentId}")
    public Comment getComment(@PathVariable Long commentId)
    {
        return commentService.getComment(commentId);
    }

    @RequestMapping(method = RequestMethod.POST,value="/post/{id}/comments")
    public void addPost(@RequestBody Comment comment,@PathVariable Long id)
    {
        comment.setPost(new Post(id,"","",""));
        commentService.addComment(comment);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/post/{id}/comments/{commentId}")
    public void updateComment(@RequestBody Comment comment,@PathVariable Long commentId)
    {
        comment.setPost(new Post(commentId,"","",""));
        commentService.updateComment(comment,commentId);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/post/{id}/comments/{commentId}")
    public void deleteComment(@PathVariable Long commentId)
    {
        commentService.deleteCommment(commentId);
    }
}
