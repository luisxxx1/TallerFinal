package Controllers;

import Modelo.Docente;
import Modelo.DocenteDAO;
import Vista.Docentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class DocenteController {

    private Docentes vista;
    private DocenteDAO modelo;

    public DocenteController(Docentes vista, DocenteDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.BRegistrar.addActionListener(new RegistrarListener());
        this.vista.BorrarB.addActionListener(new BorrarListener());
    }

    class RegistrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vista.TextCodigoDocente.getText().trim();
            String nombre = vista.TextNombreDocente.getText().trim();

            if (codigo.isEmpty() || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Complete todos los campos");
                return;
            }

            Docente docente = new Docente(codigo, nombre);
            try {
                boolean insertado = modelo.insertarDocente(docente);
                if (insertado) {
                    JOptionPane.showMessageDialog(vista, "Docente registrado con éxito");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al registrar docente");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        }
    }

    class BorrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String codigo = vista.TextCodigoDocente.getText().trim();

            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Ingrese el código del docente a borrar");
                return;
            }

            try {
                boolean borrado = modelo.borrarDocente(codigo);
                if (borrado) {
                    JOptionPane.showMessageDialog(vista, "Docente borrado con éxito");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se encontró docente con ese código");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(vista, "Error: " + ex.getMessage());
            }
        }
    }

    private void limpiarCampos() {
        vista.TextCodigoDocente.setText("");
        vista.TextNombreDocente.setText("");
    }
}
