import java.io.*;

class notes
{
  String[][] notes= new String[15][2];
  
  
  notes()
  {
      for(int i=0;i<notes.length;i++)
      {
          notes[i][0]="0";
          notes[i][1]="0";
      }
      
  }
  
  
  void p(String abc)
    {
        System.out.println(abc);
    }
    
    
  void add()throws IOException, InterruptedException
  {System.out.println("\f");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      if(!(notes[notes.length-1][0].equals("0")))
      {
        System.out.println("Notes memory full!\nPlease delete Notes and try again!");
        main();
       }
      p("Enter the name of the new file");
      String n=br.readLine();
      p("Enter the note-");
      String m=br.readLine();
      
      for(int i=0;i<notes.length;i++)
        {
            if(notes[i][0].equals("0"))
            {
                notes[i][0]=n;
                notes[i][1]=m;
                break;
            }
         }
         
         p("Note saved!");
         main();
    }
  
    
   void open_file()throws IOException, InterruptedException
   {System.out.println("\f");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    p("Enter the serial number of the file you want to open-");
    int count=0;
    for(int i=0,m=1;i<notes.length;i++)
    {
        if(!(notes[i][0].equals("0")))
       {
           count++;
           p(m+" "+notes[i][0]);
           m++;
        }
    }
    if(count==0)
    {
        p("There are no saved files!");
        Thread.sleep(3000);
        main();
    }
    
    
    int j,choice=0;     
    do
    {j=0;
     try
     {
        
       choice=Integer.parseInt(br.readLine())-1;
       if(notes[choice][0].equals("0"))
       {
           throw new Exception();
        }
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
       
     p(notes[choice][0]+"\t"+notes[choice][1]);
     int w;
            do
            {
                w=0;
                try
                {
                    System.out.println("Do you want write in the note");
                    String  u=br.readLine();
                    if(u.equalsIgnoreCase("yes"))
                    {
                        
                        System.out.println("start typing and press return key when typing is complete");
                        String s=br.readLine();           
                        notes[choice][1]=notes[choice][1]+s;
                        main();
                    }
                    else if(u.equalsIgnoreCase("no"))
                    {
                        main();
                    }
                    else
                    {
                        throw new IOException();
                    }
                }
                catch(IOException ax)
                {
                    System.out.println("Please enter yes or no");
                    w++;
                }
            }while(w!=0);
        }
    
    
  void delete_note()throws IOException, InterruptedException
  {System.out.println("\f");
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    p("Enter the serial number of the file you want to delete-");
    int count=0;
    for(int i=0,m=1;i<notes.length;i++)
    {
        if(!(notes[i][0].equals("0")))
       {
           count++;
           p(m+" "+notes[i][0]);
           m++;
        }
    }
    
   int j,choice=0;     
    do
    {j=0;
     try
     {
        
       choice=Integer.parseInt(br.readLine())-1;
       if(notes[choice][0].equals("0"))
       {
           throw new Exception();
        }
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
    
    
      
      if(choice!=notes.length-1)
      {
              for(int i=choice;i<notes.length;i++)
              {
                  if(!(notes[i][0].equals("0")))
                  {
                   notes[i][0]=notes[i+1][0];
                   notes[i][1]=notes[i+1][1];
                   }
                  
              } 
      }
      
      else if(choice==notes.length-1)
      {
          notes[choice][0]="0";
          notes[choice][1]="0";
        }
        
     p("File deleted!");
     main();
    }
    
        
   void main()throws IOException, InterruptedException
    {System.out.println("\f");
        explodo qq=new explodo();
        qq.wait_circle(1);
       
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("WELCOME TO NOTES");
        int q;
        do
        {
            q=0;
            try
            {
                System.out.println("(1)Open saved file\n(2)Create new file\n(3)Delete Note\n(4)Go to organizer");
                System.out.println("Enter choice:-");
                
                int j,h=0;     
                do
                {j=0;
                    try
                    {
        
                        h=Integer.parseInt(br.readLine());
                    }
                    catch(Exception c)
                    {
                        System.out.println("Please enter the correct option!.");
                        j++;
                    }
                }while(j!=0);
                
                
                if(h==1)
                {
                    open_file();
                }     
                
                else if(h==2)
                {
                    add();
                }
                else if(h==3)
                {
                    delete_note();
                }
                else if(h==4)
                {
                    mobile1.organizer();
                }
                else
                {
                    throw new IOException();
                }
            }
            catch(IOException tt)
            {
                System.out.println("Please select from the options given");
                q++;
            }
        }while(q!=0);
  
    }
        
}
     