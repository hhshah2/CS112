import java.util.Scanner;

public class water
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); 
        float a;
        
		System.out.print("Please enter the temperature of the water in Farhenheit");
        a=input.nextFloat();

		if(a <= 32)
			System.out.println("The temperature is" + ((a-32) * (5/9)) + "in Celcius. It is frozen." );
		else if(a > 32 && a<= 212)
			System.out.println("The temperature is" + ((a-32) * (5/9)) + "in Celcius. It is liquid." );
		else
			System.out.println("The temperature is" + ((a-32) * (5/9)) + "in Celcius. It is gaseous." );

    }
} 