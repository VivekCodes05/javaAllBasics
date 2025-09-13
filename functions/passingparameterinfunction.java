import java.util.Scanner;
public class passingparameterinfunction {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.print("enter the value of a and b :");
        // int a=in.nextInt();
        // int b=in.nextInt();
        // int sum=sum(a,b);
        // System.out.print("the sum is : ");
        // System.out.println(sum); 
        System.out.print("bta kisko bulwana h :");    
        String kon=in.next();
        String message = name(kon);
        System.out.println(message);

    }
   static int sum(int a,int b){
    int sum=a+b;
    return sum;
   }
   static String name(String naam){
    return "hello "+naam;
   }
}
