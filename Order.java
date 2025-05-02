public class Order{
public String getOrderDetails(String resturantName,String foodItem,int quality){
return "Restaurant Name:" + resturantName + "\nFood Item:" + foodItem + "\nQuality"+ quality;
}




















public static void main(String [] args){
Order order=new Order();
String result =order.getOrderDetails("Spcial Garden","Paneer Butter Masala",2);
System.out.println(result);
String result1=order.getOrderDetails("Spcial Garden","Chicken Biryani",1);
System.out.println(result1);

}
}