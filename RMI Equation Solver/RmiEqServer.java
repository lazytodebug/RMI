import java.rmi.*;
import java.rmi.registry.*; public class RmiEqServer
{
public static void main(String args[])
{

try
{
RmiEqImpl stub =new RmiEqImpl();
Naming.rebind(&quot;rmi://localhost:1099/EqSol ver&quot;,stub); //It binds the remote object
to the new name.
}
catch(Exception e)
{
System.out.println(e);
}
}
}
