package be.ucll.campus.controller;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.entity.Lokaal;
import be.ucll.campus.repository.LokaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LokaalController {
    @Autowired
    private LokaalRepository lokaalRepo;

    @GetMapping("/{id}")
    public Lokaal findLokaal(@PathVariable("id") Integer id){
        return lokaalRepo.getLokaal(id);
    }

    @GetMapping("/")
    public List<Lokaal> getAllLokalen(){
        return lokaalRepo.getAllLokalen();
    }

    @PostMapping("/")
    public Lokaal createLokaal(@RequestBody Lokaal lokaal){
        lokaalRepo.addLokaal(lokaal);
        return lokaal;
    }
    @PutMapping("/{id}")
    public Lokaal updateLokaal(@RequestBody Lokaal lokaal, @PathVariable("id") Integer id){
        lokaalRepo.updateLokaal(id,lokaal);
        return lokaal;
    }

    @DeleteMapping("/{id}")
    public Lokaal updateLokaal(@PathVariable("id") Integer id){
        Lokaal lokaal = lokaalRepo.getLokaal(id);
        lokaalRepo.deleteLokaal(id);
        return lokaal;
    }
}
