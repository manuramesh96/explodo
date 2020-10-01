    
import java.io.*;
import java.util.*;
class settings
{
    static String welcometext="WELCOME       ";
    static String sim1="Vodaphone";
    
    
  void accept_welcome_text()throws IOException
  { 
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
      do {
             System.out.println("Enter the new welcome text:-");
              welcometext=br.readLine();
              
      if(welcometext.length()>12)
      {
          System.out.println("Maximum length of welcome text is 12!");
      }
    }while(welcometext.length()>12);
      
     System.out.println("Welcome Text Changed!");
  }
  
  String display_welcome_text()
  {
      return welcometext;
  }
      
  void Simcard1()throws IOException, InterruptedException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the name of new service provider of sim 1:-");
      sim1=br.readLine();
      
      
  }
   static String Sim1()throws IOException, InterruptedException
  {
      return sim1;
  }
 
  static void date()
  {
    Date s=new Date();
    System.out.println(s.getDate()+"-01-2012");
    }
  static void time()
    {
     Date s=new Date();
     System.out.println(s.getHours()+":"+s.getMinutes());
    }
   static  void p(String abc)
   {
       System.out.println(abc);
    }
 void main()throws IOException, InterruptedException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      p("Welcome to Settings\n(1)Change welcome text\n(2)Change Sim Card name\n(3)Go back to menu");
      System.out.println("Enter choice:-");
      
      int j,i=0;     
    do
    {j=0;
     try
     {
        
      i=Integer.parseInt(br.readLine());
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
    
      
      switch(i)
      {
          case 1:
           p("Enter the new Welcome text");
           welcometext=br.readLine();
           main();
           break;
           case 2:
           p("Enter the new Sim card Name");
           sim1=br.readLine();
           main();
           break;
           case 3:
           mobile1.main();
           break;
           default:
           main();
        }
      
      
      
      
    }
}