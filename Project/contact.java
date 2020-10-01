
import java.io.*;
class contact
{
   static String[]contacts=new String[100];
   static String[]contacts_picture=new String[100];
   static String[]phno=new String[100];
   static int i=0;
   static int o=0;
   
   contact()
   {
        for(int i=0;i<contacts_picture.length;i++)
    {
       contacts_picture[i]="0";  
    }
    contacts[0]="VODAPHONE";
   contacts[1]="EMERGENCY";
   contacts[2]="POLICE";
   phno[0]="121";phno[1]="101";phno[2]="100";
   for(int i=3;i<contacts.length;i++)
   {
       contacts[i]="0";
       phno[i]="0";
   }
  }
   
   
   void contact()throws IOException, InterruptedException
   {  
       System.out.println("\f");
       sort();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int g;
   do
   {
       g=0;
    try
   {
    System.out.println("------CONTACTS------\n(1)NAMES\n(2)ADD NEW\n(3)DELETE CONTACT\n(4)ADD PICTURE\n(5)MAIN MENU");
    System.out.println("Enter choice:-");
    String c=br.readLine();
    if(c.equals("1"))
    {
        names();
    }
    else if(c.equals("2"))
    {
        add_new();   
    }
  
    else if(c.equals("3"))
    {
       delete();
    }
    else if(c.equals("4"))
    {
        Contact_picture p=new Contact_picture();
        p.Contact_picture();
    }
    else if(c.equals("5"))
    {
        mobile1 mb=new mobile1();
        mb.main();
    }
    else
    {
        throw new IOException();
    }
   }
   catch(IOException o)
   {
       System.out.println("Please select from the options given");
       g++;
    }
   }while(g!=0);
 }
   void names()throws IOException, InterruptedException
   {System.out.println("\f");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             Contact_picture p=new Contact_picture();
             System.out.println("----------Names----------");
             for(int i=0,k=1;i<contacts.length;i++,k++)
             {
                 
                 if(!(contacts[i].equals("0")))
                 {
                    if(!(contacts_picture[i].equals("0")))
                    {
                        if(contacts_picture[i].equals("1"))
                        {
                            Contact_picture.c1();
                        }
                        else if(contacts_picture[i].equals("2"))
                        {
                            Contact_picture.c2();
                        }
                        else if(contacts_picture[i].equals("3"))
                        {
                            Contact_picture.c3();
                        }
                        else if(contacts_picture[i].equals("4"))
                        {
                            Contact_picture.c4();
                        }
                    }     
                     System.out.println("("+k+")"+contacts[i]+"\n"+phno[i]);
                     System.out.println("---------------------------------------------");
                 }
             }
            int d;
            do
            {
              d=0;
              try
              {
             System.out.println("Want to call?\n TYPE YES OR NO");
             String c=br.readLine();
             if(c.equalsIgnoreCase("YES"))
             {
              mobile1.ring.main();
             }
             else
             {
                  contact();
             }
               }
               catch(IOException r)
               {
                   System.out.println("Please type yes or no");
                  d++;
               }
            }while(d!=0);
   }
   void add_new()throws IOException, InterruptedException
   {System.out.println("\f");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
       
       
       if(!(contacts[contacts.length-1].equals("0")))
      {
        System.out.println("Contacts memory full!\nPlease delete Contacts and try again!");
        contact();
       }
       int p=0;
       for(int i=0;i<contacts.length;i++)
       {
           if(contacts[i].equals("0"))
           {
               p=i;
               break;
           }
       }
       String opt="yes";
       int j;
       for(int k=p;!(opt.equalsIgnoreCase("no"));k++)
       {
          System.out.print("Enter the name-");
          contacts[k]=br.readLine().toUpperCase();
          int al;
          do
          {
          al=0;    
          try
          {
          System.out.print("Enter an eight digit or 10 digit number the phone number-");
          phno[k]=br.readLine();
          if(phno[k].length()!=8&phno[k].length()!=10)
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
          
          
          
          do
          {
              j=0;
          try
          {
          System.out.println("CONTACT STORED!!\ndo you want to enter another contact?");
          opt=br.readLine();
          if(!(opt.equalsIgnoreCase("yes")||opt.equalsIgnoreCase("no")))
          {
              throw new IOException();
          }
          }
          catch(IOException y)
          {
              System.out.println("Please type yes or no");
              j++;
          }
          }while(j!=0);
       }
       for(int i=0,k=1;i<contacts.length;i++)
             {
                 
                 if(!(contacts[i].equals("0")))
                 {
                     System.out.println("("+k+")"+contacts[i]+"\n"+phno[i]);
                     k++;
                    }
             }
       contact();
   }
  
   void sort()throws IOException
   {System.out.println("\f");
       //selection sorting names array
       int n=contacts.length;
       String min="",min1="",min2="";
       
       int p=0,q=0,r=0;
       for(int j=0;j<n;j++)
       {
          min=contacts[j];
          p=j;
          for(int i=j+1;i<n;i++)
          {
              if(contacts[i].compareTo(min)<0&&!(contacts[i].equals("0")))
              {
                  min=contacts[i];
                  p=i;
              }
          }
            contacts[p]=contacts[j];
            contacts[j]=min;
            //rearrange the other two arrays here
            min=contacts_picture[j];
            contacts_picture[j]=contacts_picture[p];
            contacts_picture[p]=min;
            
            min=phno[j];
            phno[j]=phno[p];
            phno[p]=min;            
      }
    }
    
  void delete()throws IOException, InterruptedException
   {System.out.println("\f");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Contact_picture p=new Contact_picture();
        int k=1;
             for(int i=0;i<contacts.length;i++)
             {
                 if(!(contacts[i].equals("0")))
                 {
                     System.out.println("("+k+")"+contacts[i]+"\n"+phno[i]);
                     k++;
                 }
             }
             int q;
             System.out.println(k);
             do
             {
                 q=0;
                 try
            {
             System.out.print("Enter the number of the contact you want to delete-");
             String a=br.readLine();
             if(Integer.parseInt(a)>k-1)
             {
                 throw new IOException();
             }
            
             for(int i=Integer.parseInt(a)-1;i<contacts.length;i++)
             {
                 if(!(contacts[i].equals("0")))
                 {
                     contacts[i]=contacts[i+1];
                     phno[i]=phno[i+1];
                     contacts_picture[i]="0";
                 }
             }
            }
            catch(IOException b)
            {
                System.out.println("Please type the serial number from the options");
                q++;
            }
          }
            while(q!=0);
             System.out.println("The number has been deleted");
             contact();
    
  }
    
}