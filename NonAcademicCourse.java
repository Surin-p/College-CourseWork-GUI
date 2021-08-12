

public class NonAcademicCourse extends Course
{
   
   private String InstructorName; 
   private String Startdate; //initialize
   private String CompletionDate; //initialize
   private String ExamDate;       //empty 
   private String PreRequisite; //corresponding
   private boolean isRegistered;//false
   private boolean isRemoved;   //false
   
   // The constructor accepts four parameters which are the 
   // courseID, course name, duration and prerequisite. 
     
   public NonAcademicCourse(String CourseID,String CourseName, String PreRequisite,int Duration)
   {
   
    //A call is made to the superclass constructor with parameters, 
    //the courseID, course name  
       super(CourseID,CourseName,Duration);
       
       
       this.PreRequisite=PreRequisite;
       Startdate="";
       CompletionDate="";
       ExamDate="";
       isRegistered=false;
       isRemoved=false;
    }
    //A method is required to set the instructor name as 
    //changes to name of the instructor inevitably occur.
    public String getInstructorName(){
        return InstructorName;
    }
    public void setInstructorName(String newInstructorName){
    /* method  to set the instructor name 
     * as changes to name of the instructor occur.         
     * a new instructor name as a parameter and, 
    * if the non-academic course has not registered yet,      
     * the new value is assigned to the instructor name attribute. 
     * If the non-academic course is already registered, 
     * then a suitable message is output 
     * not possible to change the instructor name.
     */
        
        if (isRegistered==false)
        {
            System.out.println("The instructor name has been entered.");
        }
        else 
        {
        this.InstructorName= newInstructorName; 
        }
    }
    
    public String getStartdate(){
        return Startdate;
    }
     public String getCompletionDate(){
         return CompletionDate;
        }
        
    public String getExamDate(){
        return ExamDate;
    }
    public String getPreRequisite(){
        return PreRequisite;
    }
    public boolean getisRegistered(){
        return isRegistered;
    }
    public boolean getisRemoved(){
        return isRemoved;
    }
// The method has five parameters, the course leader name, instructor name, 
// starting date, completion date, and exam date
    public void Register(String CourseLeader,String InstructorName,String Startdate,String CompletionDate,String ExamDate)
    {
        if(isRegistered==true)
        {
             System.out.println("This non-course has been already registered.");
        }
        else
        {
            super.setCourseLeader(CourseLeader);
            this.setInstructorName(InstructorName);
            this.Startdate= Startdate;
            this.CompletionDate= CompletionDate;
            this.ExamDate= ExamDate;
            isRegistered= true;
            isRemoved= false;
        }
    }
    
    public void Remove(){
        if(isRemoved==true){
            
        System.out.println("The course is removed");
    }
        else{
            super.setCourseLeader("");
            this.InstructorName="";
            this.Startdate="";
            this.CompletionDate="";
            this.ExamDate="";
            this.isRegistered=false;
            this.isRemoved=true;
            
        }
    }
    public void display(){
        super.display();
        if(isRegistered==true){
            System.out.println("\nHere is the detail.");
            System.out.println("Instructor assigned=" +InstructorName);
            System.out.println("Starting date=" +Startdate);
            System.out.println("Completion date=" +CompletionDate);
            System.out.println("Exam Date=" +ExamDate);
            
            
        }
    }
}
