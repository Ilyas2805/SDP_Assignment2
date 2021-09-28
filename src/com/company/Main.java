package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dota dota2 = new Dota();
        dota2.addCharacter("Pudge");
        dota2.addCharacter("Earthshaker");
        dota2.addCharacter("Axe");
        dota2.addCharacter("Riki");

        Player player1 = new Player("ebasher2010");
        Player player2 = new Player("Pro gamer");
        Player player3 = new Player("zxcursed");

        dota2.registerPlayer(player1);
        dota2.registerPlayer(player2);
        dota2.registerPlayer(player3);

        dota2.addCharacter("Hoodwink");
        dota2.addCharacter("Dawnbreaker");

    }
}
