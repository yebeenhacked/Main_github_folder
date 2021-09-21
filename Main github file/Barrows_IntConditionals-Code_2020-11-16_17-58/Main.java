import java.util.*;
import java.text.DecimalFormat;
class Main {  
  public static void main(String args[]) { 
      DecimalFormat df = new DecimalFormat("0.00");
      Scanner a = new Scanner(System.in);
      
      while(true){
       System.out.println("Enter a Currency Type (USD,CAD,EURO):");
      String in1 = a.nextLine();
      
      if (!in1.equals("USD") && !in1.equals("CAD") && !in1.equals("EURO")){
          System.out.println("Currency type not supported");
          break;
      }
      
      System.out.println("Enter amount:");
      
      double in;
      try{
          in = a.nextDouble();
      }catch(InputMismatchException aa){
          System.out.println("Not a number");
          break;
      }
      
      
      
      System.out.println("Enter a Currency Type (USD,CAD,EURO):");
      a.nextLine();
      String in2 = a.nextLine();
      
      if (!in2.equals("USD") && !in2.equals("CAD") && !in2.equals("EURO")){
          System.out.println("Currency type not supported");
          break;
      }
      
      
     if (in1.equals("USD")){
         if(in2.equals("CAD")){
             double hold = in*1.26;
             System.out.println(df.format(hold) + " " + in2);
         }else if(in2.equals("EURO")){
             double hold = in*.81;
             System.out.println(df.format(hold) + " " + in2);
         }else{
             double hold = in;
             System.out.println(df.format(hold) + " " + in2);
         }
     }
      
      
      if (in1.equals("CAD")){
         if(in2.equals("USD")){
             double hold = (in*(100.0/126));
             System.out.println(df.format(hold) + " " + in2);
         }else if(in2.equals("EURO")){
             double hold = (in*(100.0/126))*.81;
             System.out.println(df.format(hold) + " " + in2);
         }else{
             double hold = in;
             System.out.println(df.format(hold) + " " + in2);
         }
     }
     
     if (in1.equals("EURO")){
         if(in2.equals("USD")){
             double hold = (in*(100.0/81));
             System.out.println(df.format(hold) + " " + in2);
         }else if(in2.equals("CAD")){
             double hold = (in*(100.0/81))*1.26;
             System.out.println(df.format(hold) + " " + in2);
         }else{
             double hold = in;
             System.out.println(df.format(hold) + " " + in2);
         }
     }
      
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    break;
      }   
  } 
}