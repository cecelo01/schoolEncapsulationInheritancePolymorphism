/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.schoolencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;

    @Override
    public String toString() { //sobreposicao
        return  "DADOS: " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + ", idade= " + this.getIdade()+
                " ||| Professor ||| " + "especialidade= " + especialidade + ", salario= " + salario+"\n";
    }
    
    public void receberAumento(float s){
        this.setSalario(this.getSalario()+s);
        System.out.println("Aumento concedido no valor de "+s);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
