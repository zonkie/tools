package eu.domroese.toolbox.Repository;

import eu.domroese.toolbox.Model.OttTime;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface OttTimeRepository extends CrudRepository<OttTime, Integer> {

}