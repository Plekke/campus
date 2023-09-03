package be.ucll.campus.repository;

import be.ucll.campus.entity.Gebouw;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GebouwRepository extends CrudRepository<Gebouw, String> {


}
