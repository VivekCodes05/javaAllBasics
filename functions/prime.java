import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the no.");
         int n=in.nextInt();
System.out.println(prime(n));
    }
    static boolean prime(int num){
        int div =2;
        if(num==0 || num==1){
            return false;
        }
        while(div<num){
          if(num%div==0){
            return false;
          }
          else{div++;}
        }
         return true;
    }
}
