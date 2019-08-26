import java.util.Scanner;

public class ClassAssignCircle
{
    public static void main(String[] args)
    {
     Scanner Input=new Scanner(System.in);
     double rad,circ,area;

     System.out.println("Please enter the radius of the circle.");
     rad=Input.next();

     area=(3.14*rad*rad);
     circ=(2*3.14*rad);

     System.out.println("Area is" + area);
     System.out.println("Circumfrence is:" + circ);


    } 