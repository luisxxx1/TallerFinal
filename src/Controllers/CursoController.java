package Controllers;

import Modelo.Curso;
import Modelo.CursoDAO;
import Vista.Cursos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CursoController implements ActionListener {
    private Cursos vista;
    private CursoDAO dao;

    public CursoController(Cursos vista, CursoDAO dao) {
        this.vista = vista;
        this.dao = dao;

        this.vista.BRegistrar.addActionListener(this);
        this.vista.Borrarb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.BRegistrar) {
            registrarCurso();
        }

        if (e.getSource() == vista.Borrarb) {
            borrarCurso();
        }
    }

    private void registrarCurso() {
        String codigo = vista.TextCodigoC.getText();
        String nombre = vista.TextCurso.getText();
        String docente = vista.TextDocente.getText();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !docente.isEmpty()) {
            Curso curso = new Curso(codigo, nombre, docente);
            dao.registrarCurso(curso);
            limpiarCampos();
            System.out.println("Curso registrado");
        } else {
            System.out.println("Todos los campos son obligatorios");
        }
    }

    private void borrarCurso() {
        String codigo = vista.TextCodigoC.getText();

        if (!codigo.isEmpty()) {
            dao.eliminarCurso(codigo);
            limpiarCampos();
            System.out.println("Curso eliminado");
        } else {
            System.out.println("Ingrese el código del curso a eliminar");
        }
    }

    private void limpiarCampos() {
        vista.TextCodigoC.setText("");
        vista.TextCurso.setText("");
        vista.TextDocente.setText("");
    }
}
