import java.util.Random;
import java.util.Scanner;

class Pre {
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    int n, predict, score = 0, T = 3;

    void show() 
    {
        System.out.println("WELCOME TO THE NUMBER GAME");
        System.out.println("**************************");
        System.out.println("You have only three trials in this game.");
        System.out.println("In this game, you want to predict a number. The number should be the same as your random number.");
        System.out.println("OK, let's check how good your prediction is!");
        System.out.println("**************************************************************************************************");
    }

   
    void get() 
    {
        
        predict = ran.nextInt(); 
        
        for (int i = 1; i <= T; i++) 
        {
            
            System.out.println("Enter a number:");
            n = sc.nextInt();

            if (predict == n) 
            {
                System.out.println("You won this game! Congratulations! Your prediction is amazing.");
                
                break;


            } 
            else if (predict > n) 
            {
                
                System.out.println("Your predicted number is too low.");
                
                System.out.println("you have only 2 trials");

                System.out.println("Your Score is:50");

            } 
            else if (predict < n) 
            {
                
                System.out.println("Your predicted number is too high.");

                System.out.println("You have only 1 trial");

                System.out.println("Your Score:50");
            }


           else 
           
            {
                
                System.out.println("GAME OVER");

                System.out.println("Your TRIAL is OVER");
                
                
            }
        }
        System.out.println("predict number:54");
        System.out.println("Finish the game");
       
    }
}


public class Derived {
    public static void main(String[] args) 
    {
        
        Pre p = new Pre();
        p.show();
        p.get();
        
    }
}

