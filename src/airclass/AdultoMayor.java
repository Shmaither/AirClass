
package airclass;

public class AdultoMayor extends Persona{
    
    private String regimen;
 
    
    public AdultoMayor(String nombre, String apellido, int edad, char genero, String numPasaporte, int destino, int numAsiento, String membresiaTipo, int membresiaPts,  String regimen) {
        super(nombre, apellido, edad, genero, numPasaporte, destino, numAsiento, membresiaTipo, membresiaPts);
        this.regimen = regimen;
        
        setCostoBoleto();
    }

    public String getRegimen() {    
        return regimen; 
    }

    public void setRegimen(String regimen) {  
        this.regimen = regimen;
    }

    @Override
    public void setCostoBoleto() {
        
        this.costoBoleto = (obtenerDestino() == 1) ? (95 - (95 * 0.35)) : (100 - 35);   
    }    
}
