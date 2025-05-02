public class Ticket{
public String getTicketInfo(String theaterName,String movieName,String seatNo){
return "Theater Name:"+ theaterName +"\nmovie Name:" +movieName +"\nSeat No:" +seatNo;
}









public static void main(String[]args){
Ticket ticket=new Ticket();
String result =ticket.getTicketInfo("Galaxy Cinama","Intersteller","A10");
System.out.println(result);
String result1 =ticket.getTicketInfo("Galaxy Cinama","Inception","B12");
System.out.println(result1);
}
}