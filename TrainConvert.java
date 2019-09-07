import java.util.Scanner;

public class TrainConvert
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in); 
        String a;
        float b;
        System.out.println("Avaliable Class Levels:");
		System.out.println("First Class - One - 1");
		System.out.println("Second Class - Two - 2");
		System.out.println("Third Class - Three -3");
		System.out.print("Please enter the class you would Like");
        a=input.nextLine();
        
		System.out.print("Please enter the amount of miles you will ride.");
        b=input.nextFloat();

		switch(a)
		{
            case "1":
            case "One":
            case "First Class":
                        System.out.println("You have Chosen First Class");
                            if(b <= 100)
                                System.out.println("Your final price is :" + b * 3);
                            else if(b > 100 && b <= 250)
                                System.out.println("Your final price is:" + ((100 * 3)+((b-100)*2.50)));
                            else if(b > 250)
                                System.out.println("Your final price is:" + ((100 * 3)+((150 * 2.50)+(b*2))));
					   break;
            case "2":
            case "Two":
            case "Second Class":
                        System.out.println("You have Chosen Second Class");
                           if(b <= 100)
                                 System.out.println("Your final price is :" + b * 2);
                            else if(b > 100 && b <= 250)
                                 System.out.println("Your final price is:" + ((100 * 2)+((b-100)*1.50)));
                            else if(b > 250)
                                 System.out.println("Your final price is:" + ((100 * 2)+((150 * 1.50)+(b*1))));
                             break;
            case "3":
            case "Three":
            case "Third Class":
                            System.out.println("You have Chosen Second Class");
                                if(b <= 100)
                                    System.out.println("Your final price is :" + b * 1.50);
                                else if(b > 100 && b <= 250)
                                    System.out.println("Your final price is:" + ((100 * 1.50)+((b-100)*1)));
                                else if(b > 250)
                                    System.out.println("Your final price is:" + ((100 * 1.50)+((150 * 1)+(b*0.50))));
                                break;
			default:System.out.println("Error");
        }
    }
}