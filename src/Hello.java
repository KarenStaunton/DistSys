/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karen
 */
import java.rmi.*;
public interface Hello extends java.rmi.Remote { // This is the interface class. We put the methods that we are going to use here 
	
	public String sayHello() throws RemoteException; // cos there could be network issues we ad remoter exception that will throw if that happnes


}