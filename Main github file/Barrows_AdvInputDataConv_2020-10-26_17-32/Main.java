import java.util.*;
class Main {
  public static void main(String[] args) {
    a();
  }
  
  public static void a(){
    Scanner b = new Scanner(System.in);
    System.out.println("Enter your name:");
    String c = b.nextLine();

    System.out.println("Enter a number:");
    int s = b.nextInt();
    b.nextLine();
    
    System.out.println("Enter a number:");
    int ss = b.nextInt();
      b.nextLine();
    System.out.println("Enter a number:");
    int sss = b.nextInt();



    String a3 = String.format("%.1f", ((s+ss+sss)/3.0));
    
    System.out.println( c + ", your average is:"+a3);



  }
}