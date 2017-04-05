package relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import relationship.model.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

}
