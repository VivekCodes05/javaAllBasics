public class basicarray {
    //syntax-
    //         datatype[] variable name = new datatype[size];
    //exp:-    int[] arr=new int[10];
    //also:-   int[] a ={4,5,6,7,8};

    //int[] student;   declaration of an array "student" in stack is defined
       //   student = new int[5];   itialisation of object or creating object in heap memory
       //new :- it is keyword to create an array object of specified size in heap memory 

       //declaration takes place at compile time
       //inialiation takes place at run time =>dynamic memory allocation
       public static void main(String[] args) {
        // int student[];
        // student =new int[5];
        // System.out.println(student[1]); //O/p :- 0
        String arr[]=new String[4];
        System.out.println(arr[0]);// O/p :- null
        //null is a literal or a value not a datatype
        //null can be assigned to any variable or can typecast also
        //but null is used for non primitives datatype variables only exp, string,array
        //non primitive means that can be broken down further
        //cant use for primitive exp, int ,char,boolean

        //primitives are stored in stack memory and all nons  are in heap memory as objects

        //null is the by defalt value of a non primitive refrence variable
        //value of a variable before initialisation is null
       }
}//each element of an array is an object itself separately stored in heap memory
//and each memory will pt. to the elements => they are reference variables
//=> array is just an collection of reference variablesn 
