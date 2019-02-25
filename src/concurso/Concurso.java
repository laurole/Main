
package concurso;

import java.util.ArrayList;

public class Concurso {

    private String nombre; 
    private  int [] numProblemas;
    int numEquipo;
    private ArrayList<String> Equipos = new ArrayList<>();
    private ArrayList<Envio> Envios;
 
public int [] GetnumProblemas(){
     return numProblemas;
}

public String Getnombre(){
    return nombre;
}

public ArrayList<Envio> GetEnvios(){
    return Envios;
}

public ArrayList<String> GetEquipos(){
    return Equipos;
}

 public Concurso( String nombre, int numProblem ){ 

     this.nombre = nombre;
     this.numProblemas = new int [numProblem];
     this.Envios = new ArrayList<>();
 } 
 
 public Concurso(String nombre){ 

     this.nombre = nombre;
     this.Envios = new ArrayList<>();
     this.numProblemas = new int[5];
     
 }
 
 public void AddEquipo(String Nombre){
  boolean  aux = false; 
     if(Equipos.isEmpty()){
        Equipos.add(Nombre);
        System.out.println("El equipo "+this.Equipos.get(0)+" ha sido agregado");
     }else{
         for(String m: this.Equipos){
             if(m.equals(Nombre)){
                aux=true;
                }
        }
         if(!aux){
             Equipos.add(Nombre);
             System.out.println("El equipo "+Nombre+" ha sido agregado");
         }else{
             System.out.println("El nombre ya existe");
         }
     }
  }

public void AddEquipos(ArrayList<String> equipos){
    if(this.Equipos.isEmpty()){
        this.Equipos = equipos;     
        this.Equipos.forEach((o) -> {
            System.out.println("Se ha agregado al equipo  "+o);
        });
    }else{
        for(String nn :equipos){
            this.AddEquipo(nn);
        }
    }
    
}

public boolean EliminarEquipo(String nombre){
    
    for(int i =0; i<=Equipos.size(); i++){
        if(Equipos.get(i).equals(nombre)){
            this.Equipos.remove(i);
            System.out.println("Se elimino correctamente");
            return true;
        }
    }
   return false;
}

public boolean ValidarRespuesta(String r){
    return r != null && r.length() != 0;
}

public boolean ValidarE(String n){
   for(String p: this.Equipos){
     if(p.equals(n)){
         return true;
     }
    }
   return false;
}

public boolean ValidarNum(int c){
    return c <= this.numProblemas.length;
}

public Envio RegistroEnvio(String equipo, int n, String Rta){
    
    if(this.ValidarE(equipo)){
        if(this.ValidarNum(n)){
            if(this.ValidarRespuesta(Rta)){
                Envio z = new Envio(equipo, n, Rta);
                this.Envios.add(z);
                System.out.println("Se ha registrado el envio del equipo "+ z.GetNombreEquipo());
                System.out.println("De la pregunta No. "+ z.GetNumberProblem()+" con respuesta: "+ z.GetRespuesta());
                return z;
            }
            return null;
        }
        return null;
    }
    return null;
}



}