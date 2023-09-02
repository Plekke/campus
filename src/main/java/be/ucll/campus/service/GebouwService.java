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

    public void addGebouw(String naam, String adres, int parkeerplaats, int aantalLokalen) {
        this.gebouwRepository.addGebouw(new Gebouw(naam, adres, parkeerplaats, aantalLokalen));
    }

}
