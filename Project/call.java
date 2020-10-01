import java.io.*;
import java.util.*;
class call
{
   String[][]log=new String[100][5];
   String no="";
   String st="",et="",cd="";
   
   void p(String abc)
    {
        System.out.println(abc);
    }
    
   call()
   {
       for(int i=0;i<contact.contacts.length;i++)
    {
        log[i][0]="0";
        log[i][1]="0";
        log[i][2]="0";
        log[i][3]="0";
        log[i][4]="0";
    }
   }
void main()throws IOException,InterruptedException
   {System.out.println("\f");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
       int l1=0;
    do
       {
       p("---CALL---\n(1) Enter the number you want to call\n(2) Open contacts"); 
       
       int j;
    do
    {j=0;
     try
     {
        
     l1=Integer.parseInt(br.readLine());
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
       
       
       
        switch(l1)
        {
        case 1:
       
        int al;
          do
          {
          al=0;    
          try
          {
           p("-Enter the number you want to call-");
           no=br.readLine();
          if(no.length()!=8&no.length()!=10)
          {
              throw new Exception();
          }
          }
          catch( Exception iii)
          {
              System.out.println("Please enter an eight or ten digit number only");
           al++;
            }
          }while(al!=0);
        break;
      
        case 2:
          for(int i=0,k=1;i<contact.contacts.length;i++)
      {
        
        if(!(contact.contacts[i].equals("0")))
        {
            System.out.println(k+"."+contact.contacts[i]);
            k++;
        }
      }
      
       int l=0;
    do
    {j=0;
     try
     {
        
      l=Integer.parseInt(br.readLine());
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
      
      no=contact.contacts[l-1];
      
      break;
      
      default:
      p("\nPlease enter either 1 or 2!");
    } 
    }while(l1!=1&l1!=2);
     
    Date s=new Date();
    System.out.println(s.getHours()+":"+s.getMinutes()+":"+s.getSeconds());
    int time=s.getHours()*3600+s.getMinutes()*60+s.getSeconds();
    st=(Integer.toString(s.getHours())+":"+Integer.toString(s.getMinutes())+":"+Integer.toString(s.getSeconds()));
    System.out.println("Start speaking and press return when over!");
     System.out.print("Calling");
    for(int i=1;i<=5;i++)
    {   Thread.sleep(500);
        System.out.print(".");     
    }
    String j=br.readLine();
    Date s1=new Date();
    int aftertime=s1.getHours()*3600+s1.getMinutes()*60+s1.getSeconds();
    et=(Integer.toString(s1.getHours())+":"+Integer.toString(s1.getMinutes())+":"+Integer.toString(s1.getSeconds()));
    int callduration=aftertime-time;
    int hours=(int)callduration/3600;
    int min=(int)((int)callduration%3600)/60;
    int sec=(int)callduration%60;
    String Date=(Integer.toString(s.getDate())+"-"+s.getMonth()+"-"+"2012");
    cd=(Integer.toString(hours)+":"+Integer.toString(min)+":"+Integer.toString(sec));
    
    System.out.println(s.getHours()+":"+s.getMinutes()+":"+s.getSeconds());
    System.out.println(min+":"+sec);
     
    System.out.println("Call Ended");
        for(int i=0;i<log.length;i++)
    {
        
        if(log[i][0].equals("0"))
        {
            
            log[i][0]=no;
            log[i][1]=st;
            log[i][2]=et;
            log[i][3]=cd;
            log[i][4]=Date;
            break;
        }
    }
     
    mobile1.main();
    }
    
    
    void log()throws IOException, InterruptedException
    {System.out.println("\f");
        p("---DIALLED NUMBERS---");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
         for(int i=0;i<log.length;i++)
    {
        
        if(!(log[i][4].equals("0")))
        {  
            System.out.println(i+1);
            System.out.println("Name -\t"+log[i][0]);
            System.out.println("Starting time -\t"+log[i][1]);
            System.out.println("Ending time -\t"+log[i][2]);
            System.out.println("Call duration -\t"+log[i][3]);
            System.out.println("Call date -\t"+log[i][4]);
            System.out.println("-------------------------------------------------------------------------");            
        }
    }
     
    
    int l=0;
    do
       {
      System.out.println("---OPTIONS---\n(1) Clear call log history \n(2) Go back to Main Menu");
      
      int j;    
    do
    {j=0;
     try
     {
        
     l=Integer.parseInt(br.readLine());
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
     
        switch(l)
        {
        case 1:
           for(int i=0;i<contact.contacts.length;i++)
    {
        log[i][0]="0";
        log[i][1]="0";
        log[i][2]="0";
        log[i]
        [3]="0";
        log[i][4]="0";
    }
        break;
         
    default:
    p("Please enter either 1 or 2 only!");
          
    } 
    }while(l!=1&l!=2);
    mobile1.main();
    }
        
}
      
