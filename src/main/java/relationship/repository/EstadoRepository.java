package relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import relationship.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
