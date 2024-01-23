package com.example.gamecollection.Classes;

/**
 * Write a description of class Games here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String title;
    private int year;
    private Boolean cib;
    

    /**
     * Constructor for objects of class Games
     */
    public Game(String name, int date, Boolean boxed)
    {
        // initialise instance variables
        title= name;
        year = date;
        cib = boxed;
    }
    public String getTitle()
    {
        // put your code here
        return title;
    }
    public int getYear()
    {
        // put your code here
        return year;
    }
    public Boolean getCIB()
    {
        // put your code here
        return cib;
    }
}
