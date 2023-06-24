import java.util.*;
class calculator{
    public int add(int num1,int num2)
    {
        int result;
        result = num1+num2;
        return result;
    }
}   


public class func{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        calculator calc=new calculator();
        int res;
        res=calc.add(a,b);
        System.out.println("The sum of the two numbers is :"+res);

    
    }
    
}
