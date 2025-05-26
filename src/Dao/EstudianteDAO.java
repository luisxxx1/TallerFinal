package Dao;

import Entidades.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EstudianteDAO {
    private Connection conn;

    public EstudianteDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean registrar(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (cod_estudiante, nom_estudiante) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(estudiante.getCodigo()));
            ps.setString(2, estudiante.getNombre());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error al registrar estudiante: " + e.getMessage());
            return false;
        }
    }
}
