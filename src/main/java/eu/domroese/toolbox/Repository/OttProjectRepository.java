package eu.domroese.toolbox.Repository;

import org.springframework.data.repository.CrudRepository;

import eu.domroese.toolbox.Model.OttProject;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface OttProjectRepository extends CrudRepository<OttProject, Integer> {

}