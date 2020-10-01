import java.io.*;
class world_clock
{
   static String[]places=new String[100];
   static double[]longitude=new double[100];
  world_clock()
   {
       for(int i=0;i<places.length;i++)
       {
           places[i]="0";
           longitude[i]=0.0;
        }
       places[0]="Singapore-E";
       places[1]="Washing D.C-W.";
       places[2]="Sydney-E";
       places[3]="Bangkok-E";
       places[4]="Berlin-E";
       places[5]="Cape Town-E";
       places[6]="Hiroshima-E";
       places[7]="Islambad-E";
       places[8]="Jerusalem-E";
       places[9]="London-W";
       places[10]="Los angeles-W";
       places[11]="Paris-E";
       places[12]="Tokyo-E";
       places[13]="Wellington-E";
       longitude[0]=103.51;
       longitude[1]=77.2;
       longitude[2]=151.10;
       longitude[3]=100.35;
       longitude[4]=13.25;
       longitude[5]=18.22;
       longitude[6]=132.30;
       longitude[7]=73.10;
       longitude[8]=35.10;
       longitude[9]=0.3;
       longitude[10]=118.15;
       longitude[11]=2.20;
       longitude[12]=139.45;
       longitude[13]=174.46;
    }
    void calculate()throws IOException, InterruptedException
    { System.out.println("\f");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t;
        String h="";
       do{
            t=0;
        System.out.println("Enter the time in India\nPlease type in this format(24 hour clock)-00:00");
        h=br.readLine();
        String a="",b="",c="";
         a=a+h.charAt(0);
         b=b+h.charAt(1);
         c=c+a+b;
        int hr=Integer.parseInt(c);
        
        if(h.length()<5)
        {
             System.out.println("Please type the values properly-Check whether there is colon separating the hours and minutes");
         t++;
        }
        if(hr>24)
        {
            System.out.println("Please type the values properly-a");
            t++;
        }
        c="";
        a="";
        b="";
        a=a+h.charAt(3);
        b=b+h.charAt(4);
       
        c=c+a+b;
        int r=Integer.parseInt(c);
        if(r>59)
        {
            System.out.println("Please type the values properly-b");
            t++;
        }
        else if(!(Character.isDigit(h.charAt(0)) && Character.isDigit(h.charAt(1)) && Character.isDigit(h.charAt(3)) && Character.isDigit(h.charAt(4)) && h.charAt(2)==':'))   
        
        {
            System.out.println("Please type the values properly-Check whether there is colon separating the hours and minutes");
         t++;
        }
         
       }while(t!=0);
        char a1=h.charAt(0);
        char a2=h.charAt(1);
        String u="";
         u=u+a1+a2;
        int hi=Integer.parseInt(u);
        u="";
        u=u+h.charAt(3)+h.charAt(4);
        int m=Integer.parseInt(u);
        int jjj=(int)(82.5*4);
        int intermhour=(int)(jjj/60);
        int intermmin=(int)jjj%60;
        int hour=hi-intermhour;
           if(hour<=0)
            {
                hour=hour+24;
            }
        int min=m-intermmin;
            if(min<0)
            {
               hour=hour-1;
               min=min+60;
            }
            System.out.println("GMT TIME: "+m+" "+intermmin+" "+hour+":"+min);
        
        for(int i=0,k=1;i<places.length&&!(places[i].equals("0"));i++,k++)
        {
            
            System.out.println(k+". "+places[i]);
        }
        System.out.println("Enter the serial number of the city to which  you want to convert the time");
        int ti=Integer.parseInt(br.readLine())-1;
        double longi=longitude[ti];
        int add_subtimehour=(int)(longi*4)/60;
        int gg=(int)longi*4;
        int add_subtimemin=gg%60;
        int finalhour,finalmin;
        if(places[ti].charAt(places[ti].length()-1)=='E')
        {
            finalhour=hour+add_subtimehour;
            if(finalhour>24)
            {
                finalhour=finalhour-24;
            }
            finalmin=min+add_subtimemin;
            if(finalmin>59)
            {
                finalhour=finalhour+1;
                finalmin=finalmin-60;
            }
        }
        else
        {
             finalhour=hour-add_subtimehour;
            if(finalhour<0)
            {
                finalhour=finalhour+24;
            }
            finalmin=min-add_subtimemin;
            if(finalmin<0)
            {
                finalhour=finalhour-1;
                finalmin=finalmin+60;
            }
        }
        String th="",tm="";
        if(finalhour<10)
        {
            th="0"+finalhour;
        }
        else
        {
            th=th+finalhour;
        }
        if(finalmin<10)
        {
            tm="0"+finalmin;
        }
        else
        {
            tm=tm+finalmin;
        }
        System.out.println("Time At "+places[ti]+" is "+th+":"+tm);
        System.out.println("Do you want to use again?");
        String jk=br.readLine();
        if(jk.equalsIgnoreCase("yes"))
        {
            calculate();
        }
        else
        {
            mobile1.games_and_applications();
        }
    }
    
}
            
        

  