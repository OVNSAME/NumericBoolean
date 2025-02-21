package net.ovonsame;

public class NumericBoolean {
    @SuppressWarnings("unused")
    public static boolean ConvertToBoolean(int value, boolean negativeValue) {
        /*
         This method converts a number to a boolean.
         @negativeValue If it is true then if the number is greater than zero then true will return (-1=false) otherwise if the number is less than zero then false (1=true). If it is a false then if the number is even it will return false (0=false) otherwise if the number is not even it will return true (1=true).
         */
        if(negativeValue)
            return value >= 0;
        else
            return value%2 != 0;
    }
}
