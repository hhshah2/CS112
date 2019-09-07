import java.util.Scanner;

public class classify_age
{
	public static void main(String [] args)
	{
        Scanner input=new Scanner(System.in); 
        int a;
        
		System.out.print("What age is the person in years?");
        a=input.nextInt();

		if(a < 1)
            System.out.println("This person is an infant");
		else if(a >= 1 && a < 3)
            System.out.println("This person is a toddler");
        else if(a >= 3 && a < 13)
            System.out.println("This person is a child");
        else if(a >= 13 && a < 18)
            System.out.println("This person is a teenager");
        else if(a >= 18 && a < 65)
            System.out.println("This person is a adult");
        else 
            System.out.println("This person is a senior");


    }
} 