package server;

import calc.Calculator;
import calc.MyCal;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            Registry myReg = LocateRegistry.createRegistry(54321);
            Calculator mycal = new MyCal();

            myReg.rebind("MYCAL", mycal);
            System.out.println("Server is Running");

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
