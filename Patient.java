public class Patient{
public void patientDetails(String hospitalName,String patientName,int age){
System.out.println("Hospital name"+hospitalName);
System.out.println("Patient name"+patientName);
System.out.println("Patient age"+age);
}






public static void main(String [] args){
Patient patient=new Patient();
patient.patientDetails("City Care Hospitals","John Doe",45);
patient.patientDetails("City Care Hospitals","Emma Watson",30);
}
}