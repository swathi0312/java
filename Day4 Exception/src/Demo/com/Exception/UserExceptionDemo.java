package Demo.com.Exception;


import java.util.Scanner;

import javax.naming.LimitExceededException;
import javax.naming.TimeLimitExceededException;


public class UserExceptionDemo {
    
    int balance;
    UserExceptionDemo(int balance)
    {
        this.balance=balance;
    }
    
    public void withdraw() throws Exception
    {
        System.out.println("Enter amt to withdraw");
        int amt=new Scanner(System.in).nextInt();
        if(balance-amt<5000)
        {
        	 throw new MinimumBalanceException("your minimum balance must be 1000/-");
        }
         else if(amt>=10000)
        {
            throw new Exception("max transaction limit 10,000");
        }
        else
        {
            System.out.println("Transaction successful!! Your balance is "+(balance-amt));
        }
    }


    public static void main(String[] args) throws Exception {
        try {
            new UserExceptionDemo(50000).withdraw();
        } catch (MinimumBalanceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (LimitExceededException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


}

}
 






