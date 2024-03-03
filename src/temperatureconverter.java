import java.util.Scanner;
public class temperatureconverter {
    ;
    public static double temp, fahrenheit;
@SuppressWarnings("resource")
public static void main(String[] args){
    System.out.println("Enter temperature in celcius");
    Scanner input=new Scanner(System.in);
    temp= input.nextDouble();
    convertTemperature();
}
public static void convertTemperature()
{
   //change celcius to fahrenheit
   //degrees to farenheit is (celcius*1.8)+32
System.out.println(fahrenheit=(temp*1.8)+32);

}
}
