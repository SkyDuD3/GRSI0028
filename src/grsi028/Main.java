/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grsi028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author SkyDuDe
 */
public class Main {

    static Continuar continuar = new Continuar();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Formando> lista = new ArrayList<>(); //lista dos formandos 
    static ArrayList<Cursos> lista1 = new ArrayList<>(); //lista dos Cursos 
    static ArrayList<Disciplinas> lista2 = new ArrayList<>(); //lista das Disciplinas 
    static ArrayList<InscricaoAluno> lista3 = new ArrayList<>(); //lista da Relação entre Cursos e Formandos 
    static ArrayList<DisciplinasCursos> lista4 = new ArrayList<>(); //lista da relação entre Disciplinas e Cursos

    static int idFormando = 1;
    static int idCurso = 1;
    static int idDisciplina = 1;

    public static void main(String[] args) {

        Continuar continuar = new Continuar();

        Menus menu = new Menus();
        Scanner sc = new Scanner(System.in);

        int escolha = 0;
        int escolhaSec = 0;
        do {
            escolha = menu.showMenuprincipal();
            switch (escolha) {
                case 1://case 1 dos formandos
                    do {
                        escolhaSec = menu.showMenuSecundario("Formando");
                        switch (escolhaSec) {
                            case 1:
                                System.out.println("inserir formando");
                                inserirFormando();
                                break;
                            case 2:
                                System.out.println("Modificar formando");
                                modificarFormando();
                                break;
                            case 3:
                                System.out.println("Eliminar formando");
                                eliminarFormando();
                                break;
                            case 4:
                                System.out.println("Listar formando");
                                if (lista.isEmpty()) {
                                    System.out.println("Não há nada para listar");
                                }
                                for (Formando f : lista) {
                                    System.out.println(f.toString());
                                }
                                break;
                        }
                    } while (escolhaSec != 9);
                    break;
                case 2: //case 2 dos cursos
                    do {
                        escolhaSec = menu.showMenuSecundario("Curso");
                        switch (escolhaSec) {
                            case 1:
                                System.out.println("inserir curso");
                                inserirCurso();
                                break;
                            case 2:
                                System.out.println("Modificar curso");
                                modificarCurso();
                                break;
                            case 3:
                                System.out.println("Eliminar curso");
                                eliminarCurso();
                                break;
                            case 4:
                                System.out.println("Listar curso");
                                if (lista1.isEmpty()) {
                                    System.out.println("Não há nada para listar");
                                }
                                for (Cursos f : lista1) {
                                    System.out.println(f.toString());
                                }
                                break;
                        }
                    } while (escolhaSec != 9);
                    break;
                case 3: //case 3 das disciplinas
                    do {
                        escolhaSec = menu.showMenuSecundario("Disciplina");
                        switch (escolhaSec) {
                            case 1:
                                System.out.println("inserir Disciplina");
                                inserirDisciplina();
                                break;
                            case 2:
                                System.out.println("Modificar Disciplina");
                                modificarDisciplina();
                                break;
                            case 3:
                                System.out.println("Eliminar Disciplina");
                                eliminarDisciplina();
                                break;
                            case 4:
                                System.out.println("Listar Disciplinas");
                                if (lista2.isEmpty()) {
                                    System.out.println("Não há nada para listar");
                                }
                                for (Disciplinas f : lista2) {
                                    System.out.println(f.toString());
                                }
                                break;
                        }
                    } while (escolhaSec != 9);
                    break;
                case 4: //case 4 da relação alunos e cursos
                    do {
                        escolhaSec = menu.showMenuTerciario("Inscrição dos Alunos");
                        switch (escolhaSec) {
                            case 1:
                                System.out.println("Inscrever Aluno a um Curso");
                                inscreverAluno();
                                break;
                            case 2:
                                System.out.println("Remover Aluno de um Curso");
                                eliminarInscricaoAluno();
                                break;
                            case 3:
                                System.out.println("Listar inscrições");
                                if (lista3.isEmpty()) {
                                    System.out.println("Não há nada para listar");
                                }
                                for (InscricaoAluno f : lista3) {
                                    System.out.println(f.toString());
                                }
                                break;
                        }

                    } while (escolhaSec != 9);
                    break;
                case 5: //case 5 da relação entre disciplinas e cursos
                    do {
                        escolhaSec = menu.showMenuquaternario("Registar Disciplinas");
                        switch (escolhaSec) {
                            case 1:
                                System.out.println("Registar uma Disciplina a um curso ");
                                registarDisciplinaCurso();
                                break;
                            case 2:
                                System.out.println("Remover uma Disciplina de um curso ");
                                removerDisciplinaCurso();
                                break;
                            case 3:
                                System.out.println("Listar Disciplinas em cursos");
                                if (lista4.isEmpty()) {
                                    System.out.println("Não há nada para listar");
                                }
                                for (DisciplinasCursos f : lista4) {
                                    System.out.println(f.toString());
                                }
                                break;
                        }

                    } while (escolhaSec != 9);

            }

        } while (escolha != 9);
        // Opções do menu formandos //

    }

