import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mulailagi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mulailagi extends World
{

    /**
     * Constructor for objects of class mulailagi.
     * 
     */
    public mulailagi()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject (new Playagain(), 515,350);
    }
}
