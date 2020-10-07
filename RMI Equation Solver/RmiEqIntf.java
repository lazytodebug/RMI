import java.rmi.*; import java.util.*;

public interface RmiEqIntf extends Remote
{
public void setValue(int a, int b) throws RemoteException;
public int getAns() throws RemoteException;
}
