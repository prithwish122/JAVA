import java.util.*;
public class cal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,diff,mul,div,a,b,choice;
        System.out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter 1.for sum /n 2.for substraction /n 3.for multiplication /n 4.for division");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            sum=a+b;
            System.out.println(sum);
            break;

            case 2:
            diff=a-b;
            System.out.println(diff);
            break;

            case 3:
            mul=a*b;
            System.out.println(mul);
            break;

            case 4:
            div=a/b;
            System.out.println(div);
            break;

            default:
            System.out.println("Invalid choice");

        }

    }
    
}
