/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amit Chandra Sarkar
 */
 class Student{
    private String Name;
    private String Dept;
    private String ID;
    private float GPA;
    private String Semester;
    Student(String name,String id,String Dept){
        this.Name=name;
        this.ID=id;
        this.Dept=Dept;
    }
    public void inputInfo(float gpa,String curr_Sem){
        this.GPA=gpa;
        this.Semester=curr_Sem;
    }
    public void displayInfo(){
        System.out.println("********************\nStudents Info\n*************************************");
        System.out.println(" Name                    :   "+Name);
        System.out.println(" ID                      :   "+ID);
        System.out.println(" Dept. Name              :   "+Dept);
        System.out.println(" Previous Semester's GPA :   "+GPA );
        System.out.println(" Current Semester        :   "+Semester);
    } 
    
}
public class Students{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1=new Student("Amit", "143-23-4323", "CSE");
        st1.inputInfo(3.79f, "Third");
        Student st2=new Student("Rasel", "143-23-3222", "CSE");
        st2.inputInfo(3.99f, "Third");       
        Student st3=new Student("Tokan", "143-23-5223", "EEE");
        st3.inputInfo(3.39f, "Third");
        
        st1.displayInfo();
        st2.displayInfo();
        st3.displayInfo();
        
    }
    
}
