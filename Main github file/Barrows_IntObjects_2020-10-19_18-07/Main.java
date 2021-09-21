import java.util.*;
import java.util.Date;
class Main {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
  System.out.println(console.nextLine());
  System.out.println(console.next());
  System.out.println(console.nextLine());
  ArrayList<Integer> myList = new ArrayList<>();
  myList.add(12);
  System.out.println(myList.size());
  myList.add(14);
  System.out.println(myList.size());
  System.out.println(myList.get(0));
  System.out.println(myList.get(1));
  myList.set(0,5);
    System.out.println(myList.get(0));
  System.out.println(myList.get(1));
  myList.clear();
  System.out.println(myList.size());



  Date currentDate = new Date();
  Date anotherDate = new Date();

  String curDateString = currentDate.toString();
  System.out.println(curDateString);
  anotherDate.setTime(123478);
  boolean isBefore = currentDate.before(anotherDate);
  System.out.println(isBefore);
  }
}