package com.prac.bootstrap;

import com.prac.model.Author;
import com.prac.model.Book;
import com.prac.model.Publisher;
import com.prac.repo.AuthorRepository;
import com.prac.repo.BookRepository;
import com.prac.repo.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Perspective on 12/4/2018.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
           initData();
    }

    public void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("Wlae Johnson");
        publisher.setAddress("Ohio");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Cantona");
        Book ericsBook = new Book("My Carrer in Soccer", "ER12343", publisher);
        eric.getBooks().add(ericsBook);
        ericsBook.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ericsBook);



        Author eric1 = new Author("Eric1","Cantona1");
        Book eric1Book = new Book("My Carrer in Tennis", "ER12346", publisher);
        eric1.getBooks().add(eric1Book);
        eric1Book.getAuthors().add(eric1);
        authorRepository.save(eric1);
        bookRepository.save(eric1Book);
    }


}
