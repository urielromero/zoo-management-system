import java.util.Scanner;

public class TestZooManagementSystem {



    public static void zooStatus(){

        System.out.println("\nZoo Status:\n");
        System.out.println(Animal.totalAnimals());
        System.out.println(Animal.totalDirtyCages());
        System.out.println(Mammals.getTotalTranquilizers());
        System.out.println(Animal.totalFoodCost());

    }

    public static void main (String [] args){

        //boolean runProgram = true;
        System.out.println("\nWELCOME TO CASPERS ZOO! \n");


        while(true){

            System.out.println("\nSelect new animal type to enter.\n" +
                    "1. Venomous\n2. Mammal\n3. Reptile\n4. EXIT");

            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

            switch (s) {
                case "1":

                    System.out.println("Venomous Selected\nIs cage clean Y/N?");
                    boolean a=false;
                    String r = scan.next();

                    if (r.equalsIgnoreCase("Y")){
                        a = true;
                    }
                    System.out.println("How many children do they eat?");
                    Double b = scan.nextDouble();
                    System.out.println("Do they have fang issues Y/N?");
                    boolean c=false;
                    r = scan.next();
                    if (r.equalsIgnoreCase("Y")){
                        c = true;
                    }
                    Venomous v = new Venomous(a, b, c);
                    zooStatus();
                    break;

                case "2":
                    System.out.println("Mammal Selected\nIs cage clean Y/N?");
                    boolean d=false;
                    String t = scan.next();
                    if (t.equalsIgnoreCase("Y")){
                        d = true;
                    }
                    System.out.println("How many tons of food do they eat?");
                    Double e = scan.nextDouble();
                    System.out.println("How much do they weight (lb)?");
                    Double f = scan.nextDouble();
                    Mammals m = new Mammals(d, e, f);

                    zooStatus();
                    break;

                case "3":
                    System.out.println("Reptile Selected\nIs cage clean Y/N?");
                    boolean x=false;
                    String p = scan.next();
                    if (p.equalsIgnoreCase("Y")){
                        x = true;
                    }
                    System.out.println("How many pounds of food do they eat?");
                    Double y = scan.nextDouble();
                    Reptiles z = new Reptiles(x, y);

                    zooStatus();
                    break;
                case "4":
                    System.out.println("THANK YOU...NOW EXITING");
                   // runProgram=false;
                  //  s=null;
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nPlease make a Valid Selection 1-4");

            }
        }
    }
}


