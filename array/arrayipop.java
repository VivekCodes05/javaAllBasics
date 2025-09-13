import java.util.Scanner;

public class arrayipop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);   

        //array name[i]    is the general refernce vriable in heap memory
                        // exp: arr[2]  or   str[4]

       // int[] arr=new int[5];
// System.out.print("enter the array elements are : ");
//         for(int i=0;i<5;i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.print("the array elements are : ");
//          for (int i=0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//          }
//          System.out.println();//used for line beak
//          for (int i : arr) {//for every elemnt in array,orint the array
//             System.out.print(i+" ");//here i represents the elemnets of array
//          }

         //          STRING array
        //  String[] str=new String[5];
        //  for (int i = 0; i < str.length; i++) {
        //     str[i]=in.next();
        //  }
        //  for (String i : str) {
        //     System.out.print(i + " ");
            
        //  }

                       //         modification
    //      System.out.println();
    //      str[2]="vivek";    //here str[2] is the refernce variable in heap memory
    //                      //previously pointing towards some objects and now to vivek
    // for (String i : str) {
    //         System.out.print(i + " ");
            
    //      } 
        int[] nums={4,5,6,7,8};
                 System.out.println();
        change(nums);
     for (int i : nums) {
           System.out.print((i) + " ");}
                     //     modification usoing function 
                     

                        
    static void change (int[] arr){           
         arr[2]=78;
         }
}
   