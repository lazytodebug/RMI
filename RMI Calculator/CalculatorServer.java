package calculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.NotBoundException;

public class calculatorserver {
public static void main(String[] args) throws RemoteException,NotBoundException
{
try
{
Registry r = java.rmi.registry.LocateRegistry.createRegistry(1090);
r.rebind(&quot;Calculator&quot;, new Calculator());
System.out.println(&quot;server is running&quot;);
}
catch(Exception e)
{
System.out.println(e);
}

}
}
