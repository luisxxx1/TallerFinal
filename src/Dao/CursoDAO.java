package Dao;

import Entidades.Curso;
import java.sql.*;

public class CursoDAO {

    private Connection conn;

    public CursoDAO(Connection conn) {
        this.conn = conn;
    }

    public boolean insertarCurso(Curso curso) throws SQLException {
        String sql = "INSERT INTO cursos (cod_curso, nom_curso, cod_docente) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(curso.getCodigo()));
            ps.setString(2, curso.getNombre());
            ps.setString(3, curso.getDocente());
            int filas = ps.executeUpdate();
            return filas > 0;
        }
    }

    public boolean borrarCurso(String codigo) throws SQLException {
        String sql = "DELETE FROM cursos WHERE cod_curso = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, codigo);
            int filas = ps.executeUpdate();
            return filas > 0;
        }
    }

    // Otros métodos como buscar, actualizar pueden agregarse acá
}
