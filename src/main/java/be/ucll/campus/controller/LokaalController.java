package be.ucll.campus.controller;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.entity.Lokaal;
import be.ucll.campus.repository.GebouwRepository;
import be.ucll.campus.repository.LokaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LokaalController  {
    @Autowired
    private LokaalRepository lokaalRepo;
    @Autowired
    private GebouwRepository gebouwRepository;

    @GetMapping("/gebouw/{gebouwid}/lokaal/{id}")
    public Lokaal findLokaal(@PathVariable("id") Long id){
        return lokaalRepo.findById(id).get();
    }

    @GetMapping("/gebouw/{gebouwid}/lokaal")
    public Iterable<Lokaal> getAllLokalen(){
        return lokaalRepo.findAll();
    }

    @PostMapping("/gebouw/{gebouwid}/lokaal/")
    public Lokaal createLokaal(@PathVariable("gebouwid") String gebouwid, @RequestBody Lokaal lokaal ){
        Gebouw gebouw = gebouwRepository.findById(gebouwid).get();
        gebouw.voegLokaalToe(lokaal);
        lokaalRepo.save(lokaal);
        return lokaal;
    }
    /*
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
    }*/
}
