class HandBagRunner
{
public static void main(String[] args)
{
String color="Black";
int price=12500;
String brand="Gucci";
String material="Genuine Leather";
String capacity="2kgs";
new HandBag();
new HandBag(color);
new HandBag(price);
new HandBag(price,brand);
new HandBag(material,capacity);
new HandBag(material,capacity,brand);
new HandBag(color,material,capacity,brand);
new HandBag(color,price,material,capacity,brand);
}
}