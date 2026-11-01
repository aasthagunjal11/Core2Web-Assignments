import java.util.*;
class Doctor{
  int doctorId;
  String doctorName;
  String specialization;

  Doctor(int doctorId, String doctorName, String specialization){
	  this.doctorId = doctorId;
	  this.doctorName = doctorName;
	  this.specialization = specialization;
  }

  void consultationFees(){
       int fees = 0;

       if(specialization.equals("Cardiologist")){
          fees = 1000;
       }else if(specialization.equals("Dermatologist")){
          fees = 800;
       }else if(specialization.equals("General")){
          fees = 500;
       }else{
          System.out.println("Invalid Specialization!");
       }

       System.out.println("Doctor Id: "+doctorId);
       System.out.println("Doctor Name: "+doctorName);
       System.out.println("Specialization: "+specialization);
       System.out.println("Consultation Fees: "+fees);

  }
}

class Client{
  public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Doctor ID: ");
      int doctorId = sc.nextInt();
      System.out.print("Enter Doctor Name: ");
      String doctorName = sc.next();
      System.out.println("Specializations: Cardiologist, Dermatologist, General");
      System.out.print("Enter Specialization: ");
      String specialization = sc.next();
      Doctor doctor = new Doctor(doctorId, doctorName, specialization);
      doctor.consultationFees();
  }
}
