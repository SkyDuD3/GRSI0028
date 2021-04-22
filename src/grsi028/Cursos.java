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
public class Cursos {

    private int idCurso;
    private String nome;
    private int horas;

    public Cursos(int idCurso, String nome) {
        this.idCurso = idCurso;
        this.nome = nome;
        
    }

    public Cursos() {

    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Curso{"
                + "idCurso=" + idCurso
                + ", nome='" + nome + '\''
                + ", horas=" + horas
                + '}';
    }

}
