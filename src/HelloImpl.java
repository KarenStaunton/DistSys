/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karen
 */
import java.rmi.Naming; // this will help us invoke the method on the RM
import java.rmi.RemoteException; // m ay be calling a method that could throw an remote exception
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	public HelloImpl() throws RemoteException { //constructor
		
	}
	
	public String sayHello(){  // this is the method that we mention in the interface being implemented. This essentially returns the text "hello wolrd"
		
		
		return "Hello world!"; 
	}

	public static void main(String args[]){ 
		
		startRegistry();  // 
		
		try {
		
			HelloImpl obj = new HelloImpl(); // instantiate the HelloImpl class. call this instance of the object as obj
			
			// Bind this object instance to the name "HelloServer"
			Naming.rebind("HelloServer", obj); 
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	private static void startRegistry() {
		
		try {			
			
			LocateRegistry.createRegistry(1099); // WHAT IS THIS EXACTLY
		
			System.out.println("RMI registry is ready ..."); // This will print that the regstry is running
			
		}catch (Exception e) {
			System.out.println("Exception starting RMI Registry " + e.getMessage()); // if there is a problem this error will be thrown
			e.printStackTrace();
		}
		
	}
	
}