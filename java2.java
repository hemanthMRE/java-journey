import java.util.Scanner;
public class taking
{
    
    public static void main(String args[])
    {
     System.out.println("enter the price of pencil");
     Scanner sc = new Scanner(System.in);
     float p= sc.nextInt();
     System.out.println("enter the price of eraser");
      float e = sc.nextInt();
     System.out.println("enter the price of scale");
     float s = sc.nextInt();
     float sum = s+e+s;
     System.out.println("before gst"+sum);
     sum= sum+(0.18f*sum);
     System.out.println("after gst"+sum);
    }
}