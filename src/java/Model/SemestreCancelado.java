/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author apmagalhaes
 */
public class SemestreCancelado {
    private int ano, semestre, id;
    private SemestreCancelado[] todos = new SemestreCancelado[10];

    public SemestreCancelado(int ano, int semestre) {
        this.ano = ano;
        this.semestre = semestre;
    }

    public SemestreCancelado() {
    }

    public SemestreCancelado(int id, int ano, int semestre) {
        this.ano = ano;
        this.semestre = semestre;
        this.id = id;
    }

    public SemestreCancelado[] getTodos() {
        return todos;
    }

    public void setTodos(SemestreCancelado[] todos) {
        this.todos = todos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void incluir(){
        SemestreCanceladoDAO scDao = new SemestreCanceladoDAO();
        scDao.incluir(this);
    }
    public void listarTodos(){
        SemestreCanceladoDAO scDao = new SemestreCanceladoDAO();
        scDao.ContultaTodos(todos);
    }
}
