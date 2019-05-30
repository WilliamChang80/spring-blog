package com.blog.project.Service;


import com.blog.project.Model.Post;
import com.blog.project.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService
{
    @Autowired
    private PostRepository postRepository;

    public List <Post> getAllPost()
    {
        List <Post> posts= new ArrayList<>();
            postRepository.findAll().forEach(posts::add);
            return posts;
    }

    public Post getPost(Long id)
    {
        return postRepository.findById(id).get();
    }

    public void addPost(Post post)
    {
        postRepository.save(post);
    }

    public void updatePost(Post post,Long id)
    {
       postRepository.save(post);
    }

    public void deletePost(Long id)
    {
       postRepository.deleteById(id);
    }
}
