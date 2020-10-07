import java.net.*; import java.io.*; import java.util.*;
import java.rmi.registry.*; import java.rmi.*;

public class RmiEqClient {
public static void main(String args[]) throws Exception
{
Scanner sc = new Scanner(System.in); try{
int a =0,b=0;

RmiEqIntf stub
=(RmiEqIntf)Naming.lookup(&quot;rmi://localho st:1099/EqSolver&quot;);
System.out.println(&quot;\n\nSolving Equation : (a-b)^2 = a^2 - 2*a*b + b^2&quot;);
System.out.println(&quot;\nEnter value of a and b
: \n&quot;);
a = sc.nextInt(); b = sc.nextInt();

stub.setValue(a,b);

System.out.println(&quot;Calling Server to solve the equation ...&quot;);
System.out.println(&quot;Answer : &quot;+stub.getAns());
}
catch(Exception e){ System.out.println(e);
}
}
}
