import java.util.ArrayList;
import java.util.Scanner;
public class arraylistIpOp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
                   //taking Input in list
        for(int i=0;i<5;i++){
list.add(in.nextInt());
        }
        //            printing the list items
        //syntax :       list.get(index)
         //list[index] will not work
         
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));    
        }
    }
}
