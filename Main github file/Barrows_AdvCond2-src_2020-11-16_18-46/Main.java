import java.util.*;
import java.text.DecimalFormat;
class Main {  
  public static void main(String args[]) { 
    Scanner a = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("00");
   
    while(true){
    int h;
     System.out.println("Enter hour for 12 hr time format:");
    
    try{
    h= a.nextInt();
    a.nextLine();
    }catch(InputMismatchException aa){
        System.out.println("Invalid Input");
        break;
    }
 
 
 
    if(h>=13||h<=0){
        System.out.println("Invalid Input");
        break;
    }
    
    
    
    
    
    
    
    
    
    int m; 
    
    System.out.println("Enter min for 12 hr time format:");
    
    
try{
    m= a.nextInt();
    a.nextLine();
    }catch(InputMismatchException aa){
        System.out.println("Invalid Input");
        break;
    }
    
    if(m>=60||m<0){
        System.out.println("Invalid Input");
        break;
    }
    
    
    
    
    
    
    
    
    
    
    
    int s; 
    System.out.println("Enter sec for 12 hr time format:");
try{
    s= a.nextInt();
    a.nextLine();
    }catch(InputMismatchException aa){
        System.out.println("Invalid Input");
        break;
    }
    
    
    if(s>=60||s<0){
        System.out.println("Invalid Input");
        break;
    }
        
        
        
        
        
        
    System.out.println("Enter AM/PM:");
    String ss = a.nextLine();
    
    if(!ss.equals("AM")&&!ss.equals("PM")){
        System.out.println("Invalid Input");
        break;
    }
    
    
    if(ss.equals("PM")){
        h = h+12;
    }
    
    if (h==12){h = 0;}
    String sh = df.format(h);
    String sm = df.format(m);
    String sss = df.format(s);
    
    
    
    
    String ans = sh+":"+sm+":"+sss;
    
    if (ans.equals("24:00:00")){
        System.out.println("12:00:00");
    }else if(ans.equals("24:59:59")){
        System.out.println("12:59:59");
    
    }else{
    System.out.println(ans);
    }
    
    
    
    
    
    
    
    
    break;
    }
  } 
}