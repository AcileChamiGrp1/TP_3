package Exercice_3;

public class Vehicule {

	private String brand;
	private long value;
	Discount d; 
	private boolean state;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	public boolean isOnSold() {
		this.value=d.getValue();
		state=true;
		return state;
	
}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c =(Car) obj;
			if((this.brand==c.getBrand())&(this.value==c.getValue())) {
				return true;
			}
		}
		return false;
	}
	
}
