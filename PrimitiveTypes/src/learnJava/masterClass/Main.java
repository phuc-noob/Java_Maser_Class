package learnJava.masterClass;

public class Main {

    public static void main(String[] args) {
	    int myValue =10000;

	    int myMinIntValue =Integer.MIN_VALUE;
	    int myMaxIntValue =Integer.MAX_VALUE;

	    System.out.println("My min integer value = " + myMinIntValue);
	    System.out.println("My max integer value = " + myMaxIntValue);

	    // underflow and overflow in java
		System.out.println("Busted max value = " + (myMaxIntValue +1));
		System.out.println("Busted min value = " + (myMinIntValue -1));

		int myMaxIntTest =2_147_483_647;
		System.out.println("Test my Max Integer = " + myMaxIntTest);
	}
}
