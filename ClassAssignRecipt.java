import java.util.Scanner;

public class ClassAssignRecipt
{
    public static void main(String[] args) 
    {
        Scanner i=new Scanner(System.in);
        String ni1,ni2,ni3;
        int qi1,qi2,qi3,tax=0.0625;
        double pi1,pi2,pi3;
        double ti1,ti2,ti3,total;

        System.out.println("What is the name of the first item?");
        ni1 = i.next();
        System.out.println("How much did you buy?");
        qi1 = i.nextInt();
        System.out.println("How much did you pay for each one?");
        pi1 = i.nextDouble();

        System.out.println("What is the name of the second item?");
        ni2 = i.next();
        System.out.println("How much did you buy?");
        qi2 = i.nextInt();
        System.out.println("How much did you pay for each one?");
        pi2 = i.nextDouble();
        
        System.out.println("What is the name of the third item?");
        ni3 = i.next();
        System.out.println("How much did you buy?");
        qi3 = i.nextInt();
        System.out.println("How much did you pay for each one?");
        pi3 = i.nextDouble();        
        
        ti1 = qi1 * pi1;
        ti2 = qi2 * pi2;
        ti3 = qi3 * pi3;
        stotal = ti1+ti2+ti3;
        gtotal = stotal * tax;
        

        System.out.println("BILL:");
		System.out.println("Item                          Quantity  Price     Total");
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n", ni1,qi1,pi1,ti1);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n", ni2,qi2,pi2,ti2);
		System.out.printf("%-30s%-10d%-10.2f%-10.2f%n", n13,qi3,pi3,ti3);
		System.out.printf("Subtotal%48.2f%n", stotal);
		System.out.printf("6.25%% sales tax%39.2f%n", tax);
		System.out.printf("Total%51.2f%n", gtotal);
    }
}

