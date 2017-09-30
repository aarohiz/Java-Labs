public class GPA
{
    private String myName;
    private String myID;
    public int myTotalPoints;
    public int myNumGrades;
    public double myGPA;
   
    
    public GPA()
    {
        myName = "";
        myID = "";
        myTotalPoints = 0;
        myNumGrades = 0;
        myGPA = 0.0;
    }
    
    public GPA(String name, String ID)
    {
        myName = name;
        myID = ID;
        myTotalPoints = 0;
        myNumGrades = 0;
        myGPA = 0.0;
    }
    
    public void addGrade (int grade)
    {
        myNumGrades++;
        myTotalPoints += grade;
        myGPA = myTotalPoints/myNumGrades;
    }
    
    public double getGPA()
    {
        return myGPA;
    }
}