package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/tu_basedatos";
    private static final String USER = "root";
    private static final String PASSWORD = "tu_contraseña";

    private Connection conn;

    public ConexionBD() {
        // Constructor vacío. No abrimos la conexión aquí.
    }

    public void abrirConexion() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa");
            }
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
