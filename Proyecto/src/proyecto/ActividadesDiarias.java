
package proyecto;


public class ActividadesDiarias {
    
    String nombre;
    int dia; 

    public ActividadesDiarias(String nombre, int dia) {
        this.nombre = nombre;
        this.dia = dia;
    }

    String lista[]= new String[8];
    //llenado de la lista de actividades: 
   
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

 
    
    
    
}
