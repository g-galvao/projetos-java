package poo;

import poo.models.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Gabriel", 311007, "Softare Developer Jr", 5030.88f, 0);
        Funcionario funcionario2 = new Funcionario("Tereza", 310189, "Tech Recruiter", 10583.84f, 2);

        funcionario1.visualizar();
        funcionario2.visualizar();
    }
}
