package InnerClass;

public class Program {
    public static void main(String[] a){
        Person pasha = new Person("Pasha");
        pasha.setAccount("1234567890");

        Math.Factorial factorial= Math.getFactorial(6);
        System.out.println("Factorial = "+ factorial.getResult());
    }
}
class Person {
    private String name;
    Person(String name){
        this.name=name;
    }
    public void setAccount(String password){
        class Account{
            void display(){
                System.out.println("Account login: "+name+"\tPassword: "+password);
            }
        }
        Account account =new Account();
        account.display();
    }
}
class Math{
    public static class Factorial{
        private int result;
        private int key;
        public Factorial(int number, int x){
            result=number;
            key=x;
        }
        public int getResult(){
            return result;
        }

        public int getKey() {
            return key;
        }

    }
    public static Factorial getFactorial(int x){

        int result = 1;
        for (int i=1;i<=x;i++){
            result *=i;
        }
        return new Factorial(result, x);
    }
}