import java.util.*;
class mton
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m:");
        int m=sc.nextInt();
        System.out.println("enter n :");
        int n=sc.nextInt();
        System.out.println();
        for(int i=m;i<=n;i++)
        {
            System.out.println(i);
            i=i+7;
        }
    }
}