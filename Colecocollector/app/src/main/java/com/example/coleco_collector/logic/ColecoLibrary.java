package com.example.coleco_collector.logic;

import java.util.ArrayList;

public class ColecoLibrary {

    private ArrayList<Game> colecoGames;

    public void ColecoLibrary(){
        colecoGames = new ArrayList<Game>();
        addGames();
        return;
    }

    public ArrayList<Game> getColecoGames(){
        return colecoGames;
    }

    public void addGames(){
        colecoGames.add(new Game("Donkey Kong", 1981));
        //add more games here
        return;
    }

}
