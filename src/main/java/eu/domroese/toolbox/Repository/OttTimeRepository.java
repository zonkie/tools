package eu.domroese.toolbox.Repository;

import eu.domroese.toolbox.Model.OttTime;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface OttTimeRepository extends CrudRepository<OttTime, Integer> {

    @Query(value = "SELECT ottt.id, ottt.end, ottt.project, ottt.start, ottt.story, ottt.task FROM ott_time ottt WHERE ottt.end IS NULL", nativeQuery = true)
    Optional<OttTime> findActiveEntry();

}