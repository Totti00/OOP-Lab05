package it.unibo.oop.lab05.ex2;

import java.util.*;

/**
 * 
 */
public final class UseSetWithOrder {

	private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	final Set<String> set = new TreeSet<>(new SetComparator());
    	for(int i = 0; i<100; i++) {
    		set.add(Integer.toString((int)(Math.random()*1000)));
    	}
    	
    	for(final String s: set) {
    		System.out.print(s + ",");
    	}
    }
}
