public class variablearguments {
 //it means when we dont know the fixed no. of arguments we are 
 //passing to a method  
 public static void main(String[] args) {
    fun("dfgh","nvbn","werty");//here we passed 8 arguments
 }
 static void fun(String ...v){
     //static void fun(int ...v){  //this (int ...v)is taken 
                                   //as array v of integers
                     //(Sting ...v)will be array v of strings
                 //(char ...v)will be array v of characters
    for(int i=0;i<=2;i++){//2 is taken as random
        System.out.print(v[i]);
        System.out.print(" ");
    }
 }
}
  