package p1;

import Interfaces.Species;

public class SpeciesClient extends Species{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	int average_size;
	
	public SpeciesClient() {
		super();
	}

	public SpeciesClient(String name, int average_size) {
		this.name = name;
		this.average_size = average_size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAverage_size() {
		return average_size;
	}

	public void setAverage_size(int average_size) {
		this.average_size = average_size;
	}
	
	
	
	
}
