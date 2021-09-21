class OrangeTabby{

 OrangeTabby(String n){
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


void SeeLaser(){
    System.out.println("*cat pounces*");
}
void BeHappy(){
    LayOnLap();
    System.out.println("*takes a nap*");
}
void LayOnLap(){
    System.out.println("*cuddles on owner's lap*");
}
}



