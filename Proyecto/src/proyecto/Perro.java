package proyecto;


public class Perro{
    //atributo del nombre del perro
    private String nom;
    private int edad;
    private String raza;
    private String tamano;
    private boolean condicion=false;

    public Perro(String nom, int edad, String raza, String tamano) {
        this.nom = nom;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Perrito-Cliente" 
                + "\nNombre del perro:" + getNom() 
                + "\nEdad: " + getEdad() 
                + "\nRaza del perro:" + getRaza() 
                + "\nTamano" + getTamano() ;
    }
    
    
    
}
