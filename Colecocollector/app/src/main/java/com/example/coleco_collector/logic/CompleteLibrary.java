package com.example.coleco_collector.logic;

import java.util.ArrayList;

public class CompleteLibrary
{
    private ArrayList<Game> libraryList;


    public CompleteLibrary()
    {
       myLibrary = new CompleteLibrary();
    }


    public Game[] returnGameLibrary()
    {
        // put your code here
        return fullLibrary;
    }
    public void printGameLibrary()
    {
        for(Game game: fullLibrary){
            System.out.println(game);
        }
        return;
    }
}
