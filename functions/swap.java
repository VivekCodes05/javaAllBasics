public class swap {
    public static void main(String[] args) {
        int x=20;
        int y=30;
       //swap(x,y); 
       String name="kunal";
       change(name);
       System.out.println(name);
    }  // in java value is pased in functions 
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("vaues after sapping are "+a+" and" + b );
    }
    static void change( String naam){
     naam="dfghj";
    }
}//          name will still equal to kunal
//      naam will become kunal through function definition
//   and then naam equal to dfghj   
// name not become dfghj  