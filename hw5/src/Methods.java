
public class Methods {

    public void printThreeWords() {
        System.out.println("Banana\nOrange\nApple");
    }

    public void checkSumSign() {
        int a, b;
        a = 10;
        b = -123;
        if(a+b >= 0) System.out.println("Sum is positive");
        else System.out.println("Sum is negative");
    }

    public void printColor() {
        int value = 45678;
        if(value <= 0) System.out.println("Red");
        else if(value > 0 && value <= 100) System.out.println("Yellow");
        else System.out.println("Green");
    }

    public void compareNumbers() {
        int a, b;
        a = 45678;
        b = 9876;
        if(a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    public boolean compareNumbersBoolean(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public void positiveOrNegative(int a) {
        if(a >= 0) System.out.println("Number is positive");
        else System.out.println("Number is negative");
    }

    public boolean isNegative(int a) {
        return a < 0;
    }

    public void printNumberOfTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public boolean isLeap(int year) {
        if(year % 400 == 0) return true;
        else return year % 4 == 0 && year % 100 != 0;
    }

}
