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
        gameOver();//method gameOver

    }
    
    public Counter() //kelas Counter
    {
<<<<<<< HEAD
        setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    
    public void Counting (int hitung) // method Counting
    {
        totalCount += hitung;
        setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
=======
         setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    public void Counting (int hitung) // method Counting
    {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
>>>>>>> 87e4a79a0621e26212920cd80dcd23a960378a16
    }
    
    public void gameOver() //method menang
    {
<<<<<<< HEAD
        if (totalCount >= 100) //bila totalCount >= 50
        {
            Greenfoot.stop();  // stop permainan
            Greenfoot.playSound("hore.wav"); //mainkan sound hore.wav
            System.out.println("CONGRATULATION WON! Click RESET to play again"); //tampilkan tulisan ini
        }
=======
         if (totalCount >= 100) //bila totalCount >= 50
         {
             Greenfoot.stop();  // stop permainan
             Greenfoot.playSound("hore.wav"); //mainkan sound hore.wav
             System.out.println("CONGRATULATION WON! Click RESET to play again"); //tampilkan tulisan ini
         }
>>>>>>> 87e4a79a0621e26212920cd80dcd23a960378a16
    }
 }
