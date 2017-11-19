package guru.springframework.rest;

import com.fasterxml.jackson.databind.node.ObjectNode;
import guru.springframework.model.Author;
import guru.springframework.model.Book;
import guru.springframework.repositories.AuthorRepositories;
import guru.springframework.repositories.BookRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Ryan on 19/11/17.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest-controller")
public class RestController {

    @Autowired private AuthorRepositories authorRepositories;
    @Autowired private BookRepositories bookRepositories;


    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAuthor(){

        List<Author> authorList = (List<Author>) authorRepositories.findAll();
        ResponseEntity<List<Author>> resp = new ResponseEntity<>(authorList, HttpStatus.OK);
        return resp;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){

        List<Book> bookList = (List<Book>) bookRepositories.findAll();
        ResponseEntity<List<Book>> resp = new ResponseEntity<>(bookList, HttpStatus.OK);
        return resp;
    }

}
