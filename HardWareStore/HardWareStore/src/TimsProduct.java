
/**
 * Write a description of class TimsProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimsProduct {
    // instance variables - replace the example below with your own
    private String name;
    private double cost;
    private double price;
    private int rentalCost;

    public TimsProduct(String n, double c, double p){
        name = n;
        cost = c;
        price = p;
    }

    public TimsProduct(int rentalCost){
        this.rentalCost = rentalCost();
    }

    public String getName(){
        return name;
    }

    public double getProductionCost(){
        return (13*cost/100);
    }

    public int rentalCost(){
        return rentalCost;
    }

    public void setRentalCost(int rentalCost){
        this.rentalCost = rentalCost;
    }

    public double getRetailPrice(){
        return price;
    }
}
