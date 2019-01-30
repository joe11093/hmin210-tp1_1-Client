package p1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interfaces.Animal;
import Interfaces.AnimalFile;
import Interfaces.Species;

public class Client {
	
	public Client(){
		
	}
	
	public static void main(String args[]){
		String host = (args.length < 1) ? null : args[0];
		try{
			
			//security manager
			if(System.getSecurityManager() == null){
				System.setProperty("java.security.policy", "./file.policy");
				System.setSecurityManager(new SecurityManager());
			}
			
			Registry registry = LocateRegistry.getRegistry(host);
			
			//acceder aux objets distants
			Animal stub = (Animal) registry.lookup("Animal");
			AnimalFile file = stub.getAnimalFile();
			
			//tests
			System.out.println("Avant");
			System.out.println(stub.getName());
			System.out.println(stub.getSpecies().getName());
			
			//modifier l'espece
			System.out.println("Aprés");
			Species s = stub.getSpecies();
			stub.getSpecies().setName("dog");
			s.setName("dog");
			System.out.println(s.getName());
			
			
			
			
		}catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
