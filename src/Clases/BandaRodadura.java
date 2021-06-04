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
public class BandaRodadura extends Llanta{
    
    private double ancho_uno;
    private double altura_uno;
    private double diametro_uno;
    private double ancho_dos;
    private double altura_dos;
    private double diametro_dos;
    private double tamaño;

    public BandaRodadura() {
        super(null);
    }


    public BandaRodadura(double ancho_uno, double altura_uno, double diametro_uno, double ancho_dos, double altura_dos, double diametro_dos, double tamaño, String Marca) {
        super(Marca);
        this.ancho_uno = ancho_uno;
        this.altura_uno = altura_uno;
        this.diametro_uno = diametro_uno;
        this.ancho_dos = ancho_dos;
        this.altura_dos = altura_dos;
        this.diametro_dos = diametro_dos;
        this.tamaño = tamaño;
    }

    
    
    
    
    public double pared_lateral(){
        return Math.round((ancho_uno*altura_uno)/100);
    }
    
    public double circunferencia(){
        return Math.round((pared_lateral()+((diametro_uno*25.4)/2))*2*3.1415);
    }
    
    public double diametro(){
        return Math.round((diametro_uno*25.4)+(2*pared_lateral()));
    }
    
    public double pared_lateral_2(){
        return Math.round((ancho_dos*altura_dos)/100);
    }
    
    public double circunferencia_2(){
        return Math.round((pared_lateral_2()+((diametro_dos*25.4)/2))*2*3.1415);
    }
    
    public double diametro_2(){
        return Math.round((diametro_dos*25.4)+(2*pared_lateral_2()));
    }
    
    public String diametro_ideal(){
        double diametro_ideal = diametro_2()-diametro();
        double porcentaje = (diametro_ideal*100)/diametro();
        String cad="";
        if (porcentaje<=3 && porcentaje>=-3) {
            cad+="La diferencia de diámetro no supera el 3%";
        }else{
            cad+="El diámetro difiere en más del 3%. ¡¡¡Es peligroso!!!";
        }  
        return cad;
    }
    
    public boolean Rodadura_ideal(){
        if(tamaño<=1.6){
            return true;
        }else{
            return false;
        }
    }
    
    public String Resultado_rodadura(){
        String cad="";
        if(tamaño<=1.6){
            return cad+="Necesita un cambio de Neumatico";
        }else{
            return cad+="No es necesario un cambio de Neumatico";
        }
    }
    
     
    public String Recomendacion_banda(){
        String mensaje="La medida de la banda de rodadura es inferior \n "
                + "a 1.6mm, se recomienda que se realize de \n"
                + "el cambio neumatico simulado ya que \n"
                + "se podria producir un accidente futuro";
        return mensaje;
    }
    
    /**
     * @return the ancho_uno
     */
    public double getAncho_uno() {
        return ancho_uno;
    }

    /**
     * @param ancho_uno the ancho_uno to set
     */
    public void setAncho_uno(double ancho_uno) {
        this.ancho_uno = ancho_uno;
    }

    /**
     * @return the altura_uno
     */
    public double getAltura_uno() {
        return altura_uno;
    }

    /**
     * @param altura_uno the altura_uno to set
     */
    public void setAltura_uno(double altura_uno) {
        this.altura_uno = altura_uno;
    }

    /**
     * @return the diametro_uno
     */
    public double getDiametro_uno() {
        return diametro_uno;
    }

    /**
     * @param diametro_uno the diametro_uno to set
     */
    public void setDiametro_uno(double diametro_uno) {
        this.diametro_uno = diametro_uno;
    }

    /**
     * @return the ancho_dos
     */
    public double getAncho_dos() {
        return ancho_dos;
    }

    /**
     * @param ancho_dos the ancho_dos to set
     */
    public void setAncho_dos(double ancho_dos) {
        this.ancho_dos = ancho_dos;
    }

    /**
     * @return the altura_dos
     */
    public double getAltura_dos() {
        return altura_dos;
    }

    /**
     * @param altura_dos the altura_dos to set
     */
    public void setAltura_dos(double altura_dos) {
        this.altura_dos = altura_dos;
    }

    /**
     * @return the diametro_dos
     */
    public double getDiametro_dos() {
        return diametro_dos;
    }

    /**
     * @param diametro_dos the diametro_dos to set
     */
    public void setDiametro_dos(double diametro_dos) {
        this.diametro_dos = diametro_dos;
    }


    /**
     * @return the tamaño
     */
    public double getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public void verDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    
    
}
