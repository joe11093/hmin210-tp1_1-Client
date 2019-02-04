package p1;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Interfaces.Animal;
import Interfaces.CabinetVeterinaire;

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
			CabinetVeterinaire stub = (CabinetVeterinaire) registry.lookup("CabinetVeterinaire");			
			
			Animal result = stub.searchAnimal("Courage");
			System.out.println("resultat 1: " + result.printAnimal());
			
			stub.addAnimal("Pero", "Carla", new SpeciesClient("Parrot", 30), "Timneh");
			Animal result2 = stub.searchAnimal("Pero");
			System.out.println("Searching for the newly added animal");
			System.out.println(result2.printAnimal());
			
		}catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
