package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WharehouseImpl implements Warehouse{

	private final Set<Product> set1 = new HashSet<Product>();

	public void addProduct(Product p) {
		this.set1.add(p);
	}

	public Set<String> allNames() {
		final var s = new HashSet<String>();
		for (final var p: this.set1) {
			s.add(p.getName());
		}
		return s;
	}

	public Set<Product> allProducts() {
		
		return new HashSet<>(this.set1);
	}

	public boolean containsProduct(Product p) {
		return set1.contains(p);
	}

	public double getQuantity(String name) {
		for (final var p: this.set1) {
			if( p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return 0;
	}
}
