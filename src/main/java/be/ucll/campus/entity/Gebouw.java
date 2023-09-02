package be.ucll.campus.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gebouw")
public class Gebouw {

    @Id
    private String naam;
    private String adres;
    private int parkeerplaats;
    @Column(name = "aantal_lokalen")
    private int aantalLokalen;



    protected Gebouw() {
        this("","",0,0);
    }

    public Gebouw(String naam, String adres, int parkeerplaats, int aantalLokalen) {
        this.naam = naam;
        this.adres = adres;
        this.parkeerplaats = parkeerplaats;
        this.aantalLokalen = aantalLokalen;
    }

    @Override
    public String toString() {
        return "Gebouw{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", parkeerplaats=" + parkeerplaats +
                ", aantalLokalen=" + aantalLokalen +
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

    public int getAantalLokalen() {
        return aantalLokalen;
    }

    public void setAantalLokalen(int aantalLokalen) {
        this.aantalLokalen = aantalLokalen;
    }
}
