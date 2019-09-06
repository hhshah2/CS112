import java.util.Scanner;

public class ClassAssignBabylon
{

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double guess=0,r=0,n;
        System.out.println("Please enter the double");
        n=input.nextDouble();   
        guess=( n /2 );

        for(int c=0;c<5;c++);
            {
                
                r = (n / guess);
                guess = ((guess + r) / 2);
            }

       System.out.printf("I think the number is: %.2f",r);
       System.out.println("END");
        


    }
}