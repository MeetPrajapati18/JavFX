
/**
 * This TestProgram tests the BankAccount class in the
 * terminal window.
 *
 * @author Dave Slemon
 * @version v100
 */
public class TestProgram
{
    public static void main(String[] args)
    {//main

        BankAccount d = new BankAccount("Dave");
        BankAccount n = new BankAccount("Nathan");

        //add some money
        d.deposit(100);
        n.deposit(50);

        //withdraw
        d.withdraw(1);
        n.withdraw(1);

        //output the balances
        System.out.println(d);
        System.out.println(n);


    }//main
}