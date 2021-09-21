class Dog{

 Dog(String n , boolean tail){
    this.species = "Dog";
    this.name = n;
    this.dockedTail = tail; 
 }

String species;
String name;
boolean dockedTail;




void MakeSound(){
    System.out.println("Woof");
}
void PrintName(){
    System.out.println(name);

}
void PlayFetch(){
    System.out.println("*chases ball 5 times then quits*");
}
boolean GetDockedTail(){
    return dockedTail;
}
}
