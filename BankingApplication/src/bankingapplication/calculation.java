
package bankingapplication;


public class calculation 
{
     int balance;
    int previousTransaction;
    String CustomerName;
    String CustomerID;

   calculation(String CustomerName, String CustomerID) {
       this.CustomerName = CustomerName;
       this. CustomerID = CustomerID;
    }

    void deposit(int amount) {
        try {
            if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;

            }
        } catch (Exception err) {
            System.out.println("err");
        }
    }

    void WithDraw(int amount) {
        try {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;

            }
        } catch (Exception e) {
            System.out.println("e");
        }

    }

    void getPreviousTransaction() {
        
        try{
        if (previousTransaction > 0) {
            System.out.println("Deposited " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("WithDraw :" + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction occured");
        }
        }catch(Exception er)
        {
            System.out.println("er");
        }
            
    }

    
}
