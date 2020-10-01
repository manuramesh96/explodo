import java.io.*;
class mobile 
{
    
  int o=0;
  mobile1 aa=new mobile1();
  settings s1=new settings();
   public void main()throws InterruptedException, IOException
  {
       explodo qq=new explodo();
      qq.explodo();
      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     if(o==0)
     {
      System.out.println(" ---LISCENCE AGREEMENT---");
     System.out.println(" I hear by agree to all the terms and conditions of Explodo Corporation and will abide by all the Local Laws and Regulations! ");
     System.out.println(" ");
     System.out.println(" ");
     System.out.println(" ----------PHONE SPECIFICATIONS---------");
     System.out.println("");
     System.out.println(" RAM              -   1GB");
     System.out.println(" Processor        -   2.66GHz Intel i7.5");
     System.out.println(" Phone Memory     -   80GB");
     System.out.println(" External Memory  -   Expandable upto 32GB");
     System.out.println(" Network          -   HSPA");
     System.out.println(" 3G               -   Yes");
     System.out.println(" Battery          -   5000mAh");
     System.out.println(" Operating System -   Explodo OS 3.0");
     System.out.println("");
     System.out.println("");
     System.out.println("");
     System.out.println("Press Enter to continue---");
     String c=br.readLine();
     o++;
    }
     

      
      
      try
      {
      
      qq.wait_circle(9);
      
      qq.phone_start(s1.welcometext);
      
      aa.main();
      }
      catch(IOException i)
      {
          System.out.println("Error");
      }
  }
}
    
    
