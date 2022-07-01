/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.schoolencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Tecnico extends Aluno {

    private int registroProf;

    @Override
    public String toString() { //sobreposicao
        return "DADOS: " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + ", idade= " + this.getIdade()+
                " ||| Tecnico ||| " + "registroProf= " + registroProf+"\n";
    }

    public void praticar() {
        System.out.println(this.getNome() + " esta praticando.");
    }

    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }

}
