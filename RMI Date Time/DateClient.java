package datetimermi;
import java.rmi.*;
public class DateClient

{
public static void main(String[] args)
{
try{

IDate intf=(IDate)Naming.lookup(&quot;rmi://localhost:1099/DateServer&quot;);

System.out.println(&quot;The Date On Server is: &quot;+intf.getDate());
}
catch(Exception e){
e.printStackTrace();
}}}
