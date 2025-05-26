package Controllers;

import Vista.Estudiantes;
import Entidades.Estudiante;
import Dao.EstudianteDAO;
import Conexion.ConexionBD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudianteController implements ActionListener {

    private Estudiantes vista;
    private ConexionBD conexion;

    public EstudianteController(Estudiantes vista) {
        this.vista = vista;
        this.conexion = new ConexionBD();
        this.vista.BRegistrar.addActionListener(this); // Escucha el botón "Registrar"
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BRegistrar) {
            String codigo = vista.TextCodigoEstudiantes.getText();
            String nombre = vista.TextNombreDeEstudiante.getText();

            Estudiante estudiante = new Estudiante(codigo, nombre);

            conexion.abrirConexion();
            EstudianteDAO dao = new EstudianteDAO(conexion.getConexion());

            if (dao.registrar(estudiante)) {
                System.out.println("Estudiante registrado correctamente.");
            }

            conexion.cerrarConexion();
        }
    }
}
