package com.prac.repo;

import com.prac.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Perspective on 12/4/2018.
 */

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
