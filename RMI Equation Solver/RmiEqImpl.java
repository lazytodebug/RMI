import java.rmi.*;
import java.rmi.server.*; import java.util.*; import java.io.*;
public class RmiEqImpl extends UnicastRemoteObject implements RmiEqIntf
{
int a=0,b=0;
RmiEqImpl() throws RemoteException
{
super();
}
public void setValue(int a, int b) throws RemoteException
{
this.a = a; this.b = b;
}
public int getAns() throws RemoteException
{
return ((a*a)-(2*a*b)+(b*b));
}
}
