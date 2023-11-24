package calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class MyCal extends UnicastRemoteObject implements Calculator{
    public MyCal() throws RemoteException {
    }

    Scanner scanner = new Scanner(System.in);


    @Override
    public int Add(int x, int y) throws RemoteException {
        return x + y;
    }

    @Override
    public int Sub(int x, int y) throws RemoteException {
        return x - y;
    }

    @Override
    public int Div(int x, int y) throws RemoteException {
        return x / y;
    }

    @Override
    public int Multi(int x, int y) throws RemoteException {
        return x * y;
    }
}
