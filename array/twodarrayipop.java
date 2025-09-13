import java.util.Scanner;

public class twodarrayipop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length;col++) {
                arr[row][col]=in.nextInt();
            }
        }
//      System.out.println("the array is : ");
//             for (int row = 0; row < arr.length; row++) {
//             for (int col = 0; col < arr[row].length;col++){
//                 System.out.print(arr[row][col]+" ");
//             }System.out.println();
//     }

for (int[] i : arr) {
    System.out.println(Arrays.toString(i));  //this will print all 3 rows/arrays
}

 }
}