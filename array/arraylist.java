import java.util.ArrayList;    //arraylist class is to be added
public class arraylist {
    //syntax:-
    public static void main(String[] args) { //arraylist is used when we dont know the length of the array
                 //with the help of array list we can insert as many elements we want

                 /*when the array list is half filled the it create new arraylist and copy previous elements
                  * and delete old list
                  */
        
        ArrayList<Integer> list=new ArrayList<>();/*a new object is created of type arraylist and "list"
                                                            //is the reference variable pointing to this object*/

        list.add(56);
         list.add(3456);
        list.add(5676);
         list.add(6856);list.add(994756);
         list.add(57836);list.add(23356);
         list.add(67856);
System.out.println(list.size());
System.out.println(list.contains(5676));  //check if 5676 is there or not
System.out.println(list.set(0,99));
System.out.println(list.remove(3));
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
        // list.add(56);
System.out.println(list);
    }
}
