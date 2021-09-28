package com.company;

import java.util.ArrayList;
import java.util.List;

public class Dota implements IObservable{

    private List<String> characters = new ArrayList<>();
    private List<IObserver> players = new ArrayList<>();

    public void addCharacter(String character){
        this.characters.add(character);
        notifyAllPlayers();
    }

    public void removeCharacter(String character){
        this.characters.remove(character);
        notifyAllPlayers();
    }

    @Override
    public void registerPlayer(IObserver player) {
        this.players.add(player);
    }

    @Override
    public void unregisterPlayer(IObserver player) {
        this.players.remove(player);
    }

    @Override
    public void notifyAllPlayers() {
        for(IObserver player:players){
            player.update(this.characters);
        }
    }
}
