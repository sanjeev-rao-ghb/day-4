public class Faculty{
public void showFacultyDetails(String universityName,String facultyName,String department){
System.out.println("University name"+universityName);
System.out.println("Faculty name"+facultyName);
System.out.println("department"+department);
}








public static void main(String [] args){
Faculty faculty=new Faculty();
faculty.showFacultyDetails("Standford University","Dr.Robert Borwn","Computer Science");
faculty.showFacultyDetails("Standford Universiy","Dr.Lisa Green","Physics");
}
}
