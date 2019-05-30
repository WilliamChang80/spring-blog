package com.blog.project.Repository;

import org.springframework.data.repository.CrudRepository;
import com.blog.project.Model.Post;

public interface PostRepository extends CrudRepository <Post, Long>
{


}
