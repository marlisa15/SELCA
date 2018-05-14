import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class monyet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class monyet extends benda
{
    /**
     * Act - do whatever the kereta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
            moveMonyet(); //method moveMonkey
            objectDisappear(); //method objectDisappear
        }
    }    
       
    public void objectDisappear() //method objectDisappear
    {
         if (canSee(pisang.class)) //bila melihat kelas objek banana
         {
             eat(pisang.class); //eat kelas objek banana
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
             Greenfoot.playSound("score.wav"); // mainkan sound score.wav
         }
    }
       
    public void moveMonyet() //method moveMonkey
    {
        if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
        {
            move(-7); //bergerak ke -7
        }
        if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
        {
            move(7); //bergerak ke 7
        }
     }
}