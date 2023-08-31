package be.ucll.campus.repository;

import be.ucll.campus.entity.Lokaal;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JpaLokaalRepository implements LokaalRepository{

    @Override
    public List<Lokaal> getAllLokalen() {
        return null;
    }

    @Override
    public void addLokaal(Lokaal lokaal) {

    }

    @Override
    public Lokaal getLokaal(Integer id) {
        return null;
    }

    @Override
    public void updateLokaal(Integer id, Lokaal lokaal) {

    }

    @Override
    public void deleteLokaal(int id) {

    }
}
