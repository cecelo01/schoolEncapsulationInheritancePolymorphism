/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.schoolencapsulationinheritancepolymorphism;

/**
 *
 * @author Marce
 */
public class SchoolEncapsulationInheritancePolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa(); // Impossivel instanciar um objeto de uma classe abstrata
        
        Visitante v1 = new Visitante();
        v1.setIdade(22); 
        v1.setNome("Juvenal"); 
        v1.setSexo("M"); 
        System.out.println(v1.toString()); 
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMesalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setCurso("Informatica");
        b1.setIdade(18);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.renovarBolsa();
        b1.pagarMesalidade();
        System.out.println(b1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Joao");
        t1.setMatricula(1113);
        t1.setCurso("Informatica");
        t1.setIdade(19);
        t1.setSexo("M");
        t1.setRegistroProf(1544);
        t1.praticar();
        t1.pagarMesalidade();
        System.out.println(t1.toString());
        
        Professor p1 = new Professor();
        p1.setIdade(34); 
        p1.setNome("Guanabara"); 
        p1.setSexo("M");
        p1.setSalario(2500.25f);
        p1.setEspecialidade("JAVA");
        p1.receberAumento(500.50f);
        System.out.println(p1.toString());
        
        
    }
    
}
