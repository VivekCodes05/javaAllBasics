import java.util.Scanner;

public class WeekdayandWeekend {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
System.out.println("enter the day serial no. : ");
  int day=in.nextInt();
  switch (day) {
    case 1:
    case 2:case 3:case 4:case 5:System.out.println("weekday");break;
  case 6: case 7: System.out.println("weekend");
  break;

  }
    }
}
