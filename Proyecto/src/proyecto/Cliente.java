package proyecto;


public class Cliente extends Perro {
    
    private String nombre;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String telefono, String correo, 
            String nom, int edad, String raza, String tamano) {
        
        super(nom, edad, raza, tamano);
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dueño del perro: "
                +"\nNombre del dueño: "+ getNombre() 
                + "\nNumero de telefono" + getTelefono() 
                + "\nCorreo Electrónico" + getCorreo();
    }
    
    
}
