public class Main {

    public static void main(String[] args) {

        //Calling printConversion method with an argument of 24.42 to be converted to milesPerHour
       printConversion(25.42);
    }

    //PrintConversion method to Print out  milesPerHour
    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }
    }

    //toMilesPerHour method to calculate milesPerHour
    public static long toMilesPerHour (double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;

        } return Math.round(kilometersPerHour/1.609);

    }



}