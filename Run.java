public class Run{
    public static void main(String[] args){
        GarbageMan per = new GarbageMan(99.99, "Per");
        GarbageMan rune = new GarbageMan(100.25, "Rune");
        GarbageMan john = new GarbageMan(50.50, "John");
        Customer helle = new Customer();
        GarbageManUnion GMU = new GarbageManUnion();
        helle.setName("Helle");
        helle.setWealth(1000.25);
        helle.orderGarbageMan(john.getPrice());

        System.out.println("Helle's fortune is: " + helle.getWealth());

        GMU.addGarbageman(per);
        GMU.addGarbageman(rune);
        GMU.addGarbageman(john);

        System.out.println("The union membership count is: " + GMU.unionCount());

        GMU.print();
        System.out.println(GMU.howManyExpensiveGarbageMen());

    }
}