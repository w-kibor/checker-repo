public class leapyearchecker {
    public static int a=2003;

    public static void main(String[] args){
    LeapYear();
    }
    public static void LeapYear(){
        if(a%4==0)
        {
            System.out.println("is a leap year");
        }
        else{
            System.out.println("is not a leap year");
        }
    }
}
