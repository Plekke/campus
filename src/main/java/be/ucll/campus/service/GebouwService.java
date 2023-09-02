package be.ucll.campus.service;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.repository.GebouwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GebouwService {

    @Autowired
    private GebouwRepository gebouwRepository;

    public GebouwService(GebouwRepository gebouwRepository) {
        this.gebouwRepository = gebouwRepository;
    }

    public void addGebouw(String naam, String adres, int parkeerplaats) {
        this.gebouwRepository.save(new Gebouw(naam, adres, parkeerplaats));
    }
    public void addGebouw(Gebouw gebouw) {
        this.gebouwRepository.save(gebouw);
    }
    public Gebouw findGebouw(String naam){
        return gebouwRepository.findById(naam).get();
    }

    public Iterable<Gebouw> getAllgebouwen(){
        return gebouwRepository.findAll();
    }

}
