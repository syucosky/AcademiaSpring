package Repository;

import Modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersona extends CrudRepository<Persona, Integer> {


}
