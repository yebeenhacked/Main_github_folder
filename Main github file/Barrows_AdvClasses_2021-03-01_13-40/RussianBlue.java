class RussianBlue{

 RussianBlue(String n){
    this.species = "Cat";
    this.name = n;
     
 }

String species;
String name;

void MakeSound(){
    System.out.println("Hisss");
}
void PrintName(){
    System.out.println(name);

}
void SeeLaser(){
    System.out.println("*cat pounces*");
}
void BeHappy(){
    System.out.println("purrrr");
    SeeLaser();
    
}

}
