public class Venomous extends Animal {


     boolean fangIssue;


    public Venomous(boolean isCageClean, double foodConsumption, boolean fangIssue) {
        this.foodConsumption = foodConsumption;
        this.isCageClean=isCageClean;
        this.fangIssue = fangIssue;
        animalCounter++;

        if(!isCageClean){
            dirtyCageCounter++;
        }
        totalFoodCost =  Math.round(foodConsumption())+totalFoodCost;
    }

    @Override
    double foodConsumption(){
        double cost=0;

        if (fangIssue){
            cost = this.foodConsumption * foodMultiplier * .66;
        }else {
            cost = this.foodConsumption * foodMultiplier;
        }
        return cost;
    }


}
