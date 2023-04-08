import java.util.*;
public class atm
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("............enter denominations.................");
        
        System.out.println("enter 1st denominations");
        int d1=sc.nextInt();
        System.out.println("enter no.of notes");
        int n1=sc.nextInt();

        System.out.println("enter 2nd denominations");
        int d2=sc.nextInt();
        System.out.println("enter no.of notes");
        int n2=sc.nextInt();

        System.out.println("enter 3rd denominations");
        int d3=sc.nextInt();
        System.out.println("enter no.of notes");
        int n3=sc.nextInt();

        System.out.println("enter 4th denominations");
        int d4=sc.nextInt();
        System.out.println("enter no.of notes");
        int n4=sc.nextInt();

        int total=n1*d1+n2*d2+n3*d3+n4*d4;
        System.out.println("total amount="+total);
    }   
}
