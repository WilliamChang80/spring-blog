package com.blog.project.Service;

import com.blog.project.Model.Comment;
import com.blog.project.Model.Post;
import com.blog.project.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService
{
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComment(Long id)
    {
        List <Comment> comments= new ArrayList<>();
        commentRepository.findByPostId(id).forEach(comments::add);
        return comments;
    }

    public Comment getComment(Long commentId)
    {
        return commentRepository.findById(commentId).get();
    }

    public void addComment(Comment comment)
    {
        commentRepository.save(comment);
    }

    public void updateComment(Comment comment,Long commentId)
    {
        commentRepository.save(comment);
    }

    public void deleteCommment(Long commentId)
    {
        commentRepository.deleteById(commentId );
    }
}
