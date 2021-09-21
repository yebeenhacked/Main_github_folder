import java.util.*;

class Main {  
  public static void main(String args[]) { 
  Scanner a = new Scanner(System.in);
  
  int input=0;
  int t = 0;
  int aa,bb,cc;
  aa=0;
  bb=0;
  cc=0;
  while(true){
      t++;
  //////////////try
  try{
      System.out.println("Enter a digit:");
  input = a.nextInt();
  }catch(InputMismatchException aaa){
     System.out.println("Not a digit");
  }
  a.nextLine();
  //////////////try
  if (input>=10 || input<0){
      System.out.println("Not a digit");
  }else{
      
      cc =bb;
      bb = aa;
      aa = input;
      
      
      
      if(aa==7 && bb==1 && cc==1){
          break;
      }
      
      
      
      
      
      
  }
  
  
  
  
  
  
  /// 3 eng
  
  }
  
  System.out.println("Congratulations!");
  
  
  
  
  
  
  
  
   
}
}