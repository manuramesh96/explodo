import java.io.*;
class locking extends Thread
{
static int o=0;
  void locking()
  {
      super.start();
  }
  public void run()
  {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
       try
      {
       o=0;   
       Thread.sleep(10000);
       o++;
       
       if(mobile1.opt.equals(" "))
       {
           if(!(mobile1.opt.equals(" ")))
           {
               throw new InterruptedException();
           }
        
        
            
         System.out.println("KEYPAD LOCKED!!\nPRESS ENTER TO CONTINUE");
         
       }
      }
      catch(Exception vv)
      {
        System.out.println("KEYPAD UNLOCKED");
      }
    }
}
       
  