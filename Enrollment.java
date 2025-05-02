public class Enrollment{
public String getEnrollmentInfo(String platform,String course,String student){
return "platform:"+platform+"\nCourse:"+course+"\nStudent:"+student;
}






public static void main(String [] args){
Enrollment enrollment=new Enrollment();
String result =enrollment.getEnrollmentInfo("Udemy","Java programming","Alice");
System.out.println(result);
String result1=enrollment.getEnrollmentInfo("Udemy","Webtechnology","Bob");
System.out.println(result1);
}
}
