package Controllers;

import Vista.Estudiantes;
import Entidades.Estudiante;
import Dao.EstudianteDAO;
import Conexion.ConexionBD;
import Entidades.Docente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EstudianteController implements ActionListener {

    private Estudiantes vista;
    private ConexionBD conexion;

    public EstudianteController(Estudiantes vista) {
        this.vista = vista;
        this.conexion = new ConexionBD();
        this.vista.BRegistrar.addActionListener(this); // Escucha el botón "Registrar"
        this.vista.BorrarB.addActionListener(new BorrarEstudianteListener());
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

    class BorrarEstudianteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vista.TextCodigoEstudiantes.getText().trim();

            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingrese el código del estudiante a borrar");
                return;
            }

            try {

                conexion.abrirConexion();
                EstudianteDAO dao = new EstudianteDAO(conexion.getConexion());

                boolean borrado = dao.borrarEstudiante(codigo);
                if (borrado) {
                    JOptionPane.showMessageDialog(vista, "Estudiante borrado con éxito");
                    conexion.cerrarConexion();
                    limpiarCampos();
                } else {
                    conexion.cerrarConexion();
                    JOptionPane.showMessageDialog(vista, "No se encontró el estudiante con ese código");
                }
            } catch (Exception ex) {
                conexion.cerrarConexion();
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        }
    }

    private void limpiarCampos() {
        vista.TextCodigoEstudiantes.setText("");
        vista.TextNombreDeEstudiante.setText("");
    }
}
