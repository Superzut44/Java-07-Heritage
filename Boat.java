public class Boat extends Vehicle {
        
    public Boat(String brand) {  
	    super(brand);  
	}

	public Boat(String brand, int kilometers) {  
	    super(brand, kilometers);  
	}
  
    @Override
    public String doStuff() {
        return "I'm " + this.getBrand() + " and I go glup glup !";
    }
}
