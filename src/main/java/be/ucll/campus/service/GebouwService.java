package be.ucll.campus.service;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.repository.GebouwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GebouwService {
    @Autowired
    public final GebouwRepository repo;

    public GebouwService(GebouwRepository repo) {
        this.repo = repo;
    }

    public void addGebouw(String naam, String adres, int parkeerplaats, int aantalLokalen) {
        this.repo.addGebouw(new Gebouw(naam, adres, parkeerplaats, aantalLokalen));
    }

}
