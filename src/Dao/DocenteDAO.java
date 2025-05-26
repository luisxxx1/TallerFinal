package Dao;

import Entidades.Docente;
import java.sql.*;

public class DocenteDAO {

    private Connection conn;

    public DocenteDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean insertarDocente(Docente docente) throws SQLException {
        String sql = "INSERT INTO docentes (cod_docente, nom_docente) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(docente.getCodigo()));
            ps.setString(2, docente.getNombre());
            int filas = ps.executeUpdate();
            return filas > 0;
        }
    }

    public boolean borrarDocente(String codigo) throws SQLException {
        String sql = "DELETE FROM docentes WHERE cod_docente = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(codigo));
            int filas = ps.executeUpdate();
            return filas > 0;
        }
    }
    
    
    public Docente buscarDocentePorCodigo(String codigo) throws SQLException {
    String sql = "SELECT * FROM docentes WHERE cod_docente = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, Integer.parseInt(codigo));
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return new Docente(rs.getString("codigo"), rs.getString("nombre"));
        }
    }
    return null;
}

}
