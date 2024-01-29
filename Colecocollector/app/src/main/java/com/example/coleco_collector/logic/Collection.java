package com.example.coleco_collector.logic;


import java.util.ArrayList;


public class Collection {
    private ArrayList<Game> collectionList;


    public void Collection() {
        collectionList = new ArrayList<Game>();
        return;
    }

    public void addGame(String name, int date) {
        Game newgame = new Game(name, date);
        collectionList.add(newgame);
        return;
    }

    public void printCollection() {
        for (Game game : collectionList) {
            System.out.println(game.getTitle());
        }
        return;
    }

    public ArrayList<Game> returnCollection() {
        return collectionList;
    }


    public Game returnGameinCollection(String title)
    {
        for (Game game : collectionList){
            if (game.getTitle()==title){
                return game;
            }
        }
        return null;
    }
}
