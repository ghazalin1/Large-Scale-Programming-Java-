import java.rmi.RemoteException;

public class RmiServerImplement implements RmiInterface{

	@Override
	public String hello() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello RMI...";
	}
	
	@Override
	public boolean isPrime(int n) throws RemoteException {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	@Override
	public int findAvg(int a, int b, int c ) throws RemoteException {
		
		// TODO Auto-generated method stub
		return (a + b + c) / 3;
	}
		 

}

