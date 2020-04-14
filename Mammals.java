public class Mammals extends Animal {

    double tranquilizersWeight;
    static double totalTranquilizers;


    public Mammals(boolean isCageClean, double foodConsumption, double tranquilizersWeight){

         this.isCageClean =isCageClean;
         this.foodConsumption = foodConsumption;
         this.tranquilizersWeight = tranquilizersWeight;

         animalCounter++;

            if(!isCageClean){
               dirtyCageCounter++;
            }

            totalTranquilizers = this.tranquilizers()+totalTranquilizers;
            totalFoodCost =  Math.round(foodConsumption())+totalFoodCost;

        if (this.foodConsumption<14 || this.foodConsumption>=256){
            throw new InvalidFoodException("");
        }
    }

    public static double getTotalTranquilizers(){
        System.out.print("Total Tranquilizers Need: ");
        return totalTranquilizers;
    }

    public double tranquilizers(){

       double tranquilizers = Math.round(tranquilizersWeight * 3);
       return tranquilizers;
    }

}
