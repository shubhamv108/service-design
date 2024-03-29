package code.shubham.bookmyshow.api.core.repositories;

import code.shubham.bookmyshow.api.core.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
