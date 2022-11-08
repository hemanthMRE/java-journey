import java.util.Scanner;
public class taking
{
    
    public static void main(String args[])
    {
     System.out.println("enter the side of square");
     Scanner sc = new Scanner(System.in);
     int side = sc.nextInt();
     int area_of_square = side*side;
     System.out.println(area_of_square);
    }
    }