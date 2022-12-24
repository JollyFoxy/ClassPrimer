package Interface;

public class Calculator {
    public static void main(String[] args) {
        Calculatable calculatable=new Calculation();
        System.out.println(calculatable.sum(45,5));
        System.out.println(calculatable.sum(3,33,333));
    }
}

interface Calculatable{
    private int sumAll(int... values){
        int result=0;
        for (int n:values){
            result+=n;
        }
        return result;
    }

    default int sum(int a, int b){
        return sumAll(a,b);
    }
    default int sum(int a,int b,int c){
        return sumAll(a,b,c);
    }
}

class Calculation implements Calculatable{

}
