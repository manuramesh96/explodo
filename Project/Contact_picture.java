import java.io.*;
class Contact_picture
{


  static void c1()
  {
   System.out.println("    *  *  *    ");
  System.out.println("  * --   -- *  ");
  System.out.println(" *   0   0   * ");
  System.out.println(" *     L     *");
  System.out.println("  *    U     *  ");
  System.out.println("    *  *  *    "); 
  }
  static void c2()
  {
     System.out.println("    *  *  *    ");
     System.out.println("  * --   -- *  ");
     System.out.println(" *   >   <   * ");
     System.out.println(" *     0     *");
     System.out.println("  *    ^     *  ");
     System.out.println("    *  *  *    ");
    }
  static void c3()
  {
    System.out.println("    *  *  *    ");
    System.out.println("  * --   -- *  ");
    System.out.println(" *   *   *   * ");
    System.out.println(" *     *     *");
    System.out.println("  *    **   *  ");
    System.out.println("    *  *  *    ");
    }
  static void c4()
  {
      
  System.out.println("    *  *  *    ");
  System.out.println("  * --   -- *  ");
  System.out.println(" *   0   0   * ");
  System.out.println(" *   ! L !    *");
  System.out.println("  *    -     *  ");
  System.out.println("    *  *  *    ");
  
    }
  void Contact_picture()throws IOException, InterruptedException
  {  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        contact u=new contact();
        int k=1;
        for(int i=0;i< u.contacts.length;i++)
             {
                 
                 if(!(u.contacts[i].equals("0")))
                 {
                     System.out.println("("+k+")"+u.contacts[i]+"\n"+u.phno[i]);
                 k++;
                  }
             }
      int w;
        do
      {
       w=0;
       try
       {
      System.out.println("Select the serial number of the contact to which you want to add picture");
      int no=Integer.parseInt(br.readLine())-1;
      if((no+1)>k-1)
      {
          throw new IOException();
      }
      int l;
      System.out.println("(1)");
      c1();
      System.out.println("(2)");
      c2();
      System.out.println("(3)");
      c3();
      System.out.println("(4)");
      c4();
      do
      {
          l=0;
     try
     {
      System.out.println("Select (1),(2),(3) or (4)");
      String c=br.readLine();
      if(c.equals("1"))
      {
          u.contacts_picture[no]="1";   
      }
      else if(c.equals("2"))
      {
          u.contacts_picture[no]="2";
      }
      else if(c.equals("3"))
      {
         u. contacts_picture[no]="3"; 
      }
      else if(c.equals("4"))
      {
          u.contacts_picture[no]="4";
      }
      else
      {
          throw new IOException();
      }
      
    }
    catch(IOException hh)
    {
        System.out.println("Please select from the options");
        l++;
    }
    }while(l!=0);
   }
    catch (IOException t)
    {
        System.out.println("Please select from the options");
        w++;
    }
   }while(w!=0); 
      System.out.println("STORED");
      u.contact();
    }
}
