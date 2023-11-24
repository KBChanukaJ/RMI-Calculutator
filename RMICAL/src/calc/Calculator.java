package calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public int  Add(int x , int y) throws RemoteException;
    public int Sub(int x , int y) throws RemoteException;
    public int Div(int x , int y) throws  RemoteException;
    public int Multi(int x , int y) throws  RemoteException;
}
