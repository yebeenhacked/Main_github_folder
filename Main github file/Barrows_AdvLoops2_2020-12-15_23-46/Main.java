import java.util.*;
import java.text.DecimalFormat;
class Main {  
    
  public static void main(String args[]) { 
    DecimalFormat df = new DecimalFormat("###.#");
    double a = -233;  
    double iii = -233;
    Scanner scan = new Scanner(System.in);  
    
    
    
    while(true){
    
    
    
    
    
    
    while(true){
    try{
        
    if(iii == -233){
    System.out.println("enter a number");    
    iii = scan.nextDouble();
    break;
    }
    }catch(InputMismatchException aa){
        System.out.println("not a number");
    }
    scan.nextLine();
    }
    
    while(true){
    try{
        
    if(a == -233){
    System.out.println("enter a number");    
    a = scan.nextDouble();
    break;
    }
    }catch(InputMismatchException aa){
        System.out.println("not a number");
    }
    scan.nextLine();
    }
    
    
    
    
  
    if(iii<=a){   
   for(int i = (int) Math.ceil(iii); i<=a;i++){
    isPrime(i);
   }
    }else{
        for(int i = (int) Math.ceil(a); i<=iii;i++){
    isPrime(i);
   } 
        
    }
  
    
    
    
   

    break;
    
    
    
    
    
    
    //
    
    
    
    
    
    
    
    }
    
    
    
  } 
  public static void isPrime(double n){ 
      DecimalFormat df = new DecimalFormat("###.#");
      int holdval = (int)n;
    switch(holdval){
        case 1:
            
        case 2:
            if(
            
            n/3  != Math.round(n/3) &&
            n/5  != Math.round(n/5) &&
            n/7  != Math.round(n/7) &&
            n/11  != Math.round(n/11) &&
            test(n)
            
            
            ){
                if(n != 1){                 System.out.println(df.format(n));                 }
            }
        break;
    
        case 3:
            if(
            
            n/2  != Math.round(n/2) &&
            n/5  != Math.round(n/5) &&
            n/7  != Math.round(n/7) &&
            n/11  != Math.round(n/11) &&
            test(n)
            
            
            ){
                if(n != 1){                 System.out.println(df.format(n));                 }
            }
        break;
        
        case 5:
            if(
            
            n/3  != Math.round(n/3) &&
            n/2  != Math.round(n/2) &&
            n/7  != Math.round(n/7) &&
            n/11  != Math.round(n/11) &&
            test(n)
            
            
            ){
                if(n != 1){                 System.out.println(df.format(n));                 }
            }
        break;
        
        case 7:
            if(
            
            n/3  != Math.round(n/3) &&
            n/5  != Math.round(n/5) &&
            n/2  != Math.round(n/2) &&
            n/11  != Math.round(n/11) &&
            test(n)
            
            
            ){
                if(n != 1){                 System.out.println(df.format(n));                 }
            }
        break;
        
        case 11:
            if(
            
            n/3  != Math.round(n/3) &&
            n/5  != Math.round(n/5) &&
            n/7  != Math.round(n/7) &&
            n/2  != Math.round(n/2) &&
            test(n)
            
            
            ){
                if(n != 1){                 
                    System.out.println(df.format(n));                 }
            }
        break;
        
        default:
        if(
            n/11 != Math.round(n/11)&&
            n/3  != Math.round(n/3) &&
            n/5  != Math.round(n/5) &&
            n/7  != Math.round(n/7) &&
            n/2  != Math.round(n/2) &&
            test(n)
            
            
            ){
                if(n != 1){
                System.out.println(df.format(n));
                }
            }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       
        
        
        
        
        
    
    } 
    
    
    
    public static boolean test(double a){
        boolean b;
        if(a>0){
             b =   true;
        }else{
             b = false;
        }
        return b;
        
    }
}