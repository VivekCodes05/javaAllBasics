import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("enter emp ID : ");
    int id=in.nextInt();
    System.out.println("enter branch : ");
    String br=in.next();
    switch(id){
        case 1:System.out.println("acha");break;
         case 2:System.out.println("thik h");break;
    case 3:switch (br) {
        case "IT":System.out.println("IT branch h teri");
            break;
    case "CS":System.out.println("abe CS mil gyi ");break;
        default:System.out.println("sahi se daal ");
            break;
    }
    default:System.out.println("ye koi id nhi h");
    }
}
    }
   
