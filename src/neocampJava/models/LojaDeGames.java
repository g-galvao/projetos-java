package poo.models;

public class LojaDeGames {
    private String nome;
    private String endereco;
    private float patrimonio;
    private int tempoCriacao;
    private String tipoGames;

    public LojaDeGames(String nome, String endereco, float patrimonio, int tempoCriacao, String tipoGames) {
        this.nome = nome;
        this.endereco = endereco;
        this.patrimonio = patrimonio;
        this.tempoCriacao = tempoCriacao;
        this.tipoGames = tipoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(float patrimonio) {
        this.patrimonio = patrimonio;
    }

    public int getTempoCriacao() {
        return tempoCriacao;
    }

    public void setTempoCriacao(int tempoCriacao) {
        this.tempoCriacao = tempoCriacao;
    }

    public String getTipoGames() {
        return tipoGames;
    }

    public void setTipoGames(String tipoGames) {
        this.tipoGames = tipoGames;
    }

    public void visualizar() {
        System.out.println("\n******************************");
        System.out.println("*** Dados da Loja de Jogos ***");
        System.out.println("******************************");
        System.out.println("\nNome: " + getNome());
        System.out.println("\nEndereço: " + getEndereco());
        System.out.println("\nPatrimônio Acumulado: " + getPatrimonio());
        System.out.println("\nTempo no mercado: " + getTempoCriacao() + " anos");
        System.out.println("\nTipos de Jogos: " + getTipoGames());
    }
}
