package be.ucll.campus.entity;

import javax.persistence.*;

@Entity
@Table(name = "lokaal")
public class Lokaal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String naam;
    private String lokaalType;
    private int capaciteit;
    private String wie;
    private int verdieping;

    protected Lokaal(){this(0L,"","",0,"",0);}

    public Lokaal(Long id, String naam, String lokaalType, int capaciteit, String wie, int verdieping) {
        Id = id;
        this.naam = naam;
        this.lokaalType = lokaalType;
        this.capaciteit = capaciteit;
        this.wie = wie;
        this.verdieping = verdieping;
    }

    @Override
    public String toString() {
        return "Lokaal{" +
                "Id=" + Id +
                ", naam='" + naam + '\'' +
                ", lokaalType='" + lokaalType + '\'' +
                ", capaciteit=" + capaciteit +
                ", wie='" + wie + '\'' +
                ", verdieping=" + verdieping +
                '}';
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLokaalType() {
        return lokaalType;
    }

    public void setLokaalType(String lokaalType) {
        this.lokaalType = lokaalType;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public String getWie() {
        return wie;
    }

    public void setWie(String wie) {
        this.wie = wie;
    }

    public int getVerdieping() {
        return verdieping;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }
}
