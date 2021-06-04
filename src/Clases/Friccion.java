/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Marck
 */
public class Friccion extends Llanta{
    
    private double kilometraje;
    private int tipo;

    public Friccion(double kilometraje, int tipo, String Marca) {
        super(Marca);
        this.kilometraje = kilometraje;
        this.tipo = tipo;
    }

    

    public double convertir_ms(){
        return (kilometraje/3.6);
    }
    
    
    public double rosamiento(){
        double coef=0;
        if(tipo==1){
            coef=1;
        }else{
            coef=0.5;
        }    
        return coef;
    }
    
    public double aceleracion(){
        return rosamiento()*9.8;
    }
    
    public double distancia_fric(){
        return Math.round((convertir_ms()*convertir_ms())/(2*aceleracion()));
    }
    
    public String friccion_ideal(double frinccion_ideal){
        String mensaje="La distancia de frenado recorrida es: "+frinccion_ideal+" metros";
        return mensaje;
    }
    
    /*public String Recomendacion_friccion(double rosamiento,double friccion_ideal){
        String mensaje="";
        if(rosamiento>=0.6){
            if(friccion_ideal>)
            
            
            
        }else{
            
        }
    }*/
    
    
    /**
     * @return the kilometraje
     */
    public double getKilometraje() {
        return kilometraje;
    }

    /**
     * @param kilometraje the kilometraje to set
     */
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void verDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
