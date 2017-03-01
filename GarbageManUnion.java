import java.util.ArrayList;
public class GarbageManUnion{
//    Creating an ArrayList of objects from the GarbageMan class
    private ArrayList<GarbageMan> GMAL = new ArrayList();
    private int xCount;
     public void addGarbageman(GarbageMan newGarbageMan){
         GMAL.add(newGarbageMan);
     }

     public int unionCount(){
         return GMAL.size();
     }

    public void print(){
        for (int i = GMAL.size(); i > 0; i--){
            System.out.println(GMAL.get(i - 1).getName() + " has a price of kr. " + GMAL.get(i - 1).getPrice());
        }
    }
//    Iterating over the size value(length) of the ArrayList and printing all objects with a 'price' over 100
    public int howManyExpensiveGarbageMen(){
        for (int i = GMAL.size(); i > 0; i--){
            if (GMAL.get(i - 1).getPrice() > 100){
                System.out.println(GMAL.get(i - 1).getName() + " is an ass, he costs " + GMAL.get(i - 1).getPrice());
                xCount++;
            }
        }
    return xCount;
    }
}