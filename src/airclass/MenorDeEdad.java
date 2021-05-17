
package airclass;

public class MenorDeEdad extends Persona {
    
    private String encargado;
    private String autorizado;

    public MenorDeEdad(String nombre, String apellido, int edad, char genero, String numPasaporte, int destino, int numAsiento, String membresiaTipo, int membresiaPts, String encargado, String autorizado) {
        super(nombre, apellido, edad, genero, numPasaporte, destino, numAsiento, membresiaTipo, membresiaPts);
        this.encargado = encargado;
        this.autorizado = autorizado;
        
        setCostoBoleto();
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }
    
    public String getAutorizado (){
        return autorizado;
    }
    
    @Override
    public void setCostoBoleto() {
  
        this.costoBoleto = (obtenerDestino() == 1) ? (95 - (95 * 0.10)) : (100 - 10);   
    }            
}
