import chn.util. *;
public class GPAcalculator
{
    public static void main(String[] args)
    {
        ConsoleIO input = new ConsoleIO();
        
        System.out.println("Student's name:");
        String name = input.readLine();
        System.out.println(name);
        
        System.out.print("Student's ID:");
        String ID = input.readLine();
        
        GPA testing = new GPA(name, ID);
        
            
            System.out.print("Enter grade:");
            int grade = input.readInt();
            testing.addGrade(grade);
        
            System.out.println("GPA: " + testing.getGPA());
        
        
    }
    
    
}