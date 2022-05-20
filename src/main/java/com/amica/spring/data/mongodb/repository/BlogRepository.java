package com.amica.spring.data.mongodb.repository;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.amica.spring.data.mongodb.model.Blog;

public interface BlogRepository extends MongoRepository<Blog, String> {
  List<Blog> findByPublished(boolean published);
  List<Blog> findByTitleContaining(String title);
}
