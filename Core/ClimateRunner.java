class ClimateRunner
{
public static void main(String[] args)
{
int temp=30;
String hum="Lightly Humid";
String desc="Rainy";
String loc="Mysore";
boolean cr=true;
new Climate();
new Climate(loc);
new Climate(temp,hum);
new Climate(cr);
new Climate(temp,desc);
new Climate(temp,hum,desc,loc,cr);
}
}