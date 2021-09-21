class Student{
    Student(String name, int id, int age){
        this.studentID = id;
        this.age = age;
        this.name = name; 
    }
    
    Student(){
    this.name = "TestStudent";
    this.studentID = -1;
    this.contentGrade = 0;
    this.workHabitGrade =0;
    this.participation =0;
    this.age = 18;
    }
    
    
    
int studentID;	
String name;
double contentGrade;
double workHabitGrade;
double participation;
int age;
    
    
    
void setContentGrade(double grade){
    this.contentGrade = grade;
}

void setWorkHabitGrade(double grade){
    this.workHabitGrade = grade;
}

void setParticipation(double grade){
    this.participation = grade;
}

double getGrade(){
    
return (.35*this.workHabitGrade + .45*this.contentGrade +.20*this.participation);
}
    
    
    
    
    
    
    
    
    
    
}