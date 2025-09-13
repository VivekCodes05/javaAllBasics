public class scoping {
    // in blocking, the variable in main function cant
    // be accessed in user defined function(method)
    //and also the variable in method cant be accessed
    //in main function.
    //btw we already used this concept
                       
                     // type- BLOCK SCOPING
    public static void main(String[] args) {
    int a=34;
    int b=56;
String x="suar";
    {     
        int c=23457;//new variable  initialised in this block
                //will remain in this block i.e.,can only be used
                //in this block only

        x="hatt";
         a=90;//although already initialised variable like (a) can be 
         //reassigned or modify with new values
         //and this change will occur inside as wll as outside
         //the block
         System.out.println(a);
         System.out.println(x);       
    }
    //System.out.println(c);//cannot used outside that block
    System.out.println(a);
    System.out.println(x);

    // SCOPING IN FOR LOOP
    for(int i=0;i<4;i++){
        System.out.println(i);
int a=88;//no need to initialise 
    }
    System.out.println(i);//since i was initialised inthe 
                //block so cant use outside
}
}
