package be.ucll.campus.service;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.entity.Lokaal;
import be.ucll.campus.repository.LokaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class LokaalService {
    @Autowired
    private LokaalRepository lokaalRepository;

    public LokaalService(LokaalRepository lokaalRepository) {
        this.lokaalRepository = lokaalRepository;
    }

    public void addLokaal(int id, String naam, String lokaalType, int capaciteit, String wie, int verdieping) {
        this.lokaalRepository.save(new Lokaal((long) id, naam, lokaalType, capaciteit, wie, verdieping));
    }

    private void addLokaal(Lokaal lokaal) {
    }



}
