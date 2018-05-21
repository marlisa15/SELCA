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
    private int totalCount = 0; // Counter default awal = 0
    public void act() //method act 
    {
        menang();
    }
   
    public Counter() //kelas Counter
    {
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); //membuat tampilancounter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
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
            Greenfoot.playSound("menang.wav"); //mainkan sound hore.wav
            getWorld().addObject(new Menang(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop(); //permainan berhenti
        }
    }
 }
