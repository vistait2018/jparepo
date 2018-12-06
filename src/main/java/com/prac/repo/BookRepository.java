package com.prac.repo;

import com.prac.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Perspective on 12/4/2018.
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
