package io.dany.apirest.repositories;

import io.dany.apirest.model.Bicicleta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Dany Diaz
 */
@RepositoryRestResource(path = "bicicletas", collectionResourceRel = "bicicletas")
public interface BicicletaRepository extends CrudRepository<Bicicleta, Long> {
}
