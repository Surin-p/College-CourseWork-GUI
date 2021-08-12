
public class Course
{
     //Assigning variables for Course class
  private String CourseID;
  private String CourseName;
  private String CourseLeader;
  private int Duration;
  
  //Creating constructor to initialize the values
 public Course(String CourseID,String CourseName,int Duration)
 
 {
     //this is used to refer to the objects in the constructor
     this.CourseID=CourseID;
     this.CourseName=CourseName;
     this.Duration=Duration;
     this.CourseLeader="";
    }
    //using get method to read the values 
    public String getCourseID(){
        return CourseID;
    }
    
    public String getCourseName(){
        return CourseName;
    }
    
    public String getCourseLeader(){
        return CourseLeader;
    }
    
    public int getDuration(){
        return Duration;
    }
    //using set method to set the new value
    public void setCourseLeader(String Leader){
        this.CourseLeader=Leader;
    }
    //method to display the data
    public void display(){
        System.out.println("Course ID =" +CourseID);
        System.out.println("Course Name = " +CourseName);
        if (CourseLeader!="")
        {
            System.out.print("Course Leader =" +CourseLeader);
    }
}
}


