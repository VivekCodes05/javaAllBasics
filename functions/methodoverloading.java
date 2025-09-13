public class methodoverloading {
    //method overloading means when more than 1 same name methods are
    //used in program
     
    //rules to decide which one to call are:-
    //either every same name method have different data typ arguments
    //or have diff no. of argments

    //if no. of arguments are equal then arguments dat type must be different
    //and vice-versa
    public static void main(String[] args) {
        fun(67);
        //fun("ajeet");  //comment out this one then try
                         //comment in fun(67)
    }
    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
