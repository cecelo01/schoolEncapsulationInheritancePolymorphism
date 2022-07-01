/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.schoolencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public abstract class Pessoa { // classe abstrata
    
    private String nome, sexo;
    private int idade;

    @Override
    public String toString() {
        return "DADOS: " + "nome= " + nome + ", sexo= " + sexo + ", idade= " + idade+"\n";
    }
    
    public final void fazerAnive(){ //final, nao pode ser sobreposto
        this.setIdade(this.getIdade()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
