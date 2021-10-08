public class AllRunnerDM
{
public static void main(String[] args)
{
String desc="AllRunner Class";
String mc="Manager Class";
String dc="Developer Class";
System.out.println("\n"+desc+" Executing...");
System.out.println(dc);
Developer.writeCode();
Developer.developApplication();
Developer.compile();
Developer.run();
Developer.debug();
Developer.test();
System.out.println("\n"+mc);
Manager.meeting();
Manager.monitor();
Manager.planning();
Manager.organizing();
Manager.decideSal();
}
}