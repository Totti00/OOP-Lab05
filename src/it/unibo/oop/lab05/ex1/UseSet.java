package it.unibo.oop.lab05.ex1;

import java.util.*;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
    	
    	final Set<String> set = new HashSet<>();
    	
         /* 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
    	
    	for(int i = 0; i < 21; i++) {
    		set.add(Integer.toString(i));
    	}
    	
         /* 3) Prints its content
         */ 

    	System.out.println(set);
    	
    	/* 4) Removes all those strings whose represented number is divisible by
         * three
         */
    	
    	final Iterator<String> it = set.iterator();
    	
    	while(it.hasNext()) {
    		if (Integer.parseInt(it.next()) % 3 == 0) {
    			it.remove();
    		}
    	}

         /* 5) Prints the content of the Set using a for-each costruct
         */ 
        
    	for(final String num: set) {
    		System.out.print(num + " ");
    	}
    	System.out.println();
    	/* 6) Verifies if all the numbers left in the set are even
         */
    	int dispari = 0;
    	for(final String controllo: set) {
    		if(Integer.parseInt(controllo) % 2 != 0) {
    			dispari++;
    		}
    	}
    	System.out.println("Sono tutti pari? " + (dispari == 0 ? true : false));
    }
}
