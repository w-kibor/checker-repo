public class question2 {
    public static int a=10,b=35,c=22;
    public static void main(String[] args){
findlargest();
    }
    public static void findlargest(){
        if(a>b && a>c)
        {
          System.out.println(a);
        }
        else if (b>a && b>c)
        {
            System.out.println(b);
        }
        else
        System.out.println(c);
    }

}
