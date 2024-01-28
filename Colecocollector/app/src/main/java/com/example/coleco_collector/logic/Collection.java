package com.example.coleco_llector.logic;


import java.util.ArrayList;


public class Collection {
    private ArrayList<Game> mycollection;


    public Collection() {
        mycollection = new ArrayList<>();
    }

    public void addGame(String name, int date, Boolean boxed) {
        Game newgame = new Game(name, date, boxed);
        mycollection.add(newgame);
        return;
    }

    public void printCollection() {
        for (Game game : mycollection) {
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
        for (Game game : mycollection){
            if (game.getTitle()==title){
                return game;
            }
        }
        return null;
    }
}