    private static void inserirFormando() {

        do {
            Formando formando = new Formando();
            Scanner sc = new Scanner(System.in);
            formando.setIdFormando(idFormando++);
            System.out.println("Nome do formando:");
            formando.setNome(sc.nextLine());
            System.out.println("Masculino (true/false):");
            formando.setMasculino(sc.nextBoolean());
            do {
                System.out.println("Telefone:");
                formando.setTelefones(sc.nextInt());
            } while (continuar.perguntar("Deseja inserir mais um numero de telefone?"));

            lista.add(formando);

        } while (continuar.perguntar("Quer inserir mais um aluno?"));

    }

    private static void modificarFormando() {
        if (lista.size() == 0) {
            System.out.println("Não há formandos");
        } else {

            Scanner sc = new Scanner(System.in);
            // impresao do lista
            //for (Formando f : lista) {
            //    System.out.println(f.toString());

            //}
            System.out.println("ID do formando:");

            int id = sc.nextInt();
            try {
                Formando formando = lista.get(id - 1);
                sc = new Scanner(System.in);
                System.out.println("Nome do formando:");
                String nome = sc.nextLine();
                if (!nome.isEmpty()) {
                    formando.setNome(nome);
                }
                System.out.println("Masculino (true/false):");
                String genero = sc.nextLine();
                if (!genero.isEmpty()) {
                    formando.setMasculino((genero.equals("true")) ? true : false);
                }
                //ciclo para a repetição do requesito do telefone
                for (int x = 0; 0 < formando.getTelefones().size(); x++) {
                    System.out.println("Insira numero para substituir " + formando.getTelefones().get(x));
                    String novoTel = sc.nextLine();
                    if (!novoTel.isEmpty()) {
                        formando.telefones.set(x, Integer.parseInt(novoTel));
                    }
                }

            } catch (Exception e) {
                System.out.println("o formando " + id + "não existe");

            }
        }
    }

    private static void eliminarFormando() {
        Formando formando = new Formando();
        if (lista.size() == 0) {
            System.out.println("Não há formandos");
        } else {
            System.out.println("ID do formando:");
            int id = sc.nextInt();
            try {//try para dar reset ao ID unico em caso de eliminação para não bugar
                sc = new Scanner(System.in);
                lista.remove(id - 1);
                idFormando = 2;
                int j = lista.size();
                for (int x = 2; x < j + 1; x++) {
                    formando = lista.get(x - 1);
                    formando.setIdFormando(idFormando++);
                }
            } catch (Exception e) {
                System.out.println("o formando com o " + id + " não existe");
            }
        }
    }

// fim das opções do menu formandos //
// Opções do menu Cursos //
    private static void inserirCurso() {
        do {
            Cursos cursos = new Cursos();
            Scanner sc = new Scanner(System.in);
            cursos.setIdCurso(idCurso++);
            System.out.println("Nome do Curso?:");
            cursos.setNome(sc.nextLine());
            System.out.println("Horas do Curso?:");
            cursos.setHoras(sc.nextInt());

            lista1.add(cursos);

        } while (continuar.perguntar("Quer inserir mais um curso?"));

    }

