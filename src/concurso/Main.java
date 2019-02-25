
package concurso;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        
        Concurso a1 = new Concurso("Sesion 1", 2);
        Concurso a2 = new Concurso("Sesion 2", 3);
        Concurso a3 = new Concurso("Sesion 3", 3);
        
        ArrayList<Concurso> listaA;
        listaA= new ArrayList<>();
        
        ArrayList<String> listaB;
        listaB= new ArrayList<>();
        
        listaA.add(a1);
        listaA.add(a2);
        listaA.add(a3);
        
        listaB.add("equipo 1");
        listaB.add("equipo 2");
        listaB.add("equipo 3");
        
        for (Concurso a: listaA){
            System.out.println("Concurso: "+ a.Getnombre());
            a.AddEquipos(listaB);
            
            for(String w: listaB){
                a.RegistroEnvio(w, 1, "2");
            }
            
        }
        
 
    }
}
