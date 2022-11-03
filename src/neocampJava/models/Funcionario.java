package poo.models;

public class Funcionario {
    private String nome;
    private int id;
    private String profissao;
    private float salarioBase;
    private int tempoEmpresa;

    public Funcionario(String nome, int id, String profissao, float salarioBase, int tempoEmpresa) {
        this.nome = nome;
        this.id = id;
        this.profissao = profissao;
        this.salarioBase = salarioBase;
        this.tempoEmpresa = tempoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    public void visualizar() {
        System.out.println("\n****************************");
        System.out.println("*** Dados do Funcionário ***");
        System.out.println("****************************");
        System.out.println("\nNome: " + getNome());
        System.out.println("\nMatrícula: " + getId());
        System.out.println("\nProfissão: " + getProfissao());
        System.out.println("\nSalário Base: " + getSalarioBase());
        System.out.println("\nTempo na Empresa: " + getTempoEmpresa());
    }
}
