import java.io.*;
class Messages
{  static String[][] inbox=new String[10][2];
   static String[] draft=new String[10];
   static String[][] sentm=new String[10][2];
 
       
   void delete_messages()throws IOException, InterruptedException
   {
       System.out.println("\f");
       System.out.println("-----Delete Messages-----");
       System.out.println("What do you want to delete?\n\n(1) Inbox\n(2) Drafts\n(3) Sent Messages\n Enter any other"+
       " key to go back to the previous menu."); 
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       
       
       int j,c=0;     
    do
    {j=0;
     try
     {
        
      c=Integer.parseInt(br.readLine());
    }
     catch(Exception c2)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
       
       
       
       switch(c)
       {
           case 1:
        for(int i=0;i<10;i++)
       {
        inbox[i][0]="0";
        inbox[i][1]="0";
        
      }
      break;
          case 2:
        for(int i=0;i<10;i++)
       {
        
        draft[i]="0";
       
      }
      break;
          case 3:
        for(int i=0;i<10;i++)
       {
        
        sentm[i][0]="0";
        sentm[i][1]="0";
      }
      break;
      
      default:
      main();
      
    }
    }
   
   void inbox()throws IOException, InterruptedException
   {   System.out.println("\f");
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       System.out.println("----Inbox----");
       
       
       if(inbox[0][0].equals("0"))
       {
           System.out.println("---Inbox Empty---");
           Thread.sleep(3000);
           main();
        }
        
       else
       { 
        for(int i=0,k=1;i<10;i++)
       {
           
           if(!(inbox[i][0].equals("0")))
           {
               System.out.println("("+k+") Sender:"+inbox[i][0]+"\nSubject:\n"+inbox[i][1]);
               System.out.println("------------------------------------------------------");
               k++;
           }
       }
         System.out.println("Press enter to go back to the previous menu");
        String s=br.readLine();
        main();
    }
    }
    
     void sent_messages()throws IOException,InterruptedException    
   {
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       System.out.println("\f");
       System.out.println("----Sent Messages----");
        if(sentm[0][0].equals("0"))
    {
        System.out.println("There are no sent messages!");
        Thread.sleep(3000);
        main();
    }
       
        for(int i=0,k=1;i<10;i++)
       {
           
           if(!(sentm[i][0].equals("0")))
           {
               System.out.println("("+k+") "+sentm[i][0]+"\t"+sentm[i][1]);
               k++;
           }
       } 
       System.out.println("Press enter to continue");
       String hj=br.readLine();
       main();
    }
   
   void display_draft()throws IOException, InterruptedException
   {
       System.out.println("\f");
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       System.out.println("------Drafts------");
        if(draft[0].equals("0"))
    {
        System.out.println("There are no draft messages!");
        Thread.sleep(3000);
        main();
    }
       
       for(int i=0,k=1;i<10;i++)
       {
           
           if(!(draft[i].equals("0")))
           {
               System.out.println("("+k+") "+draft[i]);
               k++;
           }
       } 
          System.out.println("Do you want to send a draft message?");
          String kkkk=br.readLine();
          if(kkkk.equalsIgnoreCase("yes"))
          {
           
     System.out.println("Please enter the serial number of the draft message which you want to send.");
     
     int k23=0;
     int c3=0;
     do{
         k23=0;
         try
         {
            c3=Integer.parseInt(br.readLine());
            }
         catch(Exception c23)
         {
             System.out.println("Please enter the correct option.");
             c3++;
        }
    }while(k23!=0);
    
    
    int c2=0;
            System.out.println("Press\n1 to enter the phone number of receipient\n2 to get the phone number"
     +" from contacts");

    do{
         k23=0;
         try
         {
          c2=Integer.parseInt(br.readLine());
            }
         catch(Exception c24)
         {
             System.out.println("Please enter the correct option.");
             c3++;
        }
    }while(k23!=0);
     
     
     

     String phno="";
     switch(c2)
     {
         case 1:
         
          int al;
          do
          {
          al=0;    
          try
          {
           System.out.println("Enter the phone number of receipient!");
           phno=br.readLine();
          if(phno.length()!=8&phno.length()!=10)
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
         System.out.println("---Enter the serial number of the recepient from the list below---");
         for(int i=0,k=1;i<contact.contacts.length;i++,k++)
             {
                 if(!(contact.contacts[i].equals("0")))
                {System.out.println("("+k+")"+contact.contacts[i]+"\n"+contact.phno[i]);
                }
                }
         int opt=Integer.parseInt(br.readLine());
         phno=contact.phno[opt-1];
         
             }
    
     System.out.println(phno);
     System.out.println("Press enter to send!");
     String waste=br.readLine();
     explodo.send_mail();
     
      for(int i=0;i<10;i++)
    {
        if(sentm[i][0].equals("0"))
        {
         sentm[i][0]=phno;
         sentm[i][1]=draft[c3-1];
         break;
        }
         
    }
    main(); 
          
   }
   else if(kkkk.equalsIgnoreCase("no"))
   {
       main();
    }
   
}
   
   
    Messages()
   {
    for(int i=0;i<10;i++)
    {
        inbox[i][0]="0";
        inbox[i][1]="0";
        draft[i]="0";
        sentm[i][0]="0";
        sentm[i][1]="0";
    }
   }
   
   void new_message()throws IOException, InterruptedException
   {
    System.out.println("\f");
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Type the Message in one line only!\n Press enter when done!");
    String mail=br.readLine();
    System.out.println("\n Press\n1 if you want to save as drafts \n2 if you want to send it now");
    int c=Integer.parseInt(br.readLine());
    if(c==1)
    {
     if(!(draft[draft.length-1].equals("0")))
     {
       System.out.println("Draft memory full!\nPlease delete drafts and try again!");
       main();
        }
     for(int i=0;i<10;i++)
     {
         if(draft[i].equals("0"))
         {
             draft[i]=mail;
             break;
         }
     }
    
    
     System.out.println("Message saved in draft!");
     main();
    }  
    
    if(c==2)
    {
        if(!(sentm[sentm.length-1][0].equals("0")))
     {
       System.out.println("Sent Messages memory full!\nPlease delete Sent Messages and try again!");
       main();
     }
     System.out.println("Press\n1 to enter the phone number of receipient\n2 to get the phone number"
     +" from contacts");
     
     int c2=Integer.parseInt(br.readLine());
     String phno="";
     switch(c2)
     {
         case 1:
         System.out.println("Enter the phone number of receipient!");
         phno=br.readLine();
         break;
         
         //check
        case 2:
         System.out.println("---Enter the serial number of the recepient from the list below---");
         for(int i=0,k=1;i<contact.contacts.length;i++,k++)
             {  if(!(contact.contacts[i].equals("0")))
                {System.out.println("("+k+")"+contact.contacts[i]+"\n"+contact.phno[i]);}
              }
        
        int j,opt=0;     
    do
    {j=0;
     try
     {
        
       opt=Integer.parseInt(br.readLine());
    }
     catch(Exception p)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);      
              
        
        phno=contact.phno[opt-1];
         
             }
    
     System.out.println(phno);
     System.out.println("Press enter to send!");
     String waste=br.readLine();
     explodo.send_mail();
     
     for(int i=0;i<10;i++)
    {
        if(sentm[i][0].equals("0"))
        {
         sentm[i][0]=phno;
         sentm[i][1]=mail;
         break;
        }
         
    }
    main();     
    }
    
   }
       
   void main()throws IOException, InterruptedException
   {
     System.out.println("\f"); 
     System.out.println("----MESSAGES----");
     System.out.println("(1) New Message");
     System.out.println("(2) Inbox");
     System.out.println("(3) Draft");
     System.out.println("(4) Sent Messages");
     System.out.println("(5) Delete Messages");
     System.out.println("(6) Back To Menu");
     System.out.println("Enter choice:-");
     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
     
     int j,c=0;     
    do
    {j=0;
     try
     {
        
       c=Integer.parseInt(br.readLine());
    }
     catch(Exception c1)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
     
     
     int i=0;
     do{
         i=0;
     switch(c)
     {
         
          case 1:
          new_message();
          break;
          
          case 2:
          inbox();
          break;
          
          case 3:
          display_draft();
          break;
          
          case 4:
          sent_messages();
          break;
          
          case 5:
          delete_messages();
          break;
          
          case 6:
          mobile1.main();
          break;
          
          default:
          System.out.println("Enter correct choice.");
          i++;
          
        }
    }while(i!=0);
   }
}