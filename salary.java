import java.util.*;
class salary 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        System.out.println("enter the grade");
        char grade=sc.next().charAt(0);
        int bonus=0;
        if(salary<10000)
        {
            bonus=(salary)*2/100;
        }
        if(grade=='a'||grade=='A')
        {
            bonus=bonus+((salary)*5/100);
        }
        else if(grade=='b'||grade=='B')
        {
            bonus=bonus+((salary)*10/100);
        }
        System.out.println("bonus to be given="+bonus);
        System.out.println("total salary to be given="+(salary+bonus));
    }
    
}
