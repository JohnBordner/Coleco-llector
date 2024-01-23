import java.util.ArrayList;

/**
 * Write a description of class Collection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Collection
{
    // instance variables - replace the example below with your own
    private ArrayList<Game> mycollection;

    /**
     * Constructor for objects of class Collection
     */
    public Collection()
    {
        // initialise instance variables
        collection1 = new Collection();
    }
    public void addGame(String name, int date, Boolean boxed)
    {
        Game newgame = new Game(name,date,boxed);
        mycollection.add(newgame);
        return;
    }
    public void printCollection()
    {
        for (Game game : mycollection){
            System.out.println(game.getTitle());
        }
        return;
    }
    public ArrayList<Game> returnCollection()
    {
        return mycollection;
    }
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
