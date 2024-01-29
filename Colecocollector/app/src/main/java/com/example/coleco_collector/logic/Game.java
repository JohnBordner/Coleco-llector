package com.example.coleco_collector.logic;


public class Game
{
    private String title;
    private int year;
    


    public Game(String name, int date)
    {
        title= name;
        year = date;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getYear()
    {
        return this.year;
    }

}
