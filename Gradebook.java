import java.util.ArrayList;
public class Gradebook {
    public String name;
    public double grade, GPA;
    Gradebook(){
        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<Double> doubleList = new ArrayList<Double>();
    }

    //constructor for name
    public Gradebook(String name){
        this.name = name;
    }
    //sets a name
    public void setName(String name){
        this.name = name;
    }
    //returns a name
    public String getName(){
        return name;
    }
    //Constructor for Grade
    public void grade(double grade){
        this.grade = grade;
    }
    //Set the grade
    public void setGrade(double grade){
        this.grade = grade;
    }
    //Get the Grade
    public Double getGrade(){
        return grade; //Return the Grade
    }

    public void GPA(double GPA){
        this.GPA = GPA;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }
}