
public class Main{
  public static void main(String[] args) {
    AnswerPrinter(12);
    AnswerPrinter(12.5);
    AnswerPrinter("What do you get from a pampered cow?");
    AnswerPrinter(-2);
    AnswerPrinter(6.2);
    AnswerPrinter("Spoiled milk");
    PrinterChecker("bob", 4, 2.5);
    FindRectangleArea(3, 5);
    FindTriangleArea(4, 6);
    FindRectanglePerimeter(3, 5);
    FindTrianglePerimeter(4, 6, 7);
    FindRectangleArea(42.5, 20);
    FindRectangleArea(41, 16.6);
    FindRectanglePerimeter(22, 35.25);
    FindTrianglePerimeter(44.5, 20, 22.25);



  }




// answer
  public static void AnswerPrinter(String a){
    System.out.println("the word is: "+ a);
  }
  
  public static void AnswerPrinter(double a){
    System.out.println("the number is: "+ a);
  }
  
  public static void AnswerPrinter(int a){
    System.out.println("the number is: "+ a);
  }
  
  public static double  FindRectangleArea(double a, double b){
      AnswerPrinter(a*b);
      return a*b;
  }

  public static double FindTriangleArea(double a, double b){
  AnswerPrinter((a*b)/2);
  return (a*b)/2;
  }

  public static double FindRectanglePerimeter(double a,double b){
    AnswerPrinter(a*2 + b*2);
    return a*2 + b*2;
  }  

  public static double FindTrianglePerimeter(double a , double b, double c){  
  AnswerPrinter(a+b+c); 
  return a+b+c;
  }

  public static void PrinterChecker(String a, int b, double c){
      AnswerPrinter(a);
      AnswerPrinter(b);
      AnswerPrinter(c);
  }
  }