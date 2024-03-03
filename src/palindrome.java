import java.util.Scanner;
public class palindrome {
    public static int number;
    @SuppressWarnings("resource")
    public static void main(String[] args){
        System.out.println("Enter Number");
        Scanner input=new Scanner(System.in);
        number= input.nextInt();
    isPalindrome();
    }
public static void isPalindrome(){
    int num2=number;
    int rev=0;
    while(number!=0){
        rev=rev*10+number%10;
        number=number/10;
    }
   System.out.println(rev); 
   if(num2==rev)
   {
System.out.println("palindrome number");
   }
   else
   {
    System.out.println("not a palindrome number");
   }
}
}
