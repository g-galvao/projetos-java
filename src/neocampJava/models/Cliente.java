package poo.models;

import java.util.Date;

public class Cliente {
    private String nome;
    private int id;
    private int idade;
    private String endereco;
    private int tempoInstituicao;
    private String estado;

    public Cliente(String nome, int id, int idade, String endereco, int tempoInstituicao, String estado) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.endereco = endereco;
        this.tempoInstituicao = tempoInstituicao;
        this.estado = estado;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTempoInstituicao() {
        return tempoInstituicao;
    }

    public void setTempoInstituicao(int tempoInstituicao) {
        this.tempoInstituicao = tempoInstituicao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void visualizar() {
        System.out.println("\n******************************");
        System.out.println("****** Dados do Cliente ******");
        System.out.println("******************************");
        System.out.println("Nome do Cliente: " + getNome());
        System.out.println("ID: " + getId());
        System.out.println("Idade: " + getIdade());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Estado: " + getEstado());
        System.out.println("Tempo na instituição: " + getTempoInstituicao() + " ano(s)");
    }
}
