package homeworks.l23.transport;

public class Transport {
    protected String mark;
    protected int productionYear;

        public Transport(String mark, int productionYear){
            this.mark = mark;
            this.productionYear = productionYear;
        }
        public void printWhoAmI(){

            System.out.println("I'm a Transport");
        }
    }


