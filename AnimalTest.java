import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {


    public static void main (String [] args){


        Venomous t = new Venomous(false,19,true);

        System.out.println(t.foodConsumption());

    }
    @Test
    public void foodConsumptionTest() {
        Venomous t = new Venomous(false,19,true);

        assertEquals(406.29,t.foodConsumption(),.01);

    }

    @Test
    public void isCageCleanTest(){
        Animal b = new Animal(false,5);
        assertEquals(false,b.isCageClean());

    }

    @Test
    public void  totalDirtyCagesTest(){
        Animal c = new Animal(false,5);
        Venomous v = new Venomous(false,6,true);
        Mammals f = new Mammals(false,23,2.5);
        Reptiles r = new Reptiles(false,34);


        assertEquals(4,r.totalDirtyCages());
    }

    @Test
    public void totalAnimalsTest(){
        Animal t = new Animal(false,5);
        Venomous v = new Venomous(false,6,true);
        Mammals f = new Mammals(false,23,2.5);
        assertEquals(3, Animal.totalAnimals());
    }

    @Test
    public void tranquilizersTest(){
        Mammals m = new Mammals(true,5,  2.5);
        assertEquals(8,m.tranquilizers(),01);
    }


}