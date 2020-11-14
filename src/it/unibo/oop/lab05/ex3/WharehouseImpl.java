package it.unibo.oop.lab05.ex3;

import java.util.*;

public class WharehouseImpl implements Warehouse{

	final Set<Product> set = new HashSet<>();
	
	public void addProduct(Product p) {
		this.set.add(p);
	}

	public Set<String> allNames() {
		final Set<String> setName = new HashSet<>();
		for(final Product p: this.set) {
			setName.add(p.getName());
		}
		return setName;
	}

	public Set<Product> allProducts() {
		return new HashSet<>(this.set);
	}

	public boolean containsProduct(Product p) {
		return this.set.contains(p);
	}

	public double getQuantity(String name) {
		for(final Product p: this.set) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return 0;
	}
}
