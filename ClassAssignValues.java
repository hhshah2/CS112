import java.util.Scanner;

public class ClassAssignValues
{
    public static void main(String[] args)
    {
        Scanner Input=new Scanner(System.in);
        float num1, num2;

        System.out.println("Please enter number one.");
        num1=Input.nextFloat();

        System.out.println("Please enter number two");
        num2=Input.nextFloat();

        double sum,dif,pro,quo,rem;

        sum=(num1 + num2);
        dif=(num1 - num2);
        pro=(num1 * num2);
        quo=(num1 / num2);
        rem=(num1 % num2);

        System.out.println("Sum:" + sum);
        System.out.println("Difference:" + dif);
        System.out.println("Product:" + pro);
        System.out.println("Quotient" + quo);
        System.out.println("Remainder" + rem);

    }
}