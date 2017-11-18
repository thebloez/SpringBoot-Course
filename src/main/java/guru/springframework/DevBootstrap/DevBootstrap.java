package guru.springframework.DevBootstrap;

import guru.springframework.model.Author;
import guru.springframework.model.Book;
import guru.springframework.model.Publisher;
import guru.springframework.repositories.AuthorRepositories;
import guru.springframework.repositories.BookRepositories;
import guru.springframework.repositories.PublisherRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Ryan on 18/11/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired private AuthorRepositories authorRepositories;
    @Autowired private BookRepositories bookRepositories;
    @Autowired private PublisherRepositories publisherRepositories;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        // add new publisher and entity book
        Publisher fajarTB = new Publisher();
        fajarTB.setName("Toko Buku Fajar");
        fajarTB.setAddress("Pasapen");
        publisherRepositories.save(fajarTB);

        Publisher gehena = new Publisher("Gehena", "Otista");
        publisherRepositories.save(gehena);

        // Ryan
        Author ryan = new Author("Ryan", "Thebloez");
        Book theHobbit = new Book("Domain Driven Design", "1234", fajarTB);
        ryan.getBooks().add(theHobbit);

        authorRepositories.save(ryan);
        bookRepositories.save(theHobbit);

        // Bluscang
        Author bluscang = new Author("Bluscang", "Thebloez");
        Book noEJB = new Book("J2EE Dev without EJB","23445", gehena);
        bluscang.getBooks().add(noEJB);

        authorRepositories.save(bluscang);
        bookRepositories.save(noEJB);

    }

}
