package Exercice_1;

public class Car {
	
	private final String brand ;
	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}

	private final long value ;
	
	public Car(String b, long v) {
		
		this.brand = b ;
	
		if(v>=0) {
			
			this.value = v;
		}
		
		else {
			
			System.out.println("La voiture a pour valeur 0");
			this.value = 0;
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " brand : " +brand+ ", valeur : " +value;
	}
	
}