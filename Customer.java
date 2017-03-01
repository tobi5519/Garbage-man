public class Customer{
    private String name;
    private double wealth;

    public void setName(String newName){
        this.name = newName;
    }
    public void setWealth(double newWealth){
        this.wealth = newWealth;
    }
    public String getName(){
        return this.name;
    }
    public double getWealth(){
        return this.wealth;
    }

    public void orderGarbageMan(double orderAmount){
        if (orderAmount < this.wealth){
            this.wealth -= orderAmount;
        } else {
            System.out.println("No soup for you!");
        }        
    }
}