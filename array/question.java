import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       /*  int[] arr={2,6,9,1,5};
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.print("enter the indices to be swaped");
        int index1=in.nextInt();
         int index2=in.nextInt();
         System.out.println();
         swap(arr,index1,index2);
         for (int i : arr) {
            System.out.print(i+" ");
         }*/
                          //maximum element of array
// int[] arr={2,4,5,6,8,9 };
// int maximum=max(arr);
// System.out.println("the maxium elemnt is : ");
// System.out.println(maximum);

                        //reverse an array
                        int[] arr={2,3,4,5,67};
                        reverse(arr);
                        for (int k : arr) {
                            System.out.print(k+" ");
                        }
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static int max(int[] array){
        int max=0;
max=array[0];
for(int i=1;i<array.length;i++){
       if(max<array[i]){
     max=array[i];
    }
}return max;
}

    static void swap(int[] array,int indexa,int indexb){
        int temp=array[indexa];
        array[indexa]=array[indexb];
        array[indexb]=temp;
    }
}

