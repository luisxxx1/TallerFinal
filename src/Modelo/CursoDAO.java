package Modelo;

import java.util.ArrayList;

public class CursoDAO {
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public void registrarCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void eliminarCurso(String codigo) {
        listaCursos.removeIf(c -> c.getCodigo().equals(codigo));
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }
}
