 
package airclass;


import java.io.Serializable;
import java.util.Formatter;

public class Persona implements Serializable{
    
    static final long serialVersionUID = 1L;
    
    private transient Formatter ceros = new Formatter();
    
    // Atríbutos
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private String numPasaporte;
    private int destino; // 1 = Nicaragua y 2 = Panamá
    private String numVuelo; // 1 = NCA o 2 = PNA
    private int numAsiento; // 00 - 20
    private String numTiquete; // numVuelo (NCA o PNA) + numAsiento (00 - 20)
    protected double costoBoleto; // NCA = $95, PNA = $100
    private String membresiaTipo;
    private int membresiaPts;

    // Constructor con datos necesarios a recibir del pasajero.
    public Persona(String nombre, String apellido, int edad, char genero, String numPasaporte, int destino, int numAsiento, String membresiaTipo, int membresiaPts) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.numPasaporte = numPasaporte;
        this.destino = destino;
        this.numAsiento = numAsiento;
        this.membresiaTipo = membresiaTipo;
        
               
        // Sets se activan al llamar al constructor
        setNumVuelo();
        setNumTiquete(numVuelo, numAsiento);
        setCostoBoleto();
        setMembresiaPts(membresiaPts);

    }

    public Persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getGenero() {
        return ( genero == 'F') ? "Femenino" : "Masculino";
    }
    
    public char getGeneroC(){
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNumPasaporte() {
        return numPasaporte;
    }
    
    public void setNumPasaporte(String numPasaporte){
        this.numPasaporte = numPasaporte;
    }

    public String getDestino() {
        return ( destino == 1 ) ? "Nicaragua" : "Panamá"; // Rtorna el valor en modo String para mostrar en interfaz
    }
    
    public int obtenerDestino(){ // Retorna el valor real de la variable
        return destino;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) { // Si se cambia el Número de Asiento, se debe modificar el Número de Tiquete.
        this.numAsiento = numAsiento;
 
    }
    
    public void setDestino(int destino) {       // Si se modifica el destino que tambien se active el set para cambiar el Número de vuelo y el Número de Tiquete
        this.destino = destino;

    }
    
    public void setNumVuelo() {
        
        this.numVuelo = (destino == 1) ? "NCA":"PNA";
    }

    public String getNumTiquete() {
        return numTiquete;
    }

    public void setNumTiquete(String numVuelo, int numAsiento) {
        
        // se aplica formato de ceros a izquierda con clase Formatter y luego se pasa a String para almacenar en el antributo de tipo String numTiquete.
        String numCeros = String.valueOf(ceros.format("%02d", this.numAsiento)); 
        this.numTiquete = numVuelo + numCeros;
    }

    public double getCostoBoleto() {
        return costoBoleto;
    }

    public void setCostoBoleto() { 
        this.costoBoleto = ( destino == 1 ) ? 95 : 100;   
    }  
    
    public void modificaCostoMembresia(){
        this.costoBoleto = 0;
    }

    public int getMembresiaPts() {
        return membresiaPts;
    }

    public void setMembresiaPts(int membresiaPts) {
        this.membresiaPts += membresiaPts;
    }

    public String getMembresiaTipo() {
        return membresiaTipo;
    }

    public void setMembresiaTipo(String membresiaTipo) {
        this.membresiaTipo = membresiaTipo;
    }
    
}