    private static void modificarCurso() {
        if (lista1.size() == 0) {
            System.out.println("Não Existem Cursos");
        } else {

            Scanner sc = new Scanner(System.in);
            // impresao do lista
            //for (Formando f : lista) {
            //    System.out.println(f.toString());

            //}
            System.out.println("ID do Curso:");

            int id = sc.nextInt();
            try {
                Cursos cursos = lista1.get(id - 1);
                sc = new Scanner(System.in);
                System.out.println("Novo nome do Curso:");
                String nome = sc.nextLine();
                if (!nome.isEmpty()) {
                    cursos.setNome(nome);
                }
                sc = new Scanner(System.in);
                System.out.println("Novas horas do Curso");
                String NewHoras = sc.nextLine();
                if (!NewHoras.isEmpty()) {
                    int horas = Integer.parseInt(NewHoras); //converçao de String para Integer
                    cursos.setHoras(horas);
                }

            } catch (Exception e) {

                System.out.println("o Curso com o " + id + "não existe");

            }
        }

    }

    private static void eliminarCurso() {
        Cursos cursos = new Cursos();
        if (lista1.size() == 0) {
            System.out.println("Não existem Cursos");
        } else {
            System.out.println("ID do Curso:");
            int id = sc.nextInt();
            try {//try para dar reset ao ID unico em caso de eliminação para não bugar
                sc = new Scanner(System.in);
                lista1.remove(id - 1);
                idCurso = 2;
                int j = lista1.size();
                for (int x = 2; x < j + 1; x++) {
                    cursos = lista1.get(x - 1);
                    cursos.setIdCurso(idFormando++);
                }
            } catch (Exception e) {
                System.out.println("O Curso com o ID " + id + " não existe");
            }
        }
    }
// fim das opções do menu Cursos //
// Opções do menu Disciplinas //

    private static void inserirDisciplina() {
        do {
            Disciplinas disciplinas = new Disciplinas();
            Scanner sc = new Scanner(System.in);
            disciplinas.setIdDisciplina(idDisciplina++);
            System.out.println("Nome da Disciplina?:");
            disciplinas.setNome(sc.nextLine());
            System.out.println("Horas da Disciplina?:");
            disciplinas.setHoras(sc.nextInt());

            lista2.add(disciplinas);

        } while (continuar.perguntar("Quer inserir mais uma Disciplina?"));

    }

    private static void modificarDisciplina() {
        if (lista2.size() == 0) {
            System.out.println("Não Existem Cursos");
        } else {

            Scanner sc = new Scanner(System.in);
            // impresao do lista
            //for (Formando f : lista) {
            //    System.out.println(f.toString());

            //}
            System.out.println("ID da Disciplina:");

            int id = sc.nextInt();
            try {
                Disciplinas disciplinas = lista2.get(id - 1);
                sc = new Scanner(System.in);
                System.out.println("Novo nome da disciplina:");
                String nome = sc.nextLine();
                if (!nome.isEmpty()) {
                    disciplinas.setNome(nome);
                }
                sc = new Scanner(System.in);
                System.out.println("Novas horas da disciplina");
                String NewHoras = sc.nextLine();
                if (!NewHoras.isEmpty()) {//converçao de String para Integer
                    int horas = Integer.parseInt(NewHoras);
                    disciplinas.setHoras(horas);
                }

            } catch (Exception e) {

                System.out.println("A Disciplina com o " + id + " não existe");

            }
        }

    }

