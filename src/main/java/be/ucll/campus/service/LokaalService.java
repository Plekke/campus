package be.ucll.campus.service;

import be.ucll.campus.entity.Lokaal;
import be.ucll.campus.repository.LokaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LokaalService {
    @Autowired
    public final LokaalRepository repo;

    public LokaalService(LokaalRepository repo) {
        this.repo = repo;
    }

    public void addLokaal(int id, String naam, String lokaalType, int capaciteit, String wie, int verdieping) {
        this.repo.addLokaal(new Lokaal(id, naam, lokaalType, capaciteit, wie, verdieping));
    }

    private void addLokaal(Lokaal lokaal) {
    }


}
