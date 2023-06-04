package org.example.persistencia;

import org.example.modelo.PersonajesNaruto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NarutoDAO implements InterfazDAO {
    public NarutoDAO() {
    }

    @Override
    public boolean insentar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Naruto(Id,Nombre,Clan,Aldea,Kekkein,Rango,Imagen) VALUES (?,?,?,?,?,?,?)";
        int rowCout = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Naruto.db").getConnection().prepareStatement(sqlInsert);
        pstm.setInt(1,(((PersonajesNaruto)obj).getId()));
        pstm.setString(2,((PersonajesNaruto)obj).getNombre());
        pstm.setString(3,((PersonajesNaruto)obj).getClan());
        pstm.setString(4,((PersonajesNaruto)obj).getAldea());
        pstm.setString(5,((PersonajesNaruto)obj).getKekkeiGenkkai());
        pstm.setString(6,((PersonajesNaruto)obj).getRango());
        pstm.setString(7,((PersonajesNaruto)obj).getImagenUrl());

        rowCout = pstm.executeUpdate();
        return rowCout > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Naruto SET Nombre = ?,Clan = ?,Aldea = ?,Kekkein = ?,Rango = ?,Imagen = ? WHERE Id = ?;";
        int rowCout = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Naruto.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((PersonajesNaruto)obj).getNombre());
        pstm.setString(2,((PersonajesNaruto)obj).getClan());
        pstm.setString(3,((PersonajesNaruto)obj).getAldea());
        pstm.setString(4,((PersonajesNaruto)obj).getKekkeiGenkkai());
        pstm.setString(5,((PersonajesNaruto)obj).getRango());
        pstm.setString(6,((PersonajesNaruto)obj).getImagenUrl());
        pstm.setInt(7,((PersonajesNaruto)obj).getId());

        rowCout = pstm.executeUpdate();
        return rowCout > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Naruto WHERE Id = ?;";
        int rowCout = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("Naruto.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCout = pstm.executeUpdate();
        return rowCout > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sqlObtenerT = "SELECT * FROM Naruto";
        ArrayList<PersonajesNaruto> res = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("Naruto.db").getConnection().createStatement();
        ResultSet reSet = stm.executeQuery(sqlObtenerT);
        while (reSet.next()){
            res.add(new PersonajesNaruto(reSet.getInt(1),reSet.getString(2),reSet.getString(3),
                    reSet.getString(4),reSet.getString(5),reSet.getString(6),reSet.getString(7)));
        }
        return res;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sqlBuscar = "SELECT * FROM Naruto WHERE Id = ?;";
        PersonajesNaruto per = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("Naruto.db").getConnection().prepareStatement(sqlBuscar);
        pstm.setInt(1,Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()){
            per = new PersonajesNaruto(rst.getInt(1),rst.getString(2),rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7));
            return per;
        }
            return  null;
    }
}
