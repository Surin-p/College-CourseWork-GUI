

public class AcademicCourse extends Course
{
    //variables for AcadeicCourse class
    private String LecturerName; //empty
    private String Level;        
    private String Credit;
    private String StartingDate; //empty
    private String CompletionDate; //empty
    private int NumberOfAssessment;
    private boolean isRegistered;   //false
    
    
    //construction creation for Academic Course
    public AcademicCourse (String CourseID, String CourseName,int Duration, String Level, String Credit, int NumberOfAssessment)
    {  
        //A call is made to the superclass constructor
        super(CourseID,CourseName,Duration);
        //this is used to refer to the objects in the constructor
         LecturerName="";
         this.Level=Level;
         this.Credit=Credit;
         StartingDate="";
         CompletionDate="";
         this.NumberOfAssessment=NumberOfAssessment;
         isRegistered=false;
         
    }
    
    
    public String getLecturerName(){
        return LecturerName;
    }
    public void setLecturerName(String newLecturerName){
          this.LecturerName=newLecturerName;
    }
    public int getNumberOfAssessment(){
        return NumberOfAssessment;
    }
    public void setNumberOfAssessment(int newNumberOfAssessment){
        this.NumberOfAssessment=newNumberOfAssessment;
    }
    public String getLevel(){
        return Level;
    }
    public String getCredit(){
        return Credit;
    }
    public String getStartingDate(){
        return StartingDate;
    }
    public String getCompletionDate(){
        return CompletionDate;
    }
    public boolean getisRegistered(){
        return isRegistered;
    }
    
    public void Register(String CourseLeader,String LecturerName,String StartingDate,String CompletionDate)
    {
        if (isRegistered==true)
        {
        System.out.println("The course has been registered already.");
        System.out.println("Lecturer Name:" +LecturerName);
        System.out.println("Start Date" +StartingDate);
        System.out.println("Completion Date" +CompletionDate);
    }
                    
        else
        {
           super.setCourseLeader(CourseLeader); //call the superclass method
           
           this.LecturerName=LecturerName;
           this.StartingDate=StartingDate;
           this.CompletionDate=CompletionDate;
           isRegistered=true;
            
        }
    }
        public void display(){
            super.display();
            if (isRegistered==true){
                
            System.out.println("Lecturer Name =" +LecturerName);
            System.out.println("Level=" +Level);
            System.out.println("Credit=" +Credit);
            System.out.println("No of Assessment=" +NumberOfAssessment);
            System.out.println("Starting Date=" +StartingDate);
            System.out.println("Completion Date=" +CompletionDate);
            
        }
    }
}
            
        
                    
   