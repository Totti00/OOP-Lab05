package it.unibo.oop.lab05.ex1;

import java.util.Set;
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
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    	TreeSet<String> tr1 = new TreeSet<String>();
    	for(int i = 1; i < 21; i++) {
    		tr1.add(Integer.toString(i));
    	}
    	Iterator<String> it = tr1.iterator();
    	System.out.println(tr1);
    	while(it.hasNext()) {
    		int r = Integer.parseInt(it.next()) ;
    		r = r % 3;
    		if(r == 0) {
    			it.remove();
    		}
    	}
    	for(String value : tr1) {
    		System.out.print(value + ",");
    	}
    	System.out.println();
    	
    	int totNum = 0;
    	int numPari = 0;
 
    	for(String pari : tr1) {
    		int r = Integer.parseInt(pari);
    		totNum = totNum + 1;
    		if((r % 2) == 0) {
    			numPari = numPari + 1;
    		}
    	}
    	if(totNum == numPari) {
    		System.out.println("Sono tutti pari");
    	}
    	else {
    		System.out.println("Non sono tutti pari");
    	}
    }
}
