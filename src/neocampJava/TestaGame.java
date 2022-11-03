package poo;

import poo.models.LojaDeGames;

public class TestaGame {
    public static void main(String[] args) {
        LojaDeGames lojaDeGames1 = new LojaDeGames("Mundo dos Games", "Rua 1 Central", 60000f, 6, "Eletrônicos");
        LojaDeGames lojaDeGames2 = new LojaDeGames("Mario World", "Avenida das Américas, 89", 303500.84f, 10, "PC Games");

        lojaDeGames1.visualizar();
        lojaDeGames2.visualizar();
    }
}
