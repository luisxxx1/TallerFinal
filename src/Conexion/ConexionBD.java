package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "admin";
    private static final String PASSWORD = "admin123";

    private Connection conn;

    public ConexionBD() {
        // Constructor vacío. No abrimos la conexión aquí.
    }

    public void abrirConexion() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("org.postgresql.Driver");  // Cargar driver explícitamente
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: driver PostgreSQL no encontrado."+ e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al abrir conexión: " + e.getMessage());
        }
    }

    public Connection getConexion() {
        return conn;
    }

    public boolean testearConexion() {
        try {
            return conn != null && !conn.isClosed();
        } catch (SQLException e) {
            System.out.println("Error al testear conexión: " + e.getMessage());
            return false;
        }
    }

    public void cerrarConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}
