/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

public class Envio {
    private final String NombreEquipo;
    private final int NumberProblem;
    private final String Respuesta;
    
    public Envio(String NombreEquipo, int num, String Respuesta){
        this.NombreEquipo = NombreEquipo;
        this.NumberProblem = num;
        this.Respuesta = Respuesta;
    }
    
    public String GetNombreEquipo(){
        return NombreEquipo;
    }
    
    public int GetNumberProblem(){
        return NumberProblem;
    }
    
    public String GetRespuesta(){
        return Respuesta;
    }
}
