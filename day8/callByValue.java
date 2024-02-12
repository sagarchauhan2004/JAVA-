package day8;

public class callByValue 
{
    void fun(int x)
    {
        System.out.println("value of x : " + x);
    }
    public static void main(String[] args) 
    {
        int num = 5 ; 
        callByValue obj = new callByValue();
        obj.fun(num);
        
    }
}
