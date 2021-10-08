public class AllRunner
{
public static void main(String[] args)
{
System.out.println("Fetching the details from Printer Class...");
Printer.scan();
Printer.print();
System.out.println("Fetching the details from Speaker Class...");
Speaker.hear();
Speaker.play();
System.out.println("Fetching the details from Camera Class...");
Camera.capture();
Camera.open();
}
}