import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        System.out.print("enter the no. to check :");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("the no. is "+ arm(num));
    }
    static boolean arm(int n){
        int numb=0;
        int temp=n;
        while (n>0) {
            int dig=n%10;
        int num=dig*dig*dig;
    numb = numb+ num;   
n=n/10;   }
if(temp==numb){return true;}
else{return false;}
    }
}
