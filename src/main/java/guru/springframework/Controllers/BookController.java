package guru.springframework.Controllers;

import guru.springframework.repositories.BookRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ryan on 19/11/17.
 */
@Controller
public class BookController {

    @Autowired private BookRepositories bookRepositories;

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepositories.findAll());

        return "books";
    }

}
