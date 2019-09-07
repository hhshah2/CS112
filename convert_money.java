import java.util.Scanner;

public class convert_money
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); 
        String a;
        float b;
        System.out.println("Avaliable Currency Inputs:");
		System.out.println("E - Euros");
		System.out.println("Y - Yuan");
		System.out.println("R - Rupee");
		System.out.println("B - Bitcoin");
		System.out.print("Please enter the Currency you will use");
        a=input.nextLine();
        
		System.out.print("Please enter the amount");
        b=input.nextFloat();

		switch(a)
		{
			case "E":
            case "Euros":
                        System.out.println("The Amount in USD is=" + (b * 1.16));
					   break;
			case "Y":
			case "Yuan":
						 System.out.println("The Amount in USD is=" + (b * 0.15));
					  	 break;
			case "R":
            case "Rupee":
                       System.out.println("The Amount in USD is=" + (b * 0.015));
					   break;
			case "B":
            case "Bitcoin":
                       System.out.println("The Amount in USD is="+ (b * 6923.80));
					   break;
			default:System.out.println("Invalid Currency");
        }
    }
}