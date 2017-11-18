package guru.springframework.repositories;

import guru.springframework.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ryan on 18/11/17.
 */
@Repository
public interface BookRepositories extends CrudRepository<Book, Integer> {
}
