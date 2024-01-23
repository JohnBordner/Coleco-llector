package com.example.gamecollection.Classes;

/**
 * Write a description of class CompleteLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompleteLibrary
{
    // instance variables - replace the example below with your own
    private Game[] fullLibrary;
    private int amountofgames;
    /**
     * Constructor for objects of class CompleteLibrary
     */
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
