package com.blog.project.Repository;

import com.blog.project.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository <Comment,Long>
{
     List <Comment> findByPostId(Long id);
}
