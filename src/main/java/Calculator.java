public class Calculator {

    int i = 4;
    int j = 12;

    public Calculator() {
        System.out.println(this.addition(i, j));
        System.out.println(this.substraction(i, j));
        System.out.println(this.multiply(i, j));
        System.out.println(this.division(i, j));
    }

    public  int addition(int firstNumber, int secondeNumber) {
        return firstNumber + secondeNumber;
    }

    public  int substraction(int firstNumber, int secondeNumber) {
        return firstNumber - secondeNumber;
    }

    public  int multiply(int firstNumber, int secondeNumber) {
        return firstNumber * secondeNumber;
    }

    public int division(int firstNumber, int secondeNumber) {
        return firstNumber / secondeNumber;

    }
}
