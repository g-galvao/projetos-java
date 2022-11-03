package poo;

import poo.models.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel", 1, 32, "Coqueiro", 0, "PA");
        Cliente cliente2 = new Cliente("Yuri", 2, 23, "São Paulo", 3, "SP");

        cliente1.visualizar();
        cliente2.visualizar();

    }
}
