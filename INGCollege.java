import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.util.ArrayList;

public class INGCollege implements ActionListener 
{
    private JFrame f;
    private JPanel p1,p2;
    private JLabel Academic,nonAcademic,Course,CourseName,Duration,Level,Credit,
    Assessments,InstructorName,CourseLeader,StartDate,CompletionDate,
    nCourse,nCourseName,nDuration,nPrerequisite,nCourseLeader,nInstructorName,nStartDate,
    nCompletionDate,nExamDate;
    
    private JTextField ID,CName,Time,Assignment,Instructor,Leader,Degree,Hours,
    SDate,CDate,
    nID,nCName,nTime,nRequisite,nLeader,nInstructor,nSDate,nCDate,nEDate;
    

    private JButton Add,Register,Display,Clear,NextPage,
    nAdd,nRegister,nRemove,nDisplay,nClear,PreviousPage;
    
    private ArrayList<Course>data=new ArrayList();
    private AcademicCourse objAC;
    private NonAcademicCourse objNAC;
    
    public INGCollege()
    {
        f= new JFrame("Register Form");
        p1=new JPanel();
        p2=new JPanel();
        
          
        Academic=new JLabel("Academic Course");
        Academic.setFont(new Font("Serif",Font.BOLD,25));
        Academic.setForeground(Color.BLUE);
        Academic.setBounds(270,20,200,50);
        p1.add(Academic);
          
        Course=new JLabel("Course ID:");
        Course.setFont(new Font("Open Sans", Font.PLAIN, 20));
        Course.setBounds(20,125,100,30);
        p1.add(Course);
        
        CourseName=new JLabel("Course Name:");
        CourseName.setBounds(380,125,170,30);
        CourseName.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(CourseName);
        
        Duration=new JLabel("Duration:");
        Duration.setBounds(20,175,170,30);
        Duration.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(Duration);
        
        Assessments=new JLabel("Assessments:");
        Assessments.setBounds(380,175,170,30);
        Assessments.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(Assessments);
        
        Level=new JLabel("Level:");
        Level.setBounds(20,225,120,30);
        Level.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(Level);
        
        Credit=new JLabel("Credit:");
        Credit.setBounds(380,225,120,30);
        Credit.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(Credit);
        
        CourseLeader=new JLabel("Course Leader:");
        CourseLeader.setBounds(20,350,170,30);
        CourseLeader.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(CourseLeader);
        
        InstructorName=new JLabel("Instructor Name:");
        InstructorName.setBounds(380,350,170,30);
        InstructorName.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(InstructorName);
        
        StartDate=new JLabel("Start Date:");
        StartDate.setBounds(20,400,120,30);
        StartDate.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(StartDate);
        
        CompletionDate=new JLabel("Completion Date:");
        CompletionDate.setBounds(380,400,170,30);
        CompletionDate.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p1.add(CompletionDate);
        
        nonAcademic=new JLabel("Non-Academic Course");
        nonAcademic.setFont(new Font("Serif",Font.BOLD,25));
        nonAcademic.setForeground(Color.BLUE);
        nonAcademic.setBounds(280,20,250,50);
        p2.add(nonAcademic);
        
        nCourse=new JLabel("Course ID:");
        nCourse.setBounds(20,125,170,30);
        nCourse.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nCourse);
        
