public class variablearguments2 {
    public static void main(String[] args) {
        multiple(2,3,"india","is","best");
    }
    static void multiple(int a,int b,String ...v){
        //variable arguments can only be used in the end of
        //all method arguments
        //here string ..v used in end after a and b
        System.out.println(a);
        System.out.println(b);
        for( int i=0;i<=2;i++){
            System.out.print(v[i]);
            System.out.print(" ");
        }
    }
    
}
