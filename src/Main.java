import Conexion.ConexionBD;
import Dao.CursoDAO;
import Dao.DocenteDAO;
import Dao.EstudianteDAO;
import Controllers.CursoController;
import Controllers.DocenteController;
import Controllers.EstudianteController;
import Vista.Cursos;
import Vista.Docentes;
import Vista.Estudiantes;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear conexión
            ConexionBD conexion = new ConexionBD();
            conexion.abrirConexion();

            // Crear DAOs con la conexión
            CursoDAO cursoDAO = new CursoDAO(conexion.getConexion());
            DocenteDAO docenteDAO = new DocenteDAO(conexion.getConexion());
            EstudianteDAO estudianteDAO = new EstudianteDAO(conexion.getConexion());

            // Crear vistas
            Cursos cursosVista = new Cursos();
            Docentes docentesVista = new Docentes();
            Estudiantes estudiantesVista = new Estudiantes();

            // Crear controladores y asociarlos con sus vistas y DAOs
            CursoController cursoController = new CursoController(cursosVista, cursoDAO);
            DocenteController docenteController = new DocenteController(docentesVista, docenteDAO);
            EstudianteController estudianteController = new EstudianteController(estudiantesVista);
            // Nota: EstudianteController crea su propio DAO internamente usando ConexionBD.

            // Configurar y mostrar las ventanas (Frames)
            JFrame frameCursos = new JFrame("Gestión de Cursos");
            frameCursos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameCursos.setContentPane(cursosVista.getContentPane());
            frameCursos.pack();
            frameCursos.setLocationRelativeTo(null);
            frameCursos.setVisible(true);

            JFrame frameDocentes = new JFrame("Gestión de Docentes");
            frameDocentes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameDocentes.setContentPane(docentesVista.getContentPane());
            frameDocentes.pack();
            frameDocentes.setLocationRelativeTo(null);
            frameDocentes.setVisible(true);

            JFrame frameEstudiantes = new JFrame("Gestión de Estudiantes");
            frameEstudiantes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameEstudiantes.setContentPane(estudiantesVista.getContentPane());
            frameEstudiantes.pack();
            frameEstudiantes.setLocationRelativeTo(null);
            frameEstudiantes.setVisible(true);
        });
    }
}
