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
public class InscricaoAluno {
    private int idFormando;
    private int idCurso;

    public InscricaoAluno(int idFormando, int idCurso) {
        this.idFormando = idFormando;
        this.idCurso = idCurso;
    }

    public InscricaoAluno() {
     
    }

    public int getIdFormando() {
        return idFormando;
    }

    public void setIdFormando(int idFormando) {
        this.idFormando = idFormando;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
        @Override
    public String toString() {
        return "Curso{"
                + "idFormando=" + idFormando
                + ", idCurso='" + idCurso + '\''
                + '}';
    }    
}
