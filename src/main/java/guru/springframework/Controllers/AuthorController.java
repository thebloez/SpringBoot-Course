package guru.springframework.Controllers;

import guru.springframework.repositories.AuthorRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ryan on 19/11/17.
 */
@Controller
public class AuthorController {

    @Autowired private AuthorRepositories authorRepositories;

    @RequestMapping("/authors")
    public String getAuthor(Model model){

        model.addAttribute("authors", authorRepositories.findAll());

        return "authors";
    }
}
