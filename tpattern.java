import java.util.*;
class tpattern 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows:");
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print((n-i)+" ");
            }
            System.out.println();
        }
    }
    
}
