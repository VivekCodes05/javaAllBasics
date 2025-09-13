import java.util.Scanner;
public class returnastring {
   public static void main(String[] args) {
    // int SUM=sum();
    // System.out.print("the sum is : ");
    // System.out.println(SUM);
    for(int i=0;i<3;i++){
    String msg=hello();
    System.out.print("message is :");
    System.out.println(msg);
   } }
// static int "function name" means returning type will
//be a integer. 
// static string "function name" means returning type will
//be a string. 
   static int sum() {
Scanner in=new Scanner(System.in);
    System.out.print("enter a no 1 :");
    int num1=in.nextInt();
    System.out.print("enter a no 2 :");
    int num2=in.nextInt();
return num1+num2;
//   System.out.println("nothing will be exexuted after return");
   }
            // other function using loop
   static String hello(){
    return "ram ram laddar";
   }
}
