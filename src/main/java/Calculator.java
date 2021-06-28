public class Calculator {
    //⦁	Faire une addition de deux entiers et retourner un résultat entier;
    int i = 5;
    int j = 12;

    public Calculator() {
        System.out.println(this.addition(i, j));
        System.out.println(this.soustraction(i, j));
        System.out.println(this.multiply(i, j));
        System.out.println(this.division(i, j));
    }

    public int addition(int firstNumber, int secondeNumber) {
        return firstNumber + secondeNumber;
    }

    public int soustraction(int firstNumber, int secondeNumber) {
        return firstNumber - secondeNumber;
    }

    public int multiply(int firstNumber, int secondeNumber) {
        return firstNumber * secondeNumber;
    }

    public int division(int firstNumber, int secondeNumber) {
        return firstNumber / secondeNumber;

    }
}
