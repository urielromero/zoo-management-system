
//Invalid food exception. Mammals must eat at least 14 tons of food or more AND less than 256.

public class InvalidFoodException extends RuntimeException{

    //Added new constructor to display error message
    public InvalidFoodException(String errorMessage) {
       System.err.println("Mammals must eat >= 14 and < 256 tons of food.");
    }

}
