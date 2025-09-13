import java.util.Scanner;
public class checklowerorupper {
 public static void main(String[] args) {
// String ch="hello";
//     System.out.println(ch.charAt(3));
System.out.print("enter the text: ");
Scanner in=new Scanner(System.in);
char ch=in.next().trim().charAt(0);

if(ch>='a' && ch<='z'){
    System.out.println("lower case");
}
else{System.out.println("upper case");}

 }   
}
