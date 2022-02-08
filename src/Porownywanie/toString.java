
package Porownywanie;
/**
 * 
 * @author pawelstradomski
 */


public class toString {
    
    
    public static void main(String[] args) {
        
        Object[] punkty = new Punkt[4]; // mamy super klase Object wiec polecenie np punkty[i].getX nie zadziala
                                        // tak jak np w butelce czy koncie bankowym
        punkty[0] = new Punkt(2,3);
        punkty[1] = new Punkt(4,3);
        punkty[2] = new Punkt(7,5);
        punkty[3] = new Punkt(2,6);
        
        for(int i=0; i<punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }
        
        
    }
    
}
class Punkt // dziedziczenie extends Object jest juz domyslnie wykonane bez pytania
{
    private int x;
    private int y;
    
    Punkt()
    {
        
    }
    
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    int getX()
    {
        return x;
    }
    
    int getY()
    {
        return y;
    }
    @Override
    public String toString()
    {
        return this.getX() + " " + this.getY();
    }
    
}