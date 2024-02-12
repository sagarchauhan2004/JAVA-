public class fun_overload 
{
    // function overloading :  when within one class we have name.
    // of more than one function ,  but all must have different passing arguments
    void fun(int x)
    {
        System.out.println("hello : " + x);
    }
    void fun(double x)
    {
       System.out.println("hiii ");
    } 

   public static void main(String[] args) 
   {
       fun_overload obj = new fun_overload();
       obj.fun(60);
       obj.fun(3.5);
   }    
 }
