package Controllers;

import Modelo.Curso;
import Modelo.CursoDAO;
import Vista.Cursos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class CursoController {

    private Cursos vista;
    private CursoDAO modelo;

    public CursoController(Cursos vista, CursoDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Asociar eventos a botones
        this.vista.BRegistrar.addActionListener(new RegistrarListener());
        this.vista.Borrarb.addActionListener(new BorrarListener());
    }

    class RegistrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vista.TextCodigoC.getText().trim();
            String nombre = vista.TextCurso.getText().trim();
            String docente = vista.TextDocente.getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty() || docente.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Por favor, rellene todos los campos");
                return;
            }

            Curso curso = new Curso(codigo, nombre, docente);
            try {
                boolean insertado = modelo.insertarCurso(curso);
                if (insertado) {
                    JOptionPane.showMessageDialog(vista, "Curso registrado con éxito");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al registrar el curso");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        }
    }

    class BorrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vista.TextCodigoC.getText().trim();

            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingrese el código del curso a borrar");
                return;
            }

            try {
                boolean borrado = modelo.borrarCurso(codigo);
                if (borrado) {
                    JOptionPane.showMessageDialog(vista, "Curso borrado con éxito");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se encontró curso con ese código");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        }
    }

    private void limpiarCampos() {
        vista.TextCodigoC.setText("");
        vista.TextCurso.setText("");
        vista.TextDocente.setText("");
    }
}
