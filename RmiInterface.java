

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  RmiInterface extends Remote {
	
	public String hello()throws RemoteException;
	
	public boolean isPrime(int n) throws RemoteException;
	public int findAvg(int a , int b, int c) throws RemoteException;

}
