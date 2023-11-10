package InterfaceService;

import Modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    public List<Persona> listar();

    public Optional<Persona> findById(int id);

    public int save(Persona persona);

    public void delete(int id);

}
