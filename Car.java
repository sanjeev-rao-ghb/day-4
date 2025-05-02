public class Car{
public void displayDetails(String showroomName,String modalName,int price){
System.out.println("Showroom name"+showroomName);
System.out.println("Car model"+modalName);
System.out.println("price"+ price);
}




public static void main(String [] args){
Car car=new Car();
car.displayDetails("Elite Motors", "Tesla Model" ,75000);
}
}