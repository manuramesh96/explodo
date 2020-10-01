import java.io.*;
class mobile1
{
static int o=0;
static String opt=" ";
static Messages j=new Messages();
static countdown_timer w=new countdown_timer();
static notes n=new notes();
static calculator calc=new calculator();
static handcricket l=new handcricket();
static xandos r=new xandos();
static settings s1=new settings();
static world_clock ck=new world_clock();
static contact c=new contact();
static call ring=new call();
static String default_mes_1="I hope you are enjoying our service!";
static String default_mes_2="Sachin scores another ton to give the Aussies a taste of defeat!";
static String default_mes_3="Your bill for this month is Rs.500. Kindly pay the bill on time,\n to avoid disconnection of service.";
static String default_mes_4="Thank you for paying the bill.";
static String default_mes_5="Hope you have enjoyed our project!";
static String sender_1 ="Service Provider";
static String sender_2 = "Anirudh.S.K and Manu.R";

    static void message()throws IOException, InterruptedException
   {
       explodo qq=new explodo();
       qq.wait_circle(1);
       
       j.main();
    }
    static void contact()throws IOException, InterruptedException
    {
        explodo qq=new explodo();
        qq.wait_circle(1);
       
        c.contact();
     }
    static void organizer()throws IOException, InterruptedException
    {
        explodo qq=new explodo();
        qq.wait_circle(1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int h; 
         do
         {
             h=0;
             System.out.println("------ORGANIZER-------\n(1)Countdown timer\n(2)Notes\n(3)Calculator\n(4)Go back to previous menu");
             System.out.println("Enter choice:-");
             int yy=0;
             do
             {
                 h=0;
                 try
             {
              yy=Integer.parseInt(br.readLine());
             }
             catch(Exception yyp)
             {
                 h++;
             }
            }while(h!=0);
        
             switch(yy)
             {
                 
                 case 1:
                 countdown_timer w=new countdown_timer();
                 w.main();
                 break;
                 
                 case 2:
                 n.main();
                 break;
                 
                 case 3:
                 calculator calc=new calculator();
                 calc.main();
                 break;
                 
                 case 4:
                 main();
                 break;
                 
                 default :
                 System.out.println("Please select from the options");
                 h++;
              }
         }while(h!=0);
                 
    }
    static void games_and_applications()throws IOException, InterruptedException
    {
      explodo qq=new explodo();
      qq.wait_circle(1);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
      int kkk=0;
       do
      {
      kkk=0;
      System.out.println("------GAMES AND APPLICATIONS------\n(1)HAND CRICKET\n(2)TIC TAC TOE\n(3)WORLD CLOCK\n(4)MAIN MENU");
      System.out.println("Enter choice:-");
      String j=br.readLine();
        if(j.equals("1"))
      {
         
         l.menu();
      }
        else if(j.equals("2"))
      {
         
         r.maingame();
       }
        else if(j.equals("3"))
      {
         ck.calculate();
       }
        else if(j.equals("4"))
      {
         main();
      } 
      else
      {
          System.out.println("Please enter the correct choice!");
          kkk++;
        }
    }while(kkk!=0);

   }
   
    static void setting()throws IOException, InterruptedException
     {
        explodo qq=new explodo();
        qq.wait_circle(1);
        s1.main();
     }
        
   static void main()throws IOException, InterruptedException
   {
       opt=" ";
       explodo qq=new explodo();
       qq.wait_circle(2);
       if(o<1)
       { 
           Messages.inbox[0][0]=sender_1;
           Messages.inbox[0][1]=default_mes_1;
        }
        
        for(int j=0;j<Messages.inbox.length;j++)
        {
         if(Messages.inbox[j][0].equals("0"))
         {
             switch(o)
             {
               case 1:
               Messages.inbox[j][0]=sender_1;
               Messages.inbox[j][1]=default_mes_2;
               break;
               
               case 2:
               Messages.inbox[j][0]=sender_1;
               Messages.inbox[j][1]=default_mes_3;
               break;
               
               case 3:
               Messages.inbox[j][0]=sender_1;
               Messages.inbox[j][1]=default_mes_4;
               break;
               
               case 4:
               Messages.inbox[j][0]=sender_2;
               Messages.inbox[j][1]=default_mes_5;
               break;
             }
             break;
         }
        }
        o++;
        settings s1=new settings();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
      
     int f,q;
      
        
      System.out.println("__________________________________________________________"+
      "________________________");
      System.out.print("SIM 1-| || ||| ||||\t\t\t\t\t\t");
      s1.date();
      System.out.print("SIM 1- "+s1.Sim1()+"\t\t\t\t\t\t");
      s1.time();
       do
       {
       
     locking jjj=new locking();
      jjj.locking();
      System.out.println("\t\t\t\tMAIN MENU\n\n(1)MENU\n(2)CALL\n(3)SWITCH OFF"); 
      System.out.println("Enter choice:-");
       
      opt=br.readLine();
       f=0;
       try
       {    
      
       if(opt.equals("1+*"))
      {
          System.out.println("KEYPAD LOCKED\nPRESS 1+* TO CONTINUE");
          String h=br.readLine();
          if(!(h.equals("1+*")))
          {
              System.out.println("PLEASE TYPE 1+* TO CONTINUE");
              h=br.readLine();
          while(h.equals("1+*"))
          {
               System.out.println("PLEASE TYPE 1+* TO CONTINUE");
              h=br.readLine();
            }
        }
        main();  
      }
      if(opt.equals("1"))
      {
           do
      {
       q=0;
       
       qq.wait_circle(1);
       System.out.println("MENU \n(1)MESSAGES\n(2)CONTACTS\n(3)CALL LOG\n(4)SETTINGS\n(5)ORGANIZER\n(6)GAMES AND APPLICATIONS\n(7)MAIN MENU");
       System.out.println("Enter choice:-");
       String h=br.readLine();
      
     
       try
       {
        if(h.equals("1"))
        {
            message();
        }
        else if(h.equals("2"))
       {
         contact();
       }
       else if(h.equals("3"))
       {
         ring.log();
       }
       else if(h.equals("4"))
       {
           setting();
        }
        else if(h.equals("5"))
        {
            organizer();
        }
       else if(h.equals("6"))
       {
         games_and_applications();
      }
      else if(h.equals("7"))
      {
          main();
      }
      else
      {
          throw new IOException();
       }
    }
       catch(IOException m)
       {
          System.out.println("Please select from the options given");
           q++;
        }
     }while(q!=0);
    }
      else if(opt.equals("2"))
      {
          
          
        ring.main();
        
      }
      else if(opt.equals("3"))
      {
        explodo xp=new explodo();
        xp.phone_start("Bye!!! Bye!!! ");
      }
      else if(opt.equals(""))
      {
          main();
      }
      else if(opt.equals(" "))
      {
          main();
      }
      else
      {
          throw new IOException();
      }
    }
    catch(IOException w)
    {   if(locking.o<1)
        {
          System.out.println("Please select from the options given");
        }
        else
        {
          System.out.println("Keypad UnLocked");  
        }
        f++;
    }
   }while(f!=0);
  }
 }