package com.blog.project.Controller;

import com.blog.project.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.blog.project.Model.Post;

import java.util.Arrays;
import java.util.List;
@RestController
public class PostController
{
    @Autowired
    private PostService postService;

    @RequestMapping("/home")
    public List <Post> getAllPosts()
    {
        return postService.getAllPost();
    }

    @RequestMapping("/post/{id}")
    public Post getPost(@PathVariable Long id)
    {
        return postService.getPost(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/add")
    public void addPost(@RequestBody Post post)
    {
        postService.addPost(post);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/post/{id}")
    public void updatePost(@RequestBody Post post,@PathVariable Long id)
    {
        postService.updatePost(post,id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/post/{id}")
    public void deletePost(@PathVariable Long id)
    {
        postService.deletePost(id);
    }
}
