package be.ucll.campus.repository;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.entity.Lokaal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LokaalRepository extends CrudRepository<Lokaal,Long> {

    List<Lokaal> getAllLokalen();
    void addLokaal(Lokaal lokaal);
    public Lokaal getLokaal(Integer id);

    public void updateLokaal(Integer id, Lokaal lokaal);
    public void deleteLokaal(int id);

}
