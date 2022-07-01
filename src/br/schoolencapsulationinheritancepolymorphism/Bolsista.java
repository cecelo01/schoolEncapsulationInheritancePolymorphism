/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.schoolencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class Bolsista extends Aluno{
    
    private float bolsa;

    @Override
    public String toString() {
        return "DADOS: " + "nome= " + this.getNome() + ", sexo= " + this.getSexo() + ", idade= " + this.getIdade()+
                " ||| Bolsista ||| " + "bolsa= " + bolsa +"%\n";
    }
    
    @Override
    public void pagarMesalidade() { //sobreposicao
        System.out.println("E bolsista, pagamento facilitado para "+this.getNome());
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada de "+this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
