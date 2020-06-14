package learnJava.masterClass;

import com.sun.security.jgss.GSSUtil;

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

		// Primitive byte ,short, long and width
		byte myByteMinValue =Byte.MIN_VALUE;
		byte myByteMaxValue =Byte.MAX_VALUE;
		System.out.println("My min byte value = " + myByteMinValue);
		System.out.println("My max byte value = " + myByteMaxValue);

		short myShortMinValue =Short.MIN_VALUE;
		short myShortMaxValue =Short.MAX_VALUE;
		System.out.println("My min Short value = " + myShortMinValue);
		System.out.println("My max Short value = " + myShortMaxValue);

		long myLongMinValue =Long.MIN_VALUE;
		long myLongMaxValue =Long.MAX_VALUE;
		System.out.println("My min Long value = " + myLongMinValue);
		System.out.println("My max Long value = " + myLongMaxValue);

		long myLongValue =2_147_483_647_201l;
		System.out.println("long value = ");
		System.out.println(myLongValue+1);

		// in divide with data types unless (int) away covert to int
		// so we need chang data type to int.
		int total =(myMaxIntValue/2);
		byte Divide =(byte) (myByteMaxValue/2);
		System.out.println(myByteMaxValue);
		System.out.println(Divide);

		long divideLong =(myLongMinValue/2);
		System.out.println(divideLong + myMaxIntValue);
    }
}
