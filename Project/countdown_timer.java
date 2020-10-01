import java.io.*;
class countdown_timer
{
  void main()throws IOException,InterruptedException
  {
      
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("WELCOME TO COUNT DOWN TIME ");
     
      System.out.print("\n Enter the number of hours-");
             int j,hour=0,min=0,sec=0;     
    do
    {j=0;
     try
     {
        
      hour=Integer.parseInt(br.readLine());
    }
     catch(Exception c2)
     {
         System.out.println("Please enter the time properly!.");
         j++;
        }
    }while(j!=0);

      
      
      System.out.print("\n Enter the number of minutes-");
          do
    {j=0;
     try
     {
        
      min=Integer.parseInt(br.readLine());
    }
     catch(Exception c2)
     {
         System.out.println("Please enter the time properly!.");
         j++;
        }
    }while(j!=0);
      
      System.out.print("\n Enter the number of seconds-");
      
         do
    {j=0;
     try
     {
        
      sec=Integer.parseInt(br.readLine());
    }
     catch(Exception c2)
     {
         System.out.println("Please enter the time properly!.");
         j++;
        }
    }while(j!=0);
      
      int r=0;
      System.out.println("\n Press enter to start!");
      String p=br.readLine();
      try
      {
      for(int h=hour,m=min,s=sec;!(h==0 & m==0 & s==0) ;s--)
      {
          if(m!=0 && s==0)
          {
           s=59;
           m--;
            }
            
          if(h!=0 && m==0)
          {
           m=59;
           h--;
          }
          
          r=s%4;
          
          switch(r)
          {
              case 3:
              System.out.println("    __________");
              System.out.println("  //          \\\\");
              System.out.println(" ||     |     ||");
              System.out.println(" ||     |     ||");
              System.out.println(" ||     o     ||");
              System.out.println(" ||           ||");
              System.out.println(" ||           ||");
              System.out.println("  \\\\__________//");
              break;
              case 2:
              
              System.out.println("    __________");
              System.out.println("  //          \\\\");
              System.out.println(" ||           ||");
              System.out.println(" ||           ||");
              System.out.println(" ||     o---  ||");
              System.out.println(" ||           ||");
              System.out.println(" ||           ||");
              System.out.println("  \\\\__________//");
              break;
              case 1:
              
              System.out.println("    __________");
              System.out.println("  //          \\\\");
              System.out.println(" ||           ||");
              System.out.println(" ||           ||");
              System.out.println(" ||     o     ||");
              System.out.println(" ||     |     ||");
              System.out.println(" ||     |     ||");
              System.out.println("  \\\\__________//");
              break;
              case 0:
              
              System.out.println("    __________");
              System.out.println("  //          \\\\");
              System.out.println(" ||           ||");
              System.out.println(" ||           ||");
              System.out.println(" ||  ---o     ||");
              System.out.println(" ||           ||");
              System.out.println(" ||           ||");
              System.out.println("  \\\\__________//");
              break;
            }
            
            System.out.println(h+":"+m+":"+s);
            
              Thread.sleep(1000);
              System.out.print("\u000c");
              
              
            }
        
        }
      
    
    catch(InterruptedException e)
    {}
        System.out.println("TIME UP!");
        
        System.out.println("\nDo you want to use the timer again?");
        if(br.readLine().equalsIgnoreCase("yes"))
        {
            main();
        }
        else
       {
            mobile1.organizer();
        }
    }
    }

          
          
            
            
      
      
      
    