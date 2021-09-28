package com.company;

import java.util.List;

public class Player implements IObserver{
    private String username;

    public Player(String username){
        this.username = username;
    }

    @Override
    public void update(List<String> characters) {
        System.out.println("Dear " + this.username + "\n We have a great news, new patch \n Added a new character \n Here is the updated list of characters\n" + characters + "\n");
    }
}
