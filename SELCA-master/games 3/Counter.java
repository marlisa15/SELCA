import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color; //untuk pengaturan warna

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0; // Counter default awal = 0
    public void act() //method act 
    {
        menang();
    }
    
    public Counter() //kelas Counter
    {
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
   
    public void Counting (int hitung) // method Counting
    {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    
    public void menang() //method menang
    {
        if (totalCount >= 100) //bila totalCount >= 50
        {
            Greenfoot.stop();  // stop permainan
            Greenfoot.playSound("hore.wav"); //mainkan sound hore.wav
            getWorld().addObject(new Menang(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop(); //tampilkan tulisan ini
        }
    }
 }
