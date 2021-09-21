public class Main{
  public static void main(String[] args) {
  int x = 0;
  System.out.println(Fibonacci(3));
  }

  public static int Fibonacci(int n){
   if(n==0){
      return 0;
    }
    if(n==1){
      return 1;
    }
   
   int x = Fibonacci(n-1) + Fibonacci(n-2);
    
   return x;
  }


  }