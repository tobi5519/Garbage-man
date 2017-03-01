public class Run{
    public static void main(String[] args){
//        Instanceiating GarbageMan objects
        GarbageMan gm1 = new GarbageMan(99.99, "Per");
        GarbageMan gm2 = new GarbageMan(100.25, "Rune");
        GarbageMan gm3 = new GarbageMan(50.50, "John");

//        Creating the helle object from Customer
        Customer helle = new Customer();
        GarbageManUnion GMU = new GarbageManUnion();
        helle.setName("Helle");
        helle.setWealth(1000.25);
        helle.orderGarbageMan(gm3.getPrice());

        System.out.println("Helle's fortune is: " + helle.getWealth());

        System.out.println("");

//        Adding instances of GarbageMan til the GarbageManUnion
        GMU.addGarbageman(gm1);
        GMU.addGarbageman(gm2);
        GMU.addGarbageman(gm3);

//        Printing the number of GarbageMan instances in the GarbageManUnion
        System.out.println("The union membership count is: " + GMU.unionCount());

        System.out.println("");

//        Printing the values of all the objects of the GarbageManUnion class
        GMU.print();

        System.out.println("");

        System.out.println("There are >> " + GMU.howManyExpensiveGarbageMen() + " << garbagemen who cost more than 100 kr.");

    }
}