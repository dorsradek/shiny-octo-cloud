package pl.rdors.shiny.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.rdors.shiny.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
