package be.ucll.campus.service;

import be.ucll.campus.entity.Lokaal;
import be.ucll.campus.repository.GebouwRepository;
import be.ucll.campus.repository.LokaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LokaalService {
    @Autowired
    private LokaalRepository lokaalRepository;
    @Autowired
    private GebouwRepository gebouwRepository;


    public LokaalService(LokaalRepository lokaalRepository, GebouwRepository gebouwRepository) {
        this.lokaalRepository = lokaalRepository;
        this.gebouwRepository = gebouwRepository;
    }

    public void addLokaal(int id, String naam, String lokaalType, int capaciteit, String wie, int verdieping) {
        this.lokaalRepository.save(new Lokaal(naam, lokaalType, capaciteit, wie, verdieping));
    }

    public Lokaal addLokaal(Lokaal lokaal) {
        this.lokaalRepository.save(lokaal);

        return lokaal;
    }

    public Lokaal findLokaal(Long id) {
        return lokaalRepository.findById(id).get();
    }

    public Iterable<Lokaal> getAllLokalen() {
        return lokaalRepository.findAll();
    }


}
