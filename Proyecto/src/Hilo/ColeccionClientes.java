package Hilo;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ColeccionClientes {

    private List<Cliente> clientes;

    public ColeccionClientes() {
        this.clientes = new ArrayList<>();
    }

    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorNombrePerro(String nombrePerro) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombrePerro().equalsIgnoreCase(nombrePerro)) {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}

