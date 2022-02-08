
package klasaobject.porownywanieobiektow;
/**
 * 
 * @author pawelstradomski
 */

public class KlasaObjectPorownywanieObiektow {

    
    public static void main(String[] args) // Object - to domyslna super class'a dla wszystkich klas
    {
        Object o = new Punkt(1, 6);
        
        Punkt p = new Punkt(4, 10);
        Punkt p2 = new Punkt(20, 30);
        if(p.equals(p2))
            System.out.println("sa rowne");
        else
                System.out.println("nie sa rowne");
        
        System.out.println(p.getClass()); // wypisuje klase, pakunek, objekt
        
        
        
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
    public boolean equals(Object o)
    {
        Punkt przyslany = ((Punkt)o);
        
        return this.x == przyslany.x && this.y == przyslany.y;
        
    }
    
}