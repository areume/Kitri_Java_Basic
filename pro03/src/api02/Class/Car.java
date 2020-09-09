package api02.Class;

/**
 * @author : 김아름
 * @date   : 2020. 5. 12.
 * @description : 
 */

public class Car {
	private String model;
	private String owner;
	
	// Constructors
	public Car() { }
	
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	// Getters and Setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
