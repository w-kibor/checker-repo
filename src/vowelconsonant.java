import java.util.Scanner;
public class vowelconsonant {
    public static char letter;
    public static boolean a,e,i,o,u;
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter letter");
        Scanner input=new Scanner(System.in);
        letter= input.next().charAt(letter);
        isVowel(letter);
    }
    ;
    public static boolean isVowel(char c) {
        switch (c) {
            case 'a':            
            case 'e':           
            case 'i':           
            case 'o':            
            case 'u':            
            case 'A':
            case 'E':            
            case 'I':           
            case 'O':            
            case 'U':
                System.out.println("true");
            default:
            System.out.println("false");
        }
        return a;
    }
    
    
}
