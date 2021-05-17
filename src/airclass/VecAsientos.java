
package airclass;

import java.io.Serializable;

public class VecAsientos implements Serializable{
    
    static final long serialVersionUID = 1L;
    
    private Persona vec[]; // Vector recibe datos de tipo persona, es decir recibira los constructores para cada pasajero.
    private int tam;
    private int can;    
    
    
    
    public VecAsientos (){
        this.tam = 21; 
        this.vec = new Persona[tam];
        this.can = 0; 
    }
    
    // Devuelve la cantidad de personas ingresadas en un vector.
    public int getCan(){
        return can;
    }
    
    public void setCan(int can){
        this.can = can;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public boolean agregar(Persona n){
        if (can < tam){ // Mientras can no haya superado el tamaño del vector seguira ingresando personas.
            vec[can++] = n; // Contador cada vez que se ingresa una persona y lo guarda en la respectiva posición del vector de tipo Persona.
            return true;
        }
        return false;
    }
    
    public void limpiarVector(){
        for (int i = 0; i < can; i++){ // Mientras can no haya superado el tamaño del vector seguira ingresando personas.
            vec[i] = null; // Contador cada vez que se ingresa una persona y lo guarda en la respectiva posición del vector de tipo Persona.
        }
        setCan(0);
    }    
    
    // Recorre el vector comparando cada asiento dentro del objeto de persona que haya con el número temporal pasado.
    public Persona verificadorAsiento(int numero){
        for (int i = 0; i < can; i++) {
            if (vec[i].getNumAsiento() == numero){
                return vec[i];
            }     
        }
        return null;
    }
    
    // Consulta sin hay algún pasajero con el número de cédula pasado por parámetro.
    public Persona consultaPasajero(String cedula){
        for (int i = 0; i < can; i++) {
            if (vec[i].getNumPasaporte().equals(cedula)){   
                return vec[i];
            }     
        }
        return null;
    }    
    
    // Devuelve el vector en la posición indicada.
    public Persona mostrarPersona(int a){    
        return vec[a];
    }  
    
}
