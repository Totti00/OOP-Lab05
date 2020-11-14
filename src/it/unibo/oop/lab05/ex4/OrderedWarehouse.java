package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WharehouseImpl;

public class OrderedWarehouse extends WharehouseImpl{
	
	public Set<Product> allProducts() {
		final Set<Product> setOrdinato = new TreeSet<>(super.allProducts());
		
		return setOrdinato;
	}
}
