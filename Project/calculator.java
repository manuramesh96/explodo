import java.io.*;  
public class calculator

{
  double add(double a,double b)
  {
   return a+b;
  }
 
  double sub(double a,double b)
  {
   return a-b;
  }
  
  double mul(double a,double b)
  {
      return a*b;
  }
    
  double div(double a,double b)
  {
      return a/b;
  }
  
  double sq(double a)
  {
     return a*a;
    }
    
   double sqrt(double a)
   {
       return Math.sqrt(a);
    }
    
       double sin(double a)
   {
       return Math.sin(Math.toRadians(a));
    }
    
       double cos(double a)
   {
       return Math.cos(Math.toRadians(a));
    }
    
       double tan(double a)
   {
       return Math.tan(Math.toRadians(a));
    }
    
       double cot(double a)
   {
       return 1.0/Math.tan(Math.toRadians(a));
    }
    
       double sec(double a)
   {
       return 1.0/Math.cos(Math.toRadians(a));
    }
    
    
       double cosec(double a)
    {
       return 1.0/Math.sin(Math.toRadians(a));
    }
    
        double pow(double a,double b)
   {
       return Math.pow(a,b);
    }   
    
       double log(double a)
   {
       return Math.log(a);
    }
    
    void print(String abc)
    {
        System.out.println(abc);
    }
        
   void main()throws IOException,InterruptedException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int i;
      do
      {
        i=0;  
       print("\t\t\t\tCALCULATOR\nENTER THE NUMBER OF THE CHOICE YOU WANT TO DO:-\n(1)add\n(2)subtract\n(3)multiply\n(4)divide\n(5)square\n(6)squareroot"+
       "\n(7)Sin\n(8)Cosine\n(9)Tangent\n(10)Cotangent\n(11)Secent\n(12)Cosecent\n(13)Power\n(14)Logarithm\n(15)Go back to the previous menu");
    int j,ch=0;     
    do
    {j=0;
     try
     {
        
      ch=Integer.parseInt(br.readLine());
    }
     catch(Exception c)
     {
         System.out.println("Please enter the correct option!.");
         j++;
        }
    }while(j!=0);
       
       
       switch(ch)
       {
           case 1:
           print("Enter the two numbers you want to add:");
           double t=add(Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
           System.out.println("SUM="+t);
           break;
           
           case 2:
           print("Enter the two numbers you want to subtract:");
           double ss=add(Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
           System.out.println("Answer="+ss);
           break;
           
           case 3:
           print("Enter the two numbers you want to multiply:");
           double mm=add(Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
           System.out.println("Product="+mm);
           break;
           
           case 4:
           print("Enter the two numbers you want to Divide:");
           double qq=add(Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
           System.out.println("Quotient="+qq);
           break;
           
           case 5:
           print("Enter the number to be squared:");
           double square=sq(Double.parseDouble(br.readLine()));
           print("Square="+square);
           break;
           
           case 6:
           print("Enter the number whose squareroot has to be found :");
           double squareroot=sqrt(Double.parseDouble(br.readLine()));
           print("Squareroot="+squareroot);
           break;
           
           case 7:
           print("Enter the number whose sin has to be found :");
           double sine=sin(Double.parseDouble(br.readLine()));
           print("Sine="+sine);
           break;
           
           case 8:
           print("Enter the number whose cos has to be found :");
           double cosine=cos(Double.parseDouble(br.readLine()));
           print("Cosine="+cosine);
           break;
           
           case 9:
           print("Enter the number whose tangent has to be found :");
           double tangent=tan(Double.parseDouble(br.readLine()));
           print("Tan="+tangent);
           break;
           
           case 10:
           print("Enter the number whose cotangent has to be found :");
           double cotangent=cot(Double.parseDouble(br.readLine()));
           print("Cot="+cotangent);
           break;
           
           case 11:
           print("Enter the number whose secent has to be found :");
           double sec=sec(Double.parseDouble(br.readLine()));
           print("Secant="+sec);
           break;
           
           case 12:
           print("Enter the number whose cosecent has to be found :");
           double cosec=cosec(Double.parseDouble(br.readLine()));
           print("CoSecant="+cosec);
           break;
           
           case 13:
           print("Enter the number and the power of the number :");
           double no=pow(Double.parseDouble(br.readLine()),(Double.parseDouble(br.readLine())));
           print("Power of the number="+no);
           break;
           
             case 14:
           print("Enter the number whose logarithm has to be found :");
           double log=log(Double.parseDouble(br.readLine()));
           print("Logarithm of the number="+log);
           break;
           
           case 15:
           mobile1.organizer();
           break;
           
           default:
           print("Please select from the choice");
           i++;
       }
     }while (i!=0);
     main();
   }
}