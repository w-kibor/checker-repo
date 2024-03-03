import java.util.Scanner;
public class gradingscale {
    public static int grade;
    
    public static void main(String[] args){
        
        System.out.println("Enter student's marks");
        
        calculateGrade();
            }
            public static void calculateGrade(){
                @SuppressWarnings("resource")
                Scanner in = new Scanner(System.in);
                grade= in.nextInt();
                if(grade>90)
                {
                  System.out.println("A");
                }
                else if (grade>80)
                {
                    System.out.println("B");
                }
                else if (grade>=70)
                {
                    System.out.println("C");
                }
                else if (grade>60)
                {
                    System.out.println("D");
                }
                else
                System.out.println("F");
            }
}
