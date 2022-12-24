package Interface;

public class Const {
    public static void main(String[] args) {
        WaterPipe waterPipe= new WaterPipe();
        waterPipe.printState(0);
    }
}
interface Stateable{
    int OPEN = 1;
    int CLOSED = 0;
    void printState(int n);
}
class WaterPipe implements Stateable{
    public void printState(int n){
        if (n==OPEN)
            System.out.println("Water is opened");
        else if (n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }
}