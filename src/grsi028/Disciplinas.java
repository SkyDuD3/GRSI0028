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
public class Disciplinas {
    private int idDisciplina;
    private String nome;
    private int horas; 

    public Disciplinas(int idDisciplina, String nome, int horas) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.horas = horas;
    }

    public Disciplinas() {
        
    }


    
    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
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
                + "idCurso=" + idDisciplina
                + ", nome='" + nome + '\''
                + ", horas=" + horas
                + '}';
    }    
    
}
