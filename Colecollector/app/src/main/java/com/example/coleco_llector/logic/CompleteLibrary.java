package com.example.coleco_llector.logic;


public class CompleteLibrary
{
    // instance variables - replace the example below with your own
    private Game[] fullLibrary;
    private int amountofgames;

    public CompleteLibrary(int gamesinlibrary)
    {
        amountofgames = gamesinlibrary;
        fullLibrary= new Game[amountofgames];
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
