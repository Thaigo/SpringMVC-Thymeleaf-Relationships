package relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import relationship.model.Filho;

@Repository
public interface FilhoRepository extends JpaRepository<Filho, Long> {

}
