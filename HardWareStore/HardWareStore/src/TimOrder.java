
/**
 * Write a description of class TimOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TimOrder
{
    // instance variables - replace the example below with your own
    private int size;
    private String customerName;

    private ArrayList<TimsProduct> items;

    private TimOrder(String n, int size){
        customerName = n;
        items = new ArrayList<TimsProduct>();
        this.size = size;
    }

    public void setSize(int s){
        size = s;
    }

    public double getAmountDue(){
        double total = 0;
        for (TimsProduct p : items){
            total += p.getRetailPrice() + p.getProductionCost() + p.rentalCost();
        }
        return total;
    }

    public static TimOrder create(){
        Scanner scan = new Scanner(System.in);
        TimsProduct tp = new TimsProduct(10);
        String thing;
        System.out.println("Tim's Hard Ware Store\n");

        System.out.println("Enter Customer Name : ");
        String customerName = scan.nextLine();

        TimOrder t = new TimOrder (customerName, 1);

        while(true){
            System.out.println("Items (e.g. nails, nailgun or Q for quit) > ");
            thing = scan.nextLine();
            if(thing.equals("Q") || thing.equals("q")){
                break;
            }

            if(thing.toUpperCase().equals("NAILS")){
                t.items.add(BoxOfNail.create());
            }

            if (thing.toUpperCase().equals("NAILGUN")){
                tp.setRentalCost(10);
                t.items.add(RentableHardware.create());
            }

        }
        t.setSize(t.items.size());

        return t;
    }

    public String toString(){

        String str = "Receipt \n";

        for(int i = 0; i < items.size(); i++){
            str += String.format("\nSize : %-3d, %-20s \n Product Cost : $%.2f \n Rental Cost : %d \n HST : $%.2f ",1, items.get(i).getName(), items.get(i).getRetailPrice(), items.get(i).rentalCost(),items.get(i).getProductionCost());
        }
        return str;
    }

}
