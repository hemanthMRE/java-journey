import java.util.Scanner;
public class taking
{
    
    public static void main(String args[])
    {
     System.out.println("enter the numbers");
     Scanner sc= new Scanner (System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
    int c = sc.nextInt();
    int sum = (a+b+c)/3;
    System.out.println("average is "+sum);
    }
        
}