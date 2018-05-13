import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hutan extends World
{

    /**
     * Constructor for objects of class hutan.
     * 
     */
    public hutan()
    {    
        // Buat world dengan ukuran 720x480 cells dengan cell size 1x1 pixels
        super(720, 480, 1);
        pisangjatuh(); 
        siap(); 
        bomjatuh(); 
        TAMAT();
        prepare();
    }

    public void act() //method act
    {
        if (getObjects(pisang.class).isEmpty()) pisangjatuh();
        if (getObjects(bom.class).isEmpty()) bomjatuh();
    }

    private void siap() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        monyet monyet = new monyet();
        addObject(monyet, 648, 403);
        Counter Counter = new Counter();
        addObject(Counter, 57, 69);
        nilai nilai = new nilai();
        addObject(nilai, 64, 44);
        nilai.setLocation(59, 44);
        monyet.setLocation(373, 403);
    }

    public void pisangjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new pisang(), Greenfoot.getRandomNumber(529),21);
        }
    }

    public void  bomjatuh() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new bom(), Greenfoot.getRandomNumber(523),22);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TAMAT end =new TAMAT();
        addObject(end, 395,237);
        end.setLocation(400,279);
        
        Playagain playAgain = new Playagain();
        addObject(playAgain, 405, 329);
        playAgain.setLocation(392,361);
        end.setLocation(360,290);
        playAgain.setLocation(392, 361);
    }
    public void TAMAT()
    {
    }
}

