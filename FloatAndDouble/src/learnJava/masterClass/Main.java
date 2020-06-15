package learnJava.masterClass;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue =Float.MIN_VALUE;
	    float myMaxFloatValue =Float.MAX_VALUE;
        System.out.println("Min Float Value = " + myMinFloatValue);
        System.out.println("Max Float Value = " + myMaxFloatValue);

        double myMinDoubleValue =Double.MIN_VALUE;
        double myMaxDoubleValue =Double.MAX_VALUE;
        System.out.println("Min double Value = " + myMinDoubleValue);
        System.out.println("Max double Value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5.0f / 3f;
        double myDoubleValue = 5.0d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        // convert found to kilogram.
        double found = 200d ;
        double kg = 0.45359237d * found ;
        System.out.println(found + " found = " + kg + " kg");
    }
}
