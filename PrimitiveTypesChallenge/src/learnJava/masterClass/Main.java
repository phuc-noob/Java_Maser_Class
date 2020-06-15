package learnJava.masterClass;

public class Main {

    public static void main(String[] args) {
	    byte validByte =100;
	    short validShort =10000;
	    int validInt =123_456_100;
	    long validLong = 50000L + 10L*(validByte+validInt+validShort);
        System.out.println(validLong);
    }
}
