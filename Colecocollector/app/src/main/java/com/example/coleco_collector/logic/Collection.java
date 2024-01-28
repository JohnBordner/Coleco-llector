package com.example.coleco_collector.logic;


import java.util.ArrayList;


public class Collection {
    private ArrayList<Game> collectionList;


    public Collection() {
        new Collection();
    }

    public void addGame(String name, int date, Boolean boxed) {
        Game newgame = new Game(name, date, boxed);
        collectionList.add(newgame);
        return;
    }

    public void printCollection() {
        for (Game game : collectionList) {
            System.out.println(game.getTitle());
        }
        return;
    }
/*
    public ArrayList<Game> returnCollection() {
        return mycollection;
    }

 */
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
