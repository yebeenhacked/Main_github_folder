class Garfield{

 Garfield(){
    this.species = "Cat";
    this.name = "Garfield";
     
 }

String species;
String name;

void MakeSound(){
    System.out.println("mmmm,  lasagna");
}
void PrintName(){
    System.out.println(name);

}
void PlayFetch(){
    System.out.println("*chases ball 5 times then quits*");
}
void SeeLaser(){
    BeHappy();
}
void BeHappy(){
    
    LayOnLap();
    System.out.println("*takes a nap*");
}
void LayOnLap(){
    System.out.println("*cuddles on owner's lap*");
}

}
