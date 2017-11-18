package guru.springframework.repositories;

import guru.springframework.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ryan on 18/11/17.
 */
@Repository
public interface PublisherRepositories extends JpaRepository<Publisher, Integer> {
}
