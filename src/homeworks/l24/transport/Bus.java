package homeworks.l24.transport;

public class Bus extends Transport {
   protected int passengerNumber;

   public Bus(String mark, int productionYear, int passengerNumber) {
       super(mark, productionYear);
       this.passengerNumber = passengerNumber;
   }

    public String toString(){

       return "Bus | " + mark + " | " + productionYear + " | " + passengerNumber;
    }
    public void printWhoAmI(){
        System.out.println("I'm a Transport. I'm ecofriendly.");
    }
}