        nCourseName=new JLabel("Course Name:");
        nCourseName.setBounds(380,125,170,30);
        nCourseName.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nCourseName);
        
        nDuration=new JLabel("Duration:");
        nDuration.setBounds(20,175,170,30);
        nDuration.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nDuration);

        nPrerequisite=new JLabel("Prerequisite:");
        nPrerequisite.setBounds(380,175,170,30);
        nPrerequisite.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nPrerequisite);
        
        nCourseLeader=new JLabel("Course Leader:");
        nCourseLeader.setBounds(20,325,170,30);
        nCourseLeader.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nCourseLeader);
        
        nInstructorName=new JLabel("Instructor Name:");
        nInstructorName.setBounds(380,325,170,30);
        nInstructorName.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nInstructorName);
        
        nStartDate=new JLabel("Start Date:");
        nStartDate.setBounds(20,375,170,30);
        nStartDate.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nStartDate);
        
        nCompletionDate=new JLabel("Completion Date:");
        nCompletionDate.setBounds(380,375,170,30);
        nCompletionDate.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nCompletionDate);
        
        nExamDate=new JLabel("Exam Date:");
        nExamDate.setBounds(20,425,170,30);
        nExamDate.setFont(new Font("Open Sans", Font.PLAIN, 20));
        p2.add(nExamDate);
        
   //creating Textfield for Academic Course     
        ID=new JTextField();
        ID.setBounds(170,125,150,30);
        p1.add(ID);
        
        CName=new JTextField();
        CName.setBounds(550,125,150,30);
        p1.add(CName);
        
        Time=new JTextField();
        Time.setBounds(170,175,150,30);
        p1.add(Time);
        
        Assignment=new JTextField();
        Assignment.setBounds(550,175,150,30);
        p1.add(Assignment);
        
        Degree=new JTextField();
        Degree.setBounds(170,225,150,30);
        p1.add(Degree);
              
        Hours=new JTextField();
        Hours.setBounds(550,225,150,30);
        p1.add(Hours);
        
        Leader=new JTextField();
        Leader.setBounds(170,350,150,30);
        p1.add(Leader);
        
        Instructor=new JTextField();
        Instructor.setBounds(550,350,150,30);
        p1.add(Instructor);
        
        SDate=new JTextField();
        SDate.setBounds(170,400,150,30);
        p1.add(SDate);
        
        CDate=new JTextField();
        CDate.setBounds(550,400,150,30);
        p1.add(CDate);
        
    //Creating textfield for Non Academic Course    
        nID=new JTextField();
        nID.setBounds(170,125,150,30);
        p2.add(nID);
        
        nCName=new JTextField();
        nCName.setBounds(550,125,150,30);
        p2.add(nCName);
        
        nTime=new JTextField();
        nTime.setBounds(170,175,150,30);
        p2.add(nTime);
        
        nRequisite=new JTextField();
        nRequisite.setBounds(550,175,150,30);
        p2.add(nRequisite);
        
        nLeader=new JTextField();
        nLeader.setBounds(170,325,150,30);
        p2.add(nLeader);
        
        nInstructor=new JTextField();
        nInstructor.setBounds(550,325,150,30);
        p2.add(nInstructor);
        
        nSDate=new JTextField();
        nSDate.setBounds(170,375,150,30);
        p2.add(nSDate);
        
        nCDate=new JTextField();
        nCDate.setBounds(550,375,150,30);
        p2.add(nCDate);
    
        nEDate=new JTextField();
        nEDate.setBounds(170,425,150,30);
        p2.add(nEDate);
        
    //Creating button for Academic Course    
        nAdd=new JButton("Add");
        nAdd.setBounds(565,250,120,30);
        nAdd.setFont(new Font("Serif",Font.BOLD,15));
        p2.add(nAdd);
        nAdd.addActionListener(this);
        
        Add=new JButton("Add");
        Add.setBounds(565,285,120,30);
        Add.setFont(new Font("Serif", Font.PLAIN, 15));
        p1.add(Add);
        Add.addActionListener(this);
        
        Register=new JButton("Register");
        Register.setBounds(320,470,120,30);
        Register.setFont(new Font("Serif",Font.BOLD,15));
        p1.add(Register);
        Register.addActionListener(this);
        
        Display=new JButton("Display");
        Display.setBounds(250,510,120,30);
        Display.setFont(new Font("Serif",Font.BOLD,15));
        p1.add(Display);
        Display.addActionListener(this);
        
        Clear=new JButton("Clear");
        Clear.setBounds(390,510,120,30);
        Clear.setFont(new Font("Serif",Font.BOLD,15));
        p1.add(Clear);
        Clear.addActionListener(this);
        
        NextPage= new JButton("Non-Academic Course");
        NextPage.setBounds(550,575,150,30);
        NextPage.setFont(new Font("Serif",Font.BOLD,15));
        p1.add(NextPage);
        NextPage.addActionListener(this);
        
        nRegister=new JButton("Register");
        nRegister.setBounds(230,470,120,30);
        nRegister.setFont(new Font("Serif",Font.BOLD,15));
        p2.add(nRegister);
        nRegister.addActionListener(this);
        
        nRemove=new JButton("Remove");
        nRemove.setBounds(370,470,120,30);
        nRemove.setFont(new Font("Serif",Font.BOLD,15));
        p2.add(nRemove);
        nRemove.addActionListener(this);
        
        nDisplay=new JButton("Display");
        nDisplay.setBounds(230,500,120,30);
        nDisplay.setFont(new Font("Serif",Font.BOLD,15));
        p2.add(nDisplay);
        nDisplay.addActionListener(this);
        
        nClear=new JButton("Clear");
        nClear.setBounds(370,500,120,30);
        nClear.setFont(new Font("Serif",Font.BOLD,15));
        p2.add(nClear);
        nClear.addActionListener(this);
        
        PreviousPage=new JButton("Academic Course");
        PreviousPage.setBounds(550,575,150,30);
        PreviousPage.setFont(new Font("Serif",Font.BOLD,15));
        p2.add(PreviousPage);
        PreviousPage.addActionListener(this);
        
        
        p1.setSize(750,700);
        p1.setLayout(null);
        p1.setVisible(true);
        p2.setSize(750,700);
        p2.setLayout(null);
        f.setLayout(null);
        f.setSize(750,700);
        f.setVisible(true);
        f.add(p1);
        
        
        
        
    } 
  public void actionPerformed(ActionEvent A)
    {
        if (e.getSource()==NextPage)
        {
            p1.setVisible(false);
            p2.setVisible(true);
            f.add(p2);
        }
            else if (e.getSource()==PreviousPage)
         {
          p1.setVisible(true);
          p2.setVisible(false);
          
         }
            if(A.getSource()==Add)
            
               String CourseID= "";
               String CourseName= "";
                int Duration= 0;
                int NumberOfAssessment= 0;
                String Level= "";
                String Credit="";
                try
                {
                    CourseID= ID.getText();
                    CourseName= CName.getText();
                    Duration= Integer.parseInt(Time.getText());
                    NumberOfAssessment = Integer.parseInt(Assignment.getText());
                    Level= Degree.getText();
                    Credit= Hours.getText();
                    boolean newAC = false;
                    for (Course C:data)
                    
            {
                if (C.getCourseID().equals(CourseID))
                {
                    newAC= true;
                }
            }
            if (newAC= false)
            {
                AC= new AcademicCourse(CourseID,Coursename,Duration,NumberOfAssessment,Level,Credit);
                data.add(AC);
                JOptionPane.showMessageDialog(f,"Academic Course is added.");
            }
            else
            {
                JOptionPane.showMessageDialog(f,"Academic Course exist already.");
            }
            }
            catch(Exception e)
            {
                  JOptionPane.showMessageDialog(p1,"Enter the correct values!");  
            }
            }
            else if (A.getSource()==nAdd)
            {
                String CourseID="";
                String CourseName="";
                int Duration=0;
                String Prerequisite="";
                try
            {
                CourseID= nID.getText();
                CourseName= nCourseName.getText();
                Duration= Integer.parseInt(nTime.getText());
                Prerequisite= nRequisite.getText();
                boolean newNAC = false;
                for (course C:data)
                {
                    if(C.getCourseID().equals(CourseID))
                    {
                        SameNAC = true;
                    }
                }
                if (newNAC == false)
                {
                    NAC = new NonAcademicCourse(CourseID,CourseName,Prerequisite, Duration);
                    data.add(data);
                    JOptionPane.showMessageDialog(f,"Non-Academic Course is added");
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"The Non Academic Course already exist.");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(f,"Enter the correct statement.");
            }
        }
             else if (A.getSource()==Register)
             {
                 String CourseID="";
                 String CourseLeader="";
                 //String LecturerName="";
                 String StartingDate="";
                 String CompletionDate="";
                 try
                 {
                     CourseID= ID.getText();
                     CourseLeader= Leader.getText();
                     Startdate= SDate.getText();
                     CompletionDate= CDate.getText();
                     boolean newAC1 = false;
                     for (Course CO:data)
                     {
                         if (CO.getCourseID().equals(CourseID))
                         {
                             newAC1 = true;
                             if (CO instanceof AcademicCourse)
                             {
                                 AC= (AcademicCourse) CO;
                                 if (AC.getisRegistered()==true)
                                 {
                                     JOptionPane.showMessageDialog(f,"Academic Course already exist.");
                                 }
                                 else
                                 {
                                     AC.Register(CourseLeader, LecturerName,Startdate,CompletionDate);
                                     JOptionPane.showMessageDialog(f,"The Academic Course is registered.");
                                 }
                             }
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(f,"The Course ID do not match.");
                         }
                     }
                 }
                 catch (Expection E)
                 {
                     JOptionPane.showMessageDialog(p1,"Fill the form in correct manner.");
                 }
             }
             else if (A.getSource()==nRegister)
             {
                 String CourseID= "";
                 String CourseLeader= "";
                 String InstructorName= "";
                 String Startdate= "";
                 String CompletionDate= "";
                 String ExamDate= "";
                 try
                 {
                     CourseID= nID.getText();
                     CourseLeader= nLeader.getText();
                     InstructorName= nInstructor.getText();
                     Startdate= nSDate.getText();
                     CompletionDate= nCDate.getText();
                     ExamDate= nEDate.getText();
                     boolean newNAC1 = false;
                     for (Course CO:data)
                     {
                         if (CO.getCourseID().equals(CourseID))
                         {
                             newNAC1 = true;
                             if (CO instanceof NonAcademicCourse)
                             {
                                 NAC = (NonAcademicCourse)CO;
                                 if (NAC.getisRegistered()==true)
                                 {
                                     JOptionPane.showMessageDialog(f,"Non Academic Course exist already.");
                                 }
                                 else
                                 {
                                     NAC.Register(CourseLeader, InstructorName,Startdate, CompletionDate, ExamDate);
                                     JOptionPane.showMessageDialog(f,"The Non Academic Course is now registered.");
                                 }
                             }
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(f,"The CourseID do not match.");
                             break;
                         }
                     }
                 }
                 catch (Exception e)
                 {
                     JOptionPane.showMessageDialog(f,"Fill the form in correct manner.");
                 }
             }
             else if (A.getSource()==Remove)
             {
                 String CourseID = ID.getText();
                 try {
                     for(Course C:data){
                         if (C.getCourseID().equals(CourseID))
                         {
                             if(C instanceof NonAcademicCourse)
                             {
                                 NAC= (NonAcademicCourse) C;
                                 if(NAC.getisRemoved()==false)
                                 {
                                     NAC.Remove();
                                     JOptionPane.showMessageDialog(f,"The Course is removed.");
                                 }
                                 else if (NAC.getisRemoved()==true)
                                 {
                                     JOptionPane.showMessageDialog(f,"The Course has already been removed.");
                                 }
                             }
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(f,"Enter valid CourseID");
                             break;
                         }
                     }
                 }
                 catch (Exception e)
                 {
                     JOptionPane.showMessageDialog(f,"Please fill the form in correct manner.");
                 }
             }
             else if (A.getSource()==Display)
             {
                 for (Course CO:data)
                 {
                     if(CO instanceof AcademicCourse)
                     {
                         AcademicCourse AC = (AcademicCourse)CO;
                         AC.Display();
                     }
                 }
             }
             else if (A.getSource()==nDisplay)
             {
                 for(Course CO:data)
                 {
                     if (CO instanceof NonAcademicCourse)
                     {
                         NonAcademicCourse NAC = (NonAcademicCourse)CO;
                         NAC.Display();
                     }
                 }
             }
             else if (A.getSource()==Clear)
             {
                 ID.setText("");
                 CName.setText("");
                 Time.setText("");
                 Assignment.setText("");
                 Instructor.setText("");
                 Leader.setText("");
                 Degree.setText("");
                 Hours.setText("");
                 SDate.setText("");
                 CDate.setText("");
             }
             else if (A.getSource()==nClear)
             {
                 nID.setText("");
                 nCName.setText("");
                 nTime.setText("");
                 nInstructor.setText("");
                 nRequisite.setText("");
                 nLeader.setText("");
                 nSDate.setText("");
                 nCDate.setText("");
                 nEDate.setText("");
             }
            }
    public static void main(String args[])
    {
        new INGCollege();
    }
}
}