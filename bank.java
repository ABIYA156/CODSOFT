import java.util.*;

class ATMmachine 
{
    int accno;
    int amount;
    float bankbalance;
    float withdraw;
    int PIN;
    
    Scanner sc = new Scanner(System.in);

    void user() 
    {
        System.out.println("WELCOME TO AXIS BANK ATM MACHINE");
        System.out.println("******************************");
       
        System.out.println("Enter the Account no:");
        accno = sc.nextInt();
        
        System.out.println("Enter the amount that you want to withdraw:");
        amount = sc.nextInt();
       
        System.out.println("Enter PIN NUMBER:");
        PIN = sc.nextInt();
    }
}

class BankAccount extends ATMmachine 
{

    void tran() {
        
        System.out.println("YOUR TRANSCATION BEING PROCESSED");
       
       
       }

    
    void deposit() 
    {
        System.out.println("Enter the Account no:");
        accno = sc.nextInt();
        
        System.out.println("Enter the deposit amount:");
        float depositAmount = sc.nextFloat();
        bankbalance += depositAmount;
        
        System.out.println(" deposited successfully" + bankbalance);
    }

    void withdraw() 
    {
        System.out.println("Enter the Account no:");
        accno = sc.nextInt();
       
        System.out.println("Enter the withdraw amount:");
        float withdrawAmount = sc.nextFloat();
        
        if (withdrawAmount <= bankbalance) 
        {
            bankbalance -= withdrawAmount;
            System.out.println("withdrawn successfully" + bankbalance);
            System.out.println("TRANSCATION SUCCESSFULL");
        }
         else 
        {
            System.out.println("zero balance" + bankbalance);
        }
    }
    
    

}


public class bank
{
    public static void main(String[] args) 
    {
       
        BankAccount b = new BankAccount();
        b.user();
        b.tran();
        b.deposit();
        b.withdraw();
    }
}

