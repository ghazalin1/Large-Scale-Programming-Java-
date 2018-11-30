

import java.lang.invoke.MethodHandles.Lookup;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {

	public static void main(String[] args) {
		try {
			
			Registry reg= LocateRegistry.getRegistry(args[0]);
			
			
			RmiInterface rmi= (RmiInterface)reg.lookup(args[1]);
			
            String met=args[2];
			
			
			if(met.equalsIgnoreCase("isPrime")) {
			int n = Integer.parseInt(args[3]);
			
			System.out.println(rmi.isPrime(n));
			}	
			
			
			else if(met.equalsIgnoreCase("findAvg")) {
				int a = Integer.parseInt(args[3 ]);
				int b = Integer.parseInt(args[4 ]);
				int c = Integer.parseInt(args[5 ]);
				System.out.println(rmi.findAvg(a, b, c));
			}
			
		}   catch (Exception e) {

	}
	}
}


