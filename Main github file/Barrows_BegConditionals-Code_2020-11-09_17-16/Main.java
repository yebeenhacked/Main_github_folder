import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner a = new Scanner(System.in);
System.out.println("Enter a score:");
    int input = a.nextInt();
    
    if(input >= 93){
        System.out.println("Your grade: A");
    }else if(input>=90){
        System.out.println("Your grade: A-");
    }else if(input>=87){
        System.out.println("Your grade: B+");
    }else if(input>=83){
        System.out.println("Your grade: B");
    }else if(input>=80){
        System.out.println("Your grade: B-");
    }else if(input>=77){
        System.out.println("Your grade: C+");
    }else if(input>=73){
        System.out.println("Your grade: C");
    }else if(input>=70){
        System.out.println("Your grade: C-");
    }else if(input>=67){
        System.out.println("Your grade: D+");
    }else if(input>=63){
        System.out.println("Your grade: D");
    }else if(input>=60){
        System.out.println("Your grade: D-");
    }else{
        System.out.println("Your grade: E");
    }    
        
    
        
        
        
        
        
        
    
    
    
    
    
      } 
}