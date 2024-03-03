import java.util.Scanner;
public class triangle {
    public static int a,b,c;
// Triangle Type Checker:
// Write a method called classifyTriangle that takes the lengths of three sides of a triangle as input and returns a string indicating the type of triangle (equilateral, isosceles, scalene) or if the inputs do not form a valid triangle.
public static void main(String[] args){
    System.out.println("Enter the three sides of the triangle");
classifyTriangle();
}
public static void classifyTriangle(){
@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
a=scan.nextInt();
System.out.println("Enter first length");
b=scan.nextInt();
System.out.println("Enter second length");
c=scan.nextInt();
System.out.println("Enter third length"); 

if(a==b && b==c)
{
    System.out.println("The triangle is equilateral");
}
else if(a==b && b!=c)
{
    System.out.println("the triangle is isoscles");
}
else if(a!=b && b!=c)
{
    System.out.println("the triangle is scalene");
}
else 
{
    System.out.println("invalid triangle");
}
}
}
