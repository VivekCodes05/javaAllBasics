//            COUNTING THE OCCURING OF A DIGIT IN A NUMBER
        //                          System.out.println(45678%10);will be 8
       //                           System.out.println(56788/10);will be 5678
       import java.util.Scanner;
       public class digitoccurence{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
         System.out.print("enter the no. : ");
        int num=in.nextInt();
        // System.out.print("enter the digit : ");
        // int dig=in.nextInt();
        // int count=0;
        //   while(num>0){
        //     int temp=num%10;
        //     if(temp==dig){
        //         count++;
        //     }
        //     num=num/10;
        //   }
        //   System.out.println(dig +" occurs " + count +" times");
        //                                REVERSE THE NUMBER
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        System.out.print("the reverse is "+ rev);
        }
    }