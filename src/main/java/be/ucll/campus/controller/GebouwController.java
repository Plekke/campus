package be.ucll.campus.controller;

import be.ucll.campus.entity.Gebouw;
import be.ucll.campus.repository.GebouwRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gebouw")
public class GebouwController {

    @Autowired
    private GebouwRepository gebouwRepo;

    @GetMapping("/{id}")
    public Gebouw findGebouw(@PathVariable("id") Integer id){
        return gebouwRepo.getGebouw(id);
    }

    @GetMapping("/")
    public List<Gebouw> getAllgebouwen(){
        return gebouwRepo.getAllGebouwen();
    }

    @PostMapping("/")
    public Gebouw createGebouw(@RequestBody Gebouw gebouw){
        gebouwRepo.addGebouw(gebouw);
        return gebouw;
    }
    @PutMapping("/{id}")
    public Gebouw updateGebouw(@RequestBody Gebouw gebouw, @PathVariable("id") Integer id){
        gebouwRepo.updateGebouw(id,gebouw);
        return gebouw;
    }

    @DeleteMapping("/{id}")
    public Gebouw updateGebouw(@PathVariable("id") Integer id){
        Gebouw gebouw = gebouwRepo.getGebouw(id);
        gebouwRepo.deleteGebouw(id);
        return gebouw;
    }

}
