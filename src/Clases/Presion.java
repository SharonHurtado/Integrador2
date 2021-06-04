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
public class Presion extends Llanta{
    
    private double presion_ini;
    private double temp_ini;
    private double temp_sec;

    public Presion(double presion_ini, double temp_ini, double temp_sec, String Marca) {
        super(Marca);
        this.presion_ini = presion_ini;
        this.temp_ini = temp_ini;
        this.temp_sec = temp_sec;
    }

    

    public double convertir(double presion){
        return presion+273;
    }
    
    public double presion_ideal(){
        return Math.round((convertir(temp_sec) * presion_ini)/convertir(temp_ini));
    }
    
    public double presion_inicial_convertida(){
        return presion_ini*14.696;
    }   
    
    public double presion_ideal_convertida(){
        return presion_ideal()*14.696;
    }
    
     public String Resultado_presion(){
        String mensaje="Comparando entre la presion inicial: "+presion_inicial_convertida() +" PSI\n"+
                "se determina que la presion ideal del \nneumatico debe ser : "+presion_ideal_convertida()+ " PSI"; 
        return mensaje;
    }
    
    public String Recomendacion_presion(){
        String mensaje="";
        double a=Math.round(presion_inicial_convertida() - presion_ideal_convertida());
        double b=Math.round(presion_ideal_convertida() - presion_inicial_convertida());
        if(presion_inicial_convertida()>presion_ideal_convertida()){
            mensaje="El neumatico esta en exceso de presion, puesto que \n se deberia disminur la presion en "+a+" PSI";
        }else if(presion_inicial_convertida()<presion_ideal_convertida()){
            mensaje="El neumatico esta con falta de presion, puesto que \n deberia aumentar a "+ b +" PSI";
        }else{
            mensaje="El neumatico consta de una presion \n correcta de "+presion_inicial_convertida()+ " PSI";
        }
        return mensaje;
    }
   
    
    /**
     * @return the presion_ini
     */
    public double getPresion_ini() {
        return presion_ini;
    }

    /**
     * @param presion_ini the presion_ini to set
     */
    public void setPresion_ini(double presion_ini) {
        this.presion_ini = presion_ini;
    }

    /**
     * @return the temp_ini
     */
    public double getTemp_ini() {
        return temp_ini;
    }

    /**
     * @param temp_ini the temp_ini to set
     */
    public void setTemp_ini(double temp_ini) {
        this.temp_ini = temp_ini;
    }

    /**
     * @return the temp_sec
     */
    public double getTemp_sec() {
        return temp_sec;
    }

    /**
     * @param temp_sec the temp_sec to set
     */
    public void setTemp_sec(double temp_sec) {
        this.temp_sec = temp_sec;
    }

    @Override
    public void verDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
    
}
