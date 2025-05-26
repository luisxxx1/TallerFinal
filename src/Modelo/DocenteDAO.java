package Modelo;

import java.sql.*;

public class DocenteDAO {

    private Connection conn;

    public DocenteDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean insertarDocente(Docente docente) throws SQLException {
        String sql = "INSERT INTO docentes (codigo, nombre) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, docente.getCodigo());
            ps.setString(2, docente.getNombre());
            int filas = ps.executeUpdate();
            return filas > 0;
        }
    }

    public boolean borrarDocente(String codigo) throws SQLException {
        String sql = "DELETE FROM docentes WHERE codigo = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, codigo);
            int filas = ps.executeUpdate();
            return filas > 0;
        }
    }
}
