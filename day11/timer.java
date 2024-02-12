package day11;

 class time
{
    
    {
         int hr , min ; 
         {
            hr = h;  
             min = m;

         }
         void show()
         {
            System.out.println(hr + " : " + min);

         }

    }
    public class timer
    {
        public static void main (String [] args)
        {
            timer obj1 = new time();
            time obj2 = new time();
            time obj3 = new time();
            obj1.fun(4 , 50);
            obj2.fun( 5 , 45);
            
            obj1.show();
            obj2.show();

            obj3.hr = obj.hr + obj.hr;

        }
    }
}
