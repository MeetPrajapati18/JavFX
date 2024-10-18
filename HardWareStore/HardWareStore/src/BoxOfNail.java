
/**
 * Write a description of class BoxOfNail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoxOfNail extends TimsProduct
{
    // instance variables - replace the example below with your own
    private double size;
    private int quantity;


    private BoxOfNail(String n, double s, int q, double c, double p){
        super(n,c,p);
        this.size = s;
        this.quantity = q;
    }

    public static BoxOfNail create(){
        String n = "Box of Nails";
        double s = 1;
        int q = 1;
        double p = 13.00;
        double c = p;
        BoxOfNail b = new BoxOfNail (n,s,q,c,p);
        return b;
    }

    public String toString(){
        return getName();
    }
}
