
/**
 * Write a description of class CashRegisterApp here.
 *
 * @author Meetkumar Prajapati (000922812)
 * @version (a version number or a date)
 */
public class CashRegisterApp
{
    public static void main (String [] args){
        TimOrder t = TimOrder.create();
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n",t.getAmountDue());
    }
}
