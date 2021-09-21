import java.util.*;


class Main {  
  public static void main(String args[]) { 
    System.out.println("enter 100 integers:"); 
    int[] a= new int[100];
    Scanner scan = new Scanner(System.in);
 
    for(int b = 0;b<a.length;b++){
        boolean t = false;
        while(t == false){
        try{
            a[b] = Integer.parseInt(scan.nextLine());
            
            t = true;
            
        }catch(NumberFormatException aa){
            System.out.println("not an integer");
            
        }
        
        }

    }
    
    
    for(int b = 99;b>=0;b--){
	
        System.out.println(a[b]);
    }
  } 
}