/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grsi028;

/**
 *
 * @author SkyDuDe
 */
public class DisciplinasCursos {
    private int idCurso;
    private int idDisciplina;

    public DisciplinasCursos(int idCurso, int idDisciplina) {
        this.idCurso = idCurso;
        this.idDisciplina = idDisciplina;
    }

    public DisciplinasCursos() {
 
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }


         @Override
    public String toString() {
        return "Curso{"
                + "idCurso=" + idCurso
                + ", idDisciplina='" + idDisciplina + '\''
                + '}';
    } 
}


