import java.util.*;




class Main {  
  public static void main(String args[]) { 
    LinkedList<Double> a= new LinkedList<>();
    Scanner scan = new Scanner(System.in);
    
    
    
    
    
    while(true){
        System.out.println("Enter a number to add to the list,  when done enter: Exit");
        String hold = scan.nextLine();
        
        if(hold.equals("Exit")){
            break;
            
            
        }else{
            try{
            a.add(Double.parseDouble(hold));
            }catch(NumberFormatException aa){
                
                
            }
        }
        
        
    }
   
   
   
   
   

    double high = a.get(0);
    int highum = 0;
    int size = a.size();
    for(int ii = 0; ii<size; ii++){
    for(int i = 0;i<a.size();i++){
        if(a.get(i)<=high){
            high = a.get(i);
            highum = i;
        }
    }
    if (a.size() != 0){
    System.out.println(high);
    if (a.size() > 1){
    a.remove(highum);   
    high = a.get(0);
    }
    }
    highum = 0;
    
    }
    
    
    
    
   
    
  } 
}




/*


 Input of the failing Test 2 
10
12
40
13
13.5
13
-1.5
joe
12.5
exiting
3
Exit
*/