public class shadowing2 {
    //scope of local variable (variable used in main) begin 
    //when it is inilised.  x=20 means initialisation 
    //int x means declaration
    static int x=70;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        System.out.println(x);//error: variable x might not have been initialized
                              //System.out.println(x);
                                              //   ^
                              //1 error
        x=40;//local variable got initialised
        System.out.println(x);
        
                              fun();
    }
    static void fun(){
        System.out.println(x);
    }
}

