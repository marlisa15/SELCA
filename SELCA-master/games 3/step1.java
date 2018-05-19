import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class step1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class step1 extends World
{

    /**
     * Constructor for objects of class step1.
     * 
     */
    public step1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject (new next(), 525,60);
    }
}
