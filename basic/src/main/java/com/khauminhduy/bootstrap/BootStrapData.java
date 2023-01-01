package com.khauminhduy.bootstrap;

import com.khauminhduy.domain.Author;
import com.khauminhduy.domain.Book;
import com.khauminhduy.domain.Publisher;
import com.khauminhduy.repositories.AuthorRepository;
import com.khauminhduy.repositories.BookRepository;
import com.khauminhduy.repositories.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");

        eric.addBook(ddd);
        ddd.addAuthor(eric);
        ddd.setPublisher(publisher);
        publisher.addBook(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development Without J2EE", "1123123");
        rod.addBook(noEJB);
        noEJB.addAuthor(rod);
        noEJB.setPublisher(publisher);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());

        System.out.println("Ended in Bootstrap");
    }

}
