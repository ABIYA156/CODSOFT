import java.util.Scanner;

public class Student
{

    int n,tot=0;
    float avg;
   

    int [] mark =new int[20];
    Scanner sc=new Scanner(System.in);


    void show()
    {
        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("********************************");
        System.out.println("Enter number.of.Subjects that you want:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the mark for each subject:");
            mark[i]=sc.nextInt();
            tot=tot+mark[i];

        }
        avg=tot/n;
        if(avg>=90 && avg<=100)
        {
            System.out.println("Your Grade is:A");
        }
        else if(avg>=80 && avg<=89)
        {
            System.out.println("Your Grade is:B");
        }
        else if(avg>=70 && avg<=79)
        {
            System.out.println("Your Grade is:C");
        }
        else if(avg>=60 && avg<=69)
        {
            System.out.println("Your Grade is:D");
        }
        else if(avg>=50  && avg<=59)
        {
            System.out.println("Your Grade is:E");
        }
        else
        {
            System.out.println("Your Grade is:F");
            System.out.println("Fail");

        }
        System.out.println("The Total marks of the Student is:"+tot);
        System.out.println("The Average of the Student is:"+avg);
        


    }

}
class marksheet
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.show();
    }
}