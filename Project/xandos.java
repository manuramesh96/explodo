import java.io.*;
class xandos
{
char[]c=new char[9];
char user_char;
char comp_char;
 void xandos()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
     String s;
     int[]x={0,0,0,0,0,0,0,0,0};
     for(int i=0,k='1';i<c.length;k++,i++)
     {
         c[i]=(char)k;
     }
         
     
     boolean[]b=new boolean[9];
     
     int turn_count=0;
     int a=1,a100=1;
     char winner_char=' ';
     int cno=0;

     System.out.println("\n       |       |        ");
     System.out.println("   1   |   2   |   3    ");
     System.out.println("_______|_______|_______ ");
     System.out.println("       |       |        ");
     System.out.println("   4   |   5   |   6    ");
     System.out.println("_______|_______|_______ ");
     System.out.println("       |       |        ");
     System.out.println("   7   |   8   |   9    ");
     System.out.println("       |       |        ");

    
        if(user_char=='X')
        {
         comp_char='O';
        }
        
        else
        {
         comp_char='X';
        }

try
{
 do{
     
     
     a100=1;
      turn_count++;
         
    System.out.println("Enter the number corresponding to the block that you need to mark..."); 
 boolean f=true;
 while(f)
 {
   a100=1;
  
     
   while(a100==1)
   {int k;
    do
    {k=0;
     try
     {
        
     a=Integer.parseInt(br.readLine());}
     catch(Exception c)
     {
         System.out.println("Please enter a value from 1-9 only.");
         k++;
        }
    }while(k!=0);
    
     
     if(a<1 || a>9)
     {
        System.out.println("Please enter a value from 1-9 only.");
        
        }
        else
        {
            a100=0;
        }
    }
    
    
    location_decider:
    {
         if(x[a-1]==0)
         {
            c[a-1]=user_char;
            x[a-1]=1;
            f=false;
         }
         else
         {
             System.out.println("The block you chose has already been filled.\nPlease enter another block number...");
            
         }
    }
    }
     
   
    display_grid();
    if(turn_count>=3)
    {
     winner_decider:
     {
        if((c[1-1]=='X' && c[2-1]=='X' && c[3-1]=='X') || (c[4-1]=='X' && c[5-1]=='X' && c[6-1]=='X') || (c[7-1]=='X' && c[8-1]=='X' && c[9-1]=='X') || (c[1-1]=='X' && c[4-1]=='X' && c[7-1]=='X') || (c[2-1]=='X' && c[5-1]=='X' && c[8-1]=='X') || (c[3-1]=='X' && c[6-1]=='X' && c[9-1]=='X') || (c[1-1]=='X' && c[5-1]=='X' && c[9-1]=='X') || (c[3-1]=='X' && c[5-1]=='X' && c[7-1]=='X'))
        {
            winner_char='X';
        
        }
        
        else if((c[1-1]=='O' && c[2-1]=='O' && c[3-1]=='O') || (c[4-1]=='O' && c[5-1]=='O' && c[6-1]=='O') || (c[7-1]=='O' && c[8-1]=='O' && c[9-1]=='O') || (c[1-1]=='O' && c[4-1]=='O' && c[7-1]=='O') || (c[2-1]=='O' && c[5-1]=='O' && c[8-1]=='O') || (c[3-1]=='O' && c[6-1]=='O' && c[9-1]=='O') || (c[1-1]=='O' && c[5-1]=='O' && c[9-1]=='O') || (c[3-1]=='O' && c[5-1]=='O' && c[7-1]=='O'))
        {
            winner_char='O';
                   
        }
        else if(turn_count==5)
        {
            System.out.println("Match drawn");
        }
                
     }
    

    
     winner_announcer:
   { 
       if(winner_char==user_char)
       {
           System.out.println("YOU WIN");
           Thread.sleep(3000);
        break;
       }
        
        else if(winner_char==comp_char)
        {
            System.out.println("YOU LOSE");
            Thread.sleep(3000);
            break;
        }
        
    }
    }  
   System.out.print("The computer is thinking");
    for(int i=1;i<=5;i++)
    {   Thread.sleep(500);
        System.out.print(".");     
    }
   
    if(turn_count<=4)
    {
    boolean f2=true;
       while(f2)
       {
        cno=(int)(10*Math.random())-1;
        comp_location_decider:
       {
           if(cno>=1 & cno<=9 && x[cno-1]==0)
          {
            c[cno-1]=comp_char;
            x[cno-1]=1;
            f2=false;
          }
        
        }
     }
    }
    
    System.out.println("Now it is computer's turn");
     display_grid();
         
    if(turn_count>=3)
    {
     winner_decider:
     {
        if((c[1-1]=='X' && c[2-1]=='X' && c[3-1]=='X') || (c[4-1]=='X' && c[5-1]=='X' && c[6-1]=='X') || (c[7-1]=='X' && c[8-1]=='X' && c[9-1]=='X') || (c[1-1]=='X' && c[4-1]=='X' && c[7-1]=='X') || (c[2-1]=='X' && c[5-1]=='X' && c[8-1]=='X') || (c[3-1]=='X' && c[6-1]=='X' && c[9-1]=='X') || (c[1-1]=='X' && c[5-1]=='X' && c[9-1]=='X') || (c[3-1]=='X' && c[5-1]=='X' && c[7-1]=='X'))
        {
            winner_char='X';
        
        }
        
        else if((c[1-1]=='O' && c[2-1]=='O' && c[3-1]=='O') || (c[4-1]=='O' && c[5-1]=='O' && c[6-1]=='O') || (c[7-1]=='O' && c[8-1]=='O' && c[9-1]=='O') || (c[1-1]=='O' && c[4-1]=='O' && c[7-1]=='O') || (c[2-1]=='O' && c[5-1]=='O' && c[8-1]=='O') || (c[3-1]=='O' && c[6-1]=='O' && c[9-1]=='O') || (c[1-1]=='O' && c[5-1]=='O' && c[9-1]=='O') || (c[3-1]=='O' && c[5-1]=='O' && c[7-1]=='O'))
        {
            winner_char='O';
                   
        }
        else if(turn_count==5)
        {
            System.out.println("Match drawn");
        }
                
     }
    

    
     winner_announcer:
   { 
       if(winner_char==user_char)
       {
           System.out.println("YOU WIN");
           Thread.sleep(3000);
        break;
       }
        
        else if(winner_char==comp_char)
        {
            System.out.println("YOU LOSE");
            Thread.sleep(3000);
            break;
        }
        
    }
    }         

     
}while(turn_count<5);
mobile1.games_and_applications();
}
catch(Exception gggg)
{}

}

void display_grid()
{
System.out.println("Current grid Status is:");
System.out.println("       |       |        ");
System.out.println("   "+c[0]+"   |   "+c[1]+"   |   "+c[2]+"    ");
System.out.println("_______|_______|_______ ");
System.out.println("       |       |        ");
System.out.println("   "+c[3]+"   |   "+c[4]+"   |   "+c[5]+"    ");
System.out.println("_______|_______|_______ ");
System.out.println("       |       |        ");
System.out.println("   "+c[6]+"   |   "+c[7]+"   |   "+c[8]+"    ");
System.out.println("       |       |        \n");
}

void help()throws IOException
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Welcome to tic tac toe");
  System.out.println("First of all you need to put the toss to decide who should play first");
  System.out.println("\n Then the main grid appears\n");
  
System.out.println("       |       |        ");
System.out.println("   1   |   2   |   3    ");
System.out.println("_______|_______|_______ ");
System.out.println("       |       |        ");
System.out.println("   4   |   5   |   6    ");
System.out.println("_______|_______|_______ ");
System.out.println("       |       |        ");
System.out.println("   7   |   8   |   9    ");
System.out.println("       |       |        ");
System.out.println("\nNow you should select the block you want to mark your character(X or O as the case may be)\nby entering the number corresponding to the block");
System.out.println("You get to mark your grid every alternative turn.\nThe first player to get a perfect three character line wins.\nThe line my be either horizontal, vertical or diagonal");
System.out.println("\n\nSo what are you waiting for let's start");



}

char toss()
{
 int a;
 a=(int)((10)*(Math.random()));
 char c2;
 if(a%2==0)
 {c2='X';}
 else
 {c2='O';}
 
   if(c2=='X')
   {
     System.out.println("You have won the toss\nso you get to start the game\nYour character is "+c2);
   }
 
    else
   {
    System.out.println("You have lost the toss\nso the computer gets to start the game\nYour character is "+c2);
   }
 return c2;
}
  

void maingame()throws IOException
{
explodo xx=new explodo();
 xx.wait_circle(1);
 System.out.println("Welcome to TIC TAC TOE game.");
System.out.println("Mark your numbers on the grid!"+
"\n Whoever makes a line either diagonally or vertically or horizontally first will win!"+
"\n If no one gets to make a line after all the turns, the match will be decalred a draw!");

 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("\nLet us begin\nPress enter for the toss");
 String s=br.readLine();
  user_char=toss();
  xandos();
 
  
   
   
}

 }