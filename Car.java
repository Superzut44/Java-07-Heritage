public class Car extends Vehicle {
    
    public Car(String brand) {  
	    super(brand);  
	}

	public Car(String brand, int kilometers) {  
	    super(brand, kilometers);  
	}
  
    @Override
    public String doStuff() {
        return "I'm " + this.getBrand() + " and I go zoom zoom zoom !";
    }
}
