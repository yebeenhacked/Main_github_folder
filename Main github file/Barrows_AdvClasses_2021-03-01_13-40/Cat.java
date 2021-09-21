class Cat{

 Cat(String n){
    this.species = "Cat";
    this.name = n;
     
 }

String species;
String name;





void MakeSound(){
    System.out.println("Meow");
}
void PrintName(){
    System.out.println(name);

}
void PlayFetch(){
    System.out.println("*chases ball 5 times then quits*");
}
void SeeLaser(){
    System.out.println("*cat pounces*");
}
void BeHappy(){
    System.out.println("purrrr");
    SeeLaser();
    MakeSound();
}
}

