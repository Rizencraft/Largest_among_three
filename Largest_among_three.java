import java.util.Scanner;

public class Largest_among_three {
    public static void main(String[] args){
        int a,b,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is largest");
        }
        else
            if(b>a && b>c)
            {
                System.out.println("B is largest");
            }
            else
                if(c>a && c>b)
                {
                    System.out.println("C is largest");
                }

    }
}
