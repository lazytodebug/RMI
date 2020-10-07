package calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class calculatorclient {
public static void main(String[] args) throws NotBoundException,RemoteException,
MalformedURLException {
// TODO code application logic here
Scanner sc = new Scanner(System.in);
try
{
calculatorinterface c = (calculatorinterface) Naming.lookup(&quot;//localhost:1090/Calculator&quot;);
System.out.println(&quot;client is connected to server&quot;);
System.out.println(&quot;select any option from menu&quot;);
System.out.println(&quot;1.addition \n&quot;);
System.out.println(&quot;2.Substraction \n&quot;);
System.out.println(&quot;3.Multiplication \n&quot;);
System.out.println(&quot;4.Division \n&quot;);
int choice = sc.nextInt();
int x,y;
switch(choice)
{
case 1:
{
System.out.println(&quot;enter two number&quot;);

x = sc.nextInt();
y = sc.nextInt();
System.out.println(&quot;result:&quot;+c.add(x, y));
}
case 2:
{
System.out.println(&quot;enter two number&quot;);
x = sc.nextInt();
y = sc.nextInt();
System.out.println(&quot;result:&quot;+c.sub(x, y));
}
case 3:
{
System.out.println(&quot;enter two number&quot;);
x = sc.nextInt();
y = sc.nextInt();
System.out.println(&quot;result:&quot;+c.mul(x, y));
}
case 4:
{
System.out.println(&quot;enter two number&quot;);
x = sc.nextInt();
y = sc.nextInt();
System.out.println(&quot;result:&quot;+c.div(x, y));
}
}
}
catch(Exception e)
{
System.out.println(e);
}

}
}
