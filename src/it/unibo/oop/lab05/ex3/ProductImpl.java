package it.unibo.oop.lab05.ex3;


public class ProductImpl implements Product{

	private final String name;
	private final double quantita;
	
	public ProductImpl(final String name, final double q) {
		//super();
		this.name = name;
		this.quantita = q;
	}

	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantita;
	}

	public String toString() {
		return "ProductImpl [name=" + name + ", quantita=" + quantita + "]";
	}
	

}
