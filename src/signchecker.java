import java.util.Scanner;

public class signchecker {
    public static int number;
@SuppressWarnings("resource")
public static void main(String[] args) {
   System.out.println("Enter Number");
    Scanner input=new Scanner(System.in);
    number= input.nextInt();
    checkSign();
}
public static void checkSign(){
    if(number==0)
    {
System.out.println("Zero");
    }
    else if(number<0)
    {
        System.out.println("Negative");
    }
    else
    System.out.println("positive");
}
}
