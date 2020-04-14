public class Animal {

    //value may change based on weather
    final static double foodMultiplier = (float) 32.4;

    double foodConsumption;
    static double totalFoodCost;
    boolean isCageClean;

    static int totalCages =50;

    //incremented by constructor
    static int animalCounter;
    static int dirtyCageCounter=0;

    //Default constructor
    public Animal(){}

    //Constructor
    public Animal(boolean isCageClean, double foodConsumption){
        this.foodConsumption = foodConsumption;
        this.isCageClean=isCageClean;
        animalCounter++;

        if(!isCageClean){
            dirtyCageCounter++;
        }
        totalFoodCost =  Math.round(foodConsumption())+totalFoodCost;
    }

    //total food cost per single animal
     double foodConsumption(){
        double cost = this.foodConsumption * foodMultiplier;
        return cost;
    }

    //total food cost for all animals/global variable
    static double totalFoodCost(){
        System.out.print("Total Food Cost: $");
        return totalFoodCost;
    }

    //all child classes call this method
    boolean  isCageClean(){
        this.isCageClean = isCageClean;
        boolean a = false;
        if(isCageClean){a = true;}
        return isCageClean;
    }

    //total dirty cages at zoo
    static int totalDirtyCages(){

        System.out.print("Total Clean Cages: "+ (totalCages-dirtyCageCounter)+
                "\nTotal Dirty Cages: ");
        return dirtyCageCounter;
    }

    //all animals at zoo
    public static int totalAnimals(){

        System.out.print("Total Animals at Zoo: ");
        return animalCounter;
    }



}
