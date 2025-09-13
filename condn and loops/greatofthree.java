import java.util.Scanner;
public class greatofthree {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
    //  int max=num1;
    //     if(num2>=max){
    //         max=num2;
    //     }
    //     if (num3>=max){
    //         max=num3;
    //     }
    //     System.out.println(max + " "+ "is the greatest of three");
    //           SECOND METHOD
    // int max=0;
    // if(a>b){
    //     max=a;
    // }else{max=b;}
    // if(c>max){max=c;}
    // System.out.println("the greatest is  " + max);
    //                                   THIRD METHOD USING MATH FUNCTION
    // syntax of math func is for two values a and b :   int c= Math.max(a,b);
    // this return the maximum value between a and b.so c will have the max value
    int maximum=Math.max(a,Math.max(b,c));
    System.out.println(maximum + "  is the greatest of three");
    }}
