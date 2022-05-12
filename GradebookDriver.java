import java.util.Scanner;
public class GradebookDriver{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String choice;

    Gradebook gb = new Gradebook();

    String GPA = String.valueOf(gb.GPA);  
    String grade = String.valueOf(gb.grade); 
    
    System.out.printf("Enter student name.");
    String getname = input.nextLine();

    System.out.printf("Enter the grade within the range of 100-0.");
    double setgrade = input.nextDouble();
    
    System.out.printf("Enter the GPA.");
    double setGPA = input.nextDouble();

    while (setgrade > 0){
        double resultCounter = 0;
        double result =+ setgrade;
        ++resultCounter;
    }

    System.out.printf("Your name is %s%n", gb.getName());
    System.out.printf("Your GPA is %s%n", gb.getGPA());
    System.out.printf("Your grade is %s%n", gb.getGrade());

    //Possible way to enter more options
    System.out.println("Do you wish to continue? Y/N");
        choice = input.next();
        while(choice.equals("y")|| choice.equals ("Y"));

    }
}