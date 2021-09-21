class Animal{
    Animal(String x,String y,String z){
        this.color = x;
        this.name = y;
        this.species = z;
        
    }
    String name;
    String color;
    String species;
    int age =0;
    
    
    void MakeSound(){
        System.out.println("Grrrrr");
    }
    
    void SetAge(int newAge){
        this.age = newAge;
        
    }
    
    void PrintDescription(){
    System.out.println(name +" is a "+age+" year old, "+color+" "+species);
    }
}