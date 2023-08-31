package be.ucll.campus.repository;

import be.ucll.campus.entity.Gebouw;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface GebouwRepository {

    List<Gebouw> getAllGebouwen();
    void addGebouw(Gebouw gebouw);
    public Gebouw getGebouw(Integer id);

    public void updateGebouw(Integer id, Gebouw gebouw);
    public void deleteGebouw(int id);
}
