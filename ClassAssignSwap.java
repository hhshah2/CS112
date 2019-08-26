import java.util.Scanner;

public class ClassAssignSwap
{
    public static void main(String[] args)
    {
     Scanner Input=new Scanner(System.in);
     float num1,num2,temp;
     

     System.out.println("Please enter the first number");
     num1=Input.nextFloat();
     System.out.println("Please enter the second number");
     num2=Input.nextFloat();

     System.out.println("Original Number one is:" + num1);
     System.out.println("Original Number two is:" + num2);

     temp=num1;
     num1=num2;
     num2=temp;

     System.out.println("Swapped Number one is:" + num1);
     System.out.println("Swapped Number two is:" + num2);

    }
}