package homeworks.l25.transport;

public class Transport {
    public String mark;
    public int productionYear;

        public Transport(String mark, int productionYear){
            this.mark = mark;
            this.productionYear = productionYear;
        }
    @Override
    public boolean equals(Object obj){
        if (this == obj)// объект равен сам себе - истина
            return true;
        if (obj == null || getClass() != obj.getClass())//проверка на равенство объекта нулю и в одном ли классе объекты
            return false;
        Transport transport = (Transport) obj;// ??? непонятное выражение
        return productionYear == transport.productionYear && (
                mark == null ? transport.mark == null : mark.equals(transport.mark)
        );
    }
    @Override
    public int hashCode(){
        int result = mark != null ? mark.hashCode() : 0;
        result = 31 * result + productionYear;
        return result;
    }

    public void printWhoAmI(){
            System.out.println("I'm a Transport");
        }
    }


