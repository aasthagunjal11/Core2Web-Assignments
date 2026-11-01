import java.util.*;

class Course{
   String courseName;
   int duration;

   Course(String courseName, int duration){
      this.courseName = courseName;
      this.duration = duration;
   }

   void displayCourse(){
      System.out.println("Course Name: "+courseName);
      System.out.println("Duration: "+duration);
   }
}

class OnlineCourse extends Course{
    String platform;
    OnlineCourse(String courseName, int duration, String platform){
         super(courseName, duration);
	 this.platform = platform;
    }

    void displayFullCourseInfo(){
       displayCourse();
       System.out.println("Platform: "+platform);
    }
}

class Client{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Course Details: ");
     System.out.print("Enter Course Name: ");
     String courseName = sc.next();
     System.out.print("Enter Course Duration in hours: ");
     int duration = sc.nextInt(); 
     System.out.print("Enter Course Platform: ");
     String platform = sc.next();

     OnlineCourse onlineCourse = new OnlineCourse(courseName, duration, platform);
     onlineCourse.displayFullCourseInfo();


   }
}
