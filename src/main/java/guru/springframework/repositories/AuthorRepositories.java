package guru.springframework.repositories;

import guru.springframework.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ryan on 18/11/17.
 */
@Repository
public interface AuthorRepositories extends CrudRepository<Author, Integer> {
}
