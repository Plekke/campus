package be.ucll.campus.repository;

import be.ucll.campus.entity.Gebouw;

import javax.persistence.GeneratedValue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbGebouwRepository {

    private final Connection connection;

    public DbGebouwRepository(Connection connection){this.connection = connection;}

    private List<Gebouw> mapGebouwen(ResultSet rs) throws SQLException{
        List<Gebouw> gebouwen = new ArrayList<>();
        while (rs.next()){
            String naam = rs.getString("naam");
            String adres = rs.getString("adres");
            int parkeerplaats = rs.getInt("parkeerplaats");
            int aantalLokalen = rs.getInt("aantal lokalen");
            gebouwen.add(new Gebouw(naam,adres,parkeerplaats,aantalLokalen));
        }
        return gebouwen;
    }
    //@Override
    public List<Gebouw> getAllGebouwen() {
        try (PreparedStatement ps = connection.prepareStatement("select * from gebouw");
            ResultSet rs = ps.executeQuery()){
            return mapGebouwen(rs);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //@Override
    public void addGebouw(Gebouw gebouw) {
        try (PreparedStatement ps = connection.prepareStatement(
                "insert into Gebouw(naam,adres,parkeerplaats,aantalLokalen) value(?,?,?)")){
            ps.setString(1,gebouw.getNaam());
            ps.setString(2,gebouw.getAdres());
            ps.setInt(3,gebouw.getParkeerplaats());
            ps.setInt(4,gebouw.getAantalLokalen());
            ps.executeUpdate();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

   // @Override
    public Gebouw getGebouw(Integer id) {
        return null;
    }

   // @Override
    public void updateGebouw(Integer id, Gebouw gebouw) {

    }

   // @Override
    public void deleteGebouw(int id) {

    }
}
