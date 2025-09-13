public class shadowing {
    static int x=70;
    public static void main(String[] args) {
        System.out.println(x);//70 bcz till here x=20 not initialised
                   // this line is in scope of static x=70
        int x;
        System.out.println(x);//20   bcz the class variable(means variable bfr main function) 
                 //at line 2 is shadowed by x=20;
        fun();
    }
    static void fun(){
        System.out.println(x);//70 bcz here,main function has 
                //no scope => cant fetch x=20;
                //but it is in scope of classvariable static x=70=>print 70
    }//and also shadowing is not there in methods
}