    private static void eliminarDisciplina() {
        Disciplinas disciplinas = new Disciplinas();
        if (lista2.size() == 0) {
            System.out.println("Não existem Disciplinas");
        } else {
            System.out.println("ID da Disciplina:");
            int id = sc.nextInt();
            try {//try para dar reset ao ID unico em caso de eliminação para não bugar
                sc = new Scanner(System.in);
                lista2.remove(id - 1);
                idDisciplina = 2;
                int j = lista2.size();
                for (int x = 2; x < j + 1; x++) {
                    disciplinas = lista2.get(x - 1);
                    disciplinas.setIdDisciplina(idDisciplina++);
                }
            } catch (Exception e) {
                System.out.println("A Disciplina com o ID " + id + " não existe");
            }
        }

    }
// fim das opções do menu Disciplinas //

// Opções do menu Inscrição de Alunos//
    private static void inscreverAluno() {
        if (lista.size() == 0 || lista1.size() == 0) {
            System.out.println("Inexistencia de um campo");
        } else {
            do {
                InscricaoAluno inscricaoaluno = new InscricaoAluno();
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduza o ID do aluno?:");
                inscricaoaluno.setIdFormando(sc.nextInt());
                System.out.println("Introduza o ID do Curso?:");
                inscricaoaluno.setIdCurso(sc.nextInt());
                lista3.add(inscricaoaluno);

            } while (continuar.perguntar("Quer inscrever mais alunos?"));

        }

    }

    private static void eliminarInscricaoAluno() {
        InscricaoAluno inscricaoaluno = new InscricaoAluno();
        if (lista.size() == 0 || lista1.size() == 0) {
            System.out.println("Inexistencia de um campo");
        } else {
            System.out.println("ID do Aluno:");
            int id = sc.nextInt();
            try {//try para dar reset ao ID unico em caso de eliminação para não bugar
                sc = new Scanner(System.in);
                lista3.remove(id - 1);
                idFormando = 2;
                int j = lista3.size();
                for (int x = 2; x < j + 1; x++) {
                    inscricaoaluno = lista3.get(x - 1);
                    inscricaoaluno.setIdCurso(idFormando++);
                }
            } catch (Exception e) {
                System.out.println("O Aluno com o ID " + id + " não existe");
            }
        }

    }

// fim das opções do menu Inscrever Alunos //
    
// Opções do menu Inscrição de disciplinas//
    private static void registarDisciplinaCurso() {
        if (lista2.size() == 0 || lista3.size() == 0) {
            System.out.println("Inexistencia de um campo");
        } else {
            do {
                DisciplinasCursos disciplinascursos = new DisciplinasCursos();
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduza o ID da Disciplina?:");
                disciplinascursos.setIdDisciplina(sc.nextInt());
                System.out.println("Introduza o ID do Curso?:");
                disciplinascursos.setIdCurso(sc.nextInt());
                lista4.add(disciplinascursos);

            } while (continuar.perguntar("Quer registar mais Disciplinas?"));

        }

    }

    private static void removerDisciplinaCurso() {
        DisciplinasCursos disciplinascursos = new DisciplinasCursos();
        if (lista2.size() == 0 || lista3.size() == 0) {
            System.out.println("Inexistencia de um campo");
        } else {
            System.out.println("ID da Disciplina:");
            int id = sc.nextInt();
            try {//try para dar reset ao ID unico em caso de eliminação para não bugar
                sc = new Scanner(System.in);
                lista4.remove(id - 1);
                idDisciplina = 2;
                int j = lista4.size();
                for (int x = 2; x < j + 1; x++) {
                    disciplinascursos = lista4.get(x - 1);
                    disciplinascursos.setIdCurso(idDisciplina++);
                }
            } catch (Exception e) {
                System.out.println("A Disciplina com o ID " + id + " não existe");
            }
        }

    }
// fim das opções do menu registar Disciplinas /
}
