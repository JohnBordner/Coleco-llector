package com.example.coleco_llector.logic;


public class Game
{
    private String title;
    private int year;
    private Boolean cib;
    


    public Game(String name, int date, Boolean boxed)
    {
        title= name;
        year = date;
        cib = boxed;
    }
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public Boolean getCIB()
    {

        return cib;
    }
}
