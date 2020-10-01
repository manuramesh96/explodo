import java.io.*;
class handcricket
{
  void instructions()throws IOException, InterruptedException
  {
     InputStreamReader x=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(x);
      System.out.println("play cricket\nreturn to main menu?");
      String s=br.readLine();
      if(s.equals("yes"))
      {
          menu();
      }
  }
  void exit()throws IOException, InterruptedException
  {
      e();
  }    
  void play()throws IOException, InterruptedException
  {
      InputStreamReader x=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(x);
      System.out.println("Enter team name");
      String team_name=br.readLine();
      String result="";
      int[]score_player_user=new int[7];
      int[]score_player_comp=new int[7];
      System.out.println("Enter the name of the players according to batting order:-");
      String[]players_user=new String[7];
      for(int i=0;i<players_user.length;i++)
      {
          players_user[i]=br.readLine();
      }
      String[]players_comp={"alpha_1","alpha_2","alpha_3","alpha_4","alpha_5","alpha_6","alpha_7"};   
      int j;
      String toss="";
      do
      {
          j=0;
          try
          {
            System.out.println("Heads or tails");
             toss=br.readLine();
            if(!(toss.equalsIgnoreCase("heads"))&&!(toss.equalsIgnoreCase("tails")))
            {
                throw new IOException();
            }
          }
          catch(IOException qqq)
          {
              System.out.println("Please type heads or tails");
              j++;
          }
      }while(j!=0);
      toss=toss.toLowerCase();
      double t=Math.random()*(1-2)+2;
      int h=(int)Math.round(t);
      String hh="";
      if(h==1)
      {
        hh="heads";
      }
      else
      {
        hh="tails";
      }
      if(toss.equals(hh))
      {
          System.out.println("You have won the toss\nBat or field");
          int oo;
          String d="";
          do
          {
              oo=0;
              try
              {
                d=br.readLine();
               if(!(d.equalsIgnoreCase("bat"))&&!(d.equalsIgnoreCase("field")))
               {
                   throw new IOException();
               }
              }
              catch(IOException nnn)
              {
                  System.out.println("Please enter only bat of field");
                  oo++;
               }
          }while(oo!=0);
          d=d.toLowerCase();
          int i=0,u=0;
          if(d.equals("bat"))
          {  int out=0;
            do
            {
             int rand=99;
             int ur=100;
             int s1=0;
             while(rand!=ur)
             {  int yyy;
                do
                {
                    yyy=0;
                    try
                    {
                        System.out.println("enter the number ");
                        
                        
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                            
                        }
                    }
                    catch(Exception nnnn )
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yyy++;
                    }
                    
                }while(yyy!=0);
               
                
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                System.out.println("Computer's number="+rand);
                if(ur==rand)
                {
                    
                    System.out.println(players_user[i]+" is out\n Score="+s1);
                    score_player_user[u]=s1;
                    out++;
                    break;
                }
                s1=s1+ur;
                System.out.println("Score="+s1);
             }
             i++;
             u++;
            }while(out<7);
            int final_score_user=(score_player_user[0]+score_player_user[1]+score_player_user[2]+score_player_user[3]+score_player_user[4]+
           score_player_user[5]+score_player_user[6]);
            System.out.println("NAME            SCORE\n"+players_user[0]+"              "+score_player_user[0]+"\n"+
            players_user[1]+"              "+score_player_user[1]+"\n"+players_user[2]+"              "+score_player_user[2]+"\n"+
            players_user[3]+"              "+score_player_user[3]+"\n"+players_user[4]+"              "+score_player_user[4]+"\n"+
            players_user[5]+"              "+score_player_user[5]+"\n"+players_user[6]+"              "+score_player_user[6]+"\n"+
           "TOTAL:-       "+final_score_user);
                            
            System.out.println("Now you are fielding");
            out=0;
            int final_score_comp=0;
            int l=0,da=0;
            do
            {
            int ur=0,rand=1;
            int s2=0;
            while(rand!=ur)
            {
                 int yy;
                do
                {
                    yy=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yy++;
                    }
                }while(yy!=0);
                
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                System.out.println("computer's number="+rand);
                
                if(rand==ur)
                {
                        System.out.println(players_comp[l]+"is out-"+s2);
                        score_player_comp[da]=s2;
                        out++;
                        break;
                }
               
                s2=s2+rand;
                System.out.println("Computer's score="+s2);
            
          }
          
          final_score_comp=final_score_comp+s2;
                  if(final_score_comp<final_score_user&&out==7)
                {
                    result=team_name+" has won the match";
                    System.out.println(team_name+" has won the match");
                    Thread.sleep(2000);
                    break;
                }
                    if(final_score_comp==final_score_user)
                    {
                        result="Match drawn";
                        System.out.println("Match drawn");
                        Thread.sleep(2000);
                        break;
                    }
                if(final_score_comp>final_score_user)
                {
                    result="Computer has won the match";
                    System.out.println("Computer has won the match");
                    Thread.sleep(2000);
                    break;
                }
                 l++;
                da++;
         }while(out<7);
         System.out.println("NAME                SCORE\n"+players_comp[0]+"              "+score_player_comp[0]+"\n"+
            players_comp[1]+"              "+score_player_comp[1]+"\n"+players_comp[2]+"              "+score_player_comp[2]+"\n"+
            players_comp[3]+"              "+score_player_comp[3]+"\n"+players_comp[4]+"              "+score_player_comp[4]+"\n"+
            players_comp[5]+"              "+score_player_comp[5]+"\n"+players_comp[6]+"              "+score_player_comp[6]+"\n"+
           "TOTAL:-       "+final_score_comp+"\nRESULT-"+result);
           Thread.sleep(6000);
           menu();
        }
        else if(d.equals("field"))
        {
            System.out.println("Now you are fielding");
            int out=0;
            int final_score_comp=0;
            int l=0,da=0;
            int final_score_user=0;
            do
            {
            int ur=0,rand=1;
            int s2=0;
            while(rand!=ur)
            {
                int yyyy;
                do
                {
                    yyyy=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yyyy++;
                    }
                }while(yyyy!=0);
                
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                
                System.out.println("Computer's number="+rand);
                if(rand==ur)
                {
                    int s3=s2+1;
                    System.out.println(players_comp[l]+" is out! -"+s3);
                    score_player_comp[da]=s2;
                        out++;
                        break;
                }
                s2=s2+rand;
                System.out.println("Computer's score="+s2);
               }
            
                 final_score_comp=final_score_comp+s2;
                 
               
                 l++;
                da++;
         }while(out<7);
            System.out.println("NAME            SCORE\n"+players_comp[0]+"              "+score_player_comp[0]+"\n"+
            players_comp[1]+"              "+score_player_comp[1]+"\n"+players_comp[2]+"              "+score_player_comp[2]+"\n"+
            players_comp[3]+"              "+score_player_comp[3]+"\n"+players_comp[4]+"              "+score_player_comp[4]+"\n"+
            players_comp[5]+"              "+score_player_comp[5]+"\n"+players_comp[6]+"              "+score_player_comp[6]+"\n"+
           "TOTAL:-       "+final_score_comp);
            Thread.sleep(5000);
            System.out.println("Now you are batting");
             i=0;
             u=0;
              out=0;
              result="";
            do
            {
           int  ur=0,rand=1;
            int s1=0;
            
            while(rand!=ur)
             {
                int yo;
                do
                {
                    yo=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yo++;
                    }
                }while(yo!=0);
               
               
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                System.out.println("Computer's number="+rand);
                
                if(ur==rand)
                {
                    System.out.println(players_user[i]+" are out. Score= "+s1);
                    score_player_user[u]=s1;
                    out++;
                    break;
                }
                
                 s1=s1+ur;
                System.out.println("Score="+s1);
            
           }
           final_score_comp=final_score_comp+s1;
           if(final_score_comp<final_score_user&&out==7)
                {
                    result=team_name+" has won the match";
                    System.out.println(team_name+" has won the match");
                    Thread.sleep(3000);
                    break;
                }
           if(final_score_comp==final_score_user)
            {
               result="Match drawn";
              System.out.println("Match drawn");
              Thread.sleep(3000);
                   break;
            }
            if(final_score_comp>final_score_user)
             {
                 result="Computer has won the match";
                 System.out.println("Computer has won the match");
                 Thread.sleep(3000);
                    break;
            }
          }while(out<7);
           System.out.println("NAME            SCORE\n"+players_user[0]+"              "+score_player_user[0]+"\n"+
            players_user[1]+"              "+score_player_user[1]+"\n"+players_user[2]+"              "+score_player_user[2]+"\n"+
            players_user[3]+"              "+score_player_user[3]+"\n"+players_user[4]+"              "+score_player_user[4]+"\n"+
            players_user[5]+"              "+score_player_user[5]+"\n"+players_user[6]+"              "+score_player_user[6]+"\n"+
           "TOTAL:-       "+final_score_user+"\nRESULT - "+result);
           Thread.sleep(5000);
           menu();
         }
        else
        {
       double rr=Math.random()*(1-2)+2;
       int k=(int)Math.round(rr);
       String dec="";
       if(k==1)
       {
           dec="Bat";
       }
       else if(k==2)
       {
           dec="field";
       }
       System.out.println("you have lost the toss.");
       if(dec.equals("Bat"))
       {
           System.out.println("the computer has chosen to bat first");
           System.out.println("Now you are fielding");
           int out=0;
            int final_score_comp=0;
            int l=0,da=0;
            int final_score_user=0;
            do
            {
            int ur=0,rand=1;
            int s2=0;
            while(rand!=ur)
            {
                int yyo;
                do
                {
                    yyo=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yyo++;
                    }
                }while(yyo!=0);
                
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                
                System.out.println("Computer's number="+rand);
                if(rand==ur)
                {
                    int s3=s2+1;
                    System.out.println(players_comp[l]+" is out! -"+s3);
                    score_player_comp[da]=s2;
                        out++;
                        break;
                }
                s2=s2+rand;
                System.out.println("Computer's score="+s2);
               }
            
                 final_score_comp=final_score_comp+s2;
                 
               
                 l++;
                da++;
         }while(out<7);
            System.out.println("NAME            SCORE\n"+players_comp[0]+"              "+score_player_comp[0]+"\n"+
            players_comp[1]+"              "+score_player_comp[1]+"\n"+players_comp[2]+"              "+score_player_comp[2]+"\n"+
            players_comp[3]+"              "+score_player_comp[3]+"\n"+players_comp[4]+"              "+score_player_comp[4]+"\n"+
            players_comp[5]+"              "+score_player_comp[5]+"\n"+players_comp[6]+"              "+score_player_comp[6]+"\n"+
           "TOTAL:-       "+final_score_comp);
           Thread.sleep(5000);
            
            System.out.println("Now you are batting");
             i=0;
             u=0;
             out=0;
            result="";
            do
            {
            int ur=0,rand=1;
            int s1=0;
            
            while(rand!=ur)
             {
                int yyoq;
                do
                {
                    yyoq=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yyoq++;
                    }
                }while(yyoq!=0);
               
               
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                System.out.println("Computer's number="+rand);
                
                if(ur==rand)
                {
                    System.out.println(players_user[i]+" are out. Score= "+s1);
                    score_player_user[u]=s1;
                    out++;
                    break;
                }
                
                 s1=s1+ur;
                System.out.println("Score="+s1);
            
           }
           final_score_comp=final_score_comp+s1;
           if(final_score_comp<final_score_user&&out==7)
                {
                    result=team_name+" has won the match";
                    System.out.println(team_name+" has won the match");
                    Thread.sleep(2000);
                    break;
                }
           if(final_score_comp==final_score_user)
            {
               result="Match drawn";
              System.out.println("Match drawn");
              Thread.sleep(2000);
                   break;
            }
            if(final_score_comp>final_score_user)
             {
                 result="Computer has won the match";
                 System.out.println("Computer has won the match");
                 Thread.sleep(2000);
                    break;
            }
          }while(out<7);
           System.out.println("NAME            SCORE\n"+players_user[0]+"              "+score_player_user[0]+"\n"+
            players_user[1]+"              "+score_player_user[1]+"\n"+players_user[2]+"              "+score_player_user[2]+"\n"+
            players_user[3]+"              "+score_player_user[3]+"\n"+players_user[4]+"              "+score_player_user[4]+"\n"+
            players_user[5]+"              "+score_player_user[5]+"\n"+players_user[6]+"              "+score_player_user[6]+"\n"+
           "TOTAL:-       "+final_score_user+"\nRESULT - "+result);
           Thread.sleep(5000);
           menu();
           }
         else
         {
             System.out.println("The computer has decided to field first\n you are batting first.");
             int out=0;
              i=0;
              u=0;
             do
             {
             int rand=99;
             int ur=100;
             int s1=0;
              while(rand!=ur)
              {
            int yy;
                do
                {
                    yy=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yy++;
                    }
                }while(yy!=0);
               
                
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                System.out.println("Computer's number="+rand);
                if(ur==rand)
                {
                    
                    System.out.println(players_user[i]+" is out\n Score="+s1);
                    score_player_user[u]=s1;
                    out++;
                    break;
                }
                s1=s1+ur;
                System.out.println("Score="+s1);
             }
             i++;
             u++;
            }while(out<7);
            int final_score_user=(score_player_user[0]+score_player_user[1]+score_player_user[2]+score_player_user[3]+score_player_user[4]+
           score_player_user[5]+score_player_user[6]);
            System.out.println("NAME            SCORE\n"+players_user[0]+"              "+score_player_user[0]+"\n"+
            players_user[1]+"              "+score_player_user[1]+"\n"+players_user[2]+"              "+score_player_user[2]+"\n"+
            players_user[3]+"              "+score_player_user[3]+"\n"+players_user[4]+"              "+score_player_user[4]+"\n"+
            players_user[5]+"              "+score_player_user[5]+"\n"+players_user[6]+"              "+score_player_user[6]+"\n"+
           "TOTAL:-       "+final_score_user);
                            Thread.sleep(2000);
            System.out.println("Now you are fielding");
            out=0;
            int final_score_comp=0;
            int l=0,da=0;
            do
            {
            int ur=0,rand=1;
            int s2=0;
            while(rand!=ur)
            {
                int yyw;
                do
                {
                    yyw=0;
                    try
                    {
                        System.out.println("enter the number ");
                        ur=Integer.parseInt(br.readLine());
                        if(ur>10||ur<1)
                        {
                            throw new Exception();
                        }
                    }
                    catch(Exception nnnn)
                    {
                         System.out.println("Please enter a number between 1 and 10");
                         yyw++;
                    }
                }while(yyw!=0);
                
                double ttt=(Math.random()*(1-5)+5)+(Math.random()*(1-5)+5);
                rand=(int)Math.round(ttt);
                System.out.println("computer's number="+rand);
                
                if(rand==ur)
                {
                        System.out.println(players_comp[l]+"is out-"+s2);
                        score_player_comp[da]=s2;
                        out++;
                        break;
                }
               
                s2=s2+rand;
                System.out.println("Computer's score="+s2);
            
          }
          
          final_score_comp=final_score_comp+s2;
                  if(final_score_comp<final_score_user&&out==7)
                {
                    result=team_name+" has won the match";
                    System.out.println(team_name+" has won the match");
                    Thread.sleep(2000);
                    break;
                }
                    if(final_score_comp==final_score_user)
                    {
                        result="Match drawn";
                        System.out.println("Match drawn");
                        Thread.sleep(2000);
                        break;
                    }
                if(final_score_comp>final_score_user)
                {
                    result="Computer has won the match";
                    System.out.println("Computer has won the match");
                    Thread.sleep(2000);
                    break;
                }
                 l++;
                da++;
         }while(out<7);
         System.out.println("NAME            SCORE\n"+players_comp[0]+"              "+score_player_comp[0]+"\n"+
            players_comp[1]+"              "+score_player_comp[1]+"\n"+players_comp[2]+"              "+score_player_comp[2]+"\n"+
            players_comp[3]+"              "+score_player_comp[3]+"\n"+players_comp[4]+"              "+score_player_comp[4]+"\n"+
            players_comp[5]+"              "+score_player_comp[5]+"\n"+players_comp[6]+"              "+score_player_comp[6]+"\n"+
           "TOTAL:-       "+final_score_comp+"\nRESULT-"+result);
      Thread.sleep(5000);
        menu();
    }
   }
  }
 }
    void menu()throws IOException, InterruptedException
    {
        explodo ddd=new explodo();
        ddd.bold();
        InputStreamReader x=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(x);
        System.out.println(" _____                                                                                                            _______________\n"+
        "|       |                               |      |    _____               __                                       |               |\n"+
        "|       |                               |      |   |     |   |\\    |   |  \\                                      |_____          |\n"+
        "|       |                               |_____ |   |____ |   | \\   |   |   \\                                     |               |\n"+
        "|       |                               |      |   |     |   |  \\  |   |   /                                     |_____          |\n"+
        "|       |___________                    |      |   |     |   |    \\|   |__/                                      |               |\n"+
        "|                   |                                                                                            |_____          |\n"+
        "|              _____|                                                                                            |               |\n"+
        "|                   |           ________                                                                         |________       |\n"+
        "|              _____|          |                 _____       _______     ______             _______    _________          |      |\n"+
        "|                   |          |                |     \\         |       |         |    /   |               |              |      |\n"+
        "|              _____|          |                |_____/         |       |         |__ /    |_____          |              |      |\n"+
        "|                   |          |                |    \\          |       |         |  \\     |               |              |      |\n"+
        "|___________________|          |________        |     \\      ___|___    |______   |   \\    |_______        |              |______|\n");
        int f;
         
        do
        {
            f=0;
        System.out.println("                     HANDCRICKET\nMAIN MENU\n\n(1)PLAY CRICKET\n(2)Instructions\n(3)EXIT");
        String d=br.readLine();
       
            try
            {
                if(d.equalsIgnoreCase("1"))
                {
                    play();
                }
                
                 else if(d.equalsIgnoreCase("2"))
                {
                    System.out.println("Welcome to Hand Cricket!\n After the toss,\nYou must select a number for each ball,\n>If you are batting\nand if the"
                    +"computer's number matches the number you have entered,\nyour batsman is out\nelse, the number adds to your total score\n\nIf you are bowling,"
                    +"\nand if your number matches with the computer's number'\nthe computer's batsman is out!\nElse,the computer's number adds to its total score!\n\nAll the other rules are same as normal cricket!");
                    System.out.println("Press enter to continue!");
                    String s=br.readLine();
                    menu();
            }
                
                else if(d.equalsIgnoreCase("3"))
                {
                    e();
                }
                else
                {
                    throw new IOException();
                }
            }
            catch(IOException op)
            {
                System.out.println("Please enter from the options given above");
                f++;
            }
        }while(f!=0);
    }
    void e()throws IOException, InterruptedException
    {
        mobile1 x=new mobile1(); 
        x.main();
    }
}


           
         
          
      
   
