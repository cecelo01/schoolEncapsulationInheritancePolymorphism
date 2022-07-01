/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.schoolencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Aluno extends Pessoa{ //heranca para diferenca
    
    private int matricula;
    private String curso;

    @Override
    public String toString() { // sobreposto
        return "DADOS: " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + ", idade= " + this.getIdade()+
                " ||| Aluno ||| "+"matricula= "+this.getMatricula()+" curso= "+this.getCurso()+"\n";
    }
    
    public void pagarMesalidade(){
        System.out.println("Mensalidade paga do aluno "+this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
