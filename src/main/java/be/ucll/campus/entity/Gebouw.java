package be.ucll.campus.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "gebouw")
public class Gebouw {

    @Id
    private String naam;
    private String adres;
    private Integer parkeerplaats;
    @OneToMany
    private List<Lokaal> lokalen = new ArrayList<>();


    protected Gebouw() {
        this("", "", 0);
    }

    public Gebouw(String naam, String adres, int parkeerplaats) {
        this.naam = naam;
        this.adres = adres;
        this.parkeerplaats = parkeerplaats;

    }

    @Override
    public String toString() {
        return "Gebouw{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", parkeerplaats=" + parkeerplaats +
                '}';
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getParkeerplaats() {
        return parkeerplaats;
    }

    public void setParkeerplaats(int parkeerplaats) {
        this.parkeerplaats = parkeerplaats;
    }


    public void voegLokaalToe(Lokaal lokaal) {
        this.lokalen.add(lokaal);

    }
}
