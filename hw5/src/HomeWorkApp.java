
public class HomeWorkApp {

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.printThreeWords();
        methods.checkSumSign();
        methods.printColor();
        methods.compareNumbers();
        System.out.println(methods.compareNumbersBoolean(456, 678));
        System.out.println(methods.compareNumbersBoolean(5, 10));
        methods.positiveOrNegative(123);
        methods.positiveOrNegative(-123);
        System.out.println(methods.isNegative(456));
        System.out.println(methods.isNegative(-56));
        methods.printNumberOfTimes("dfsghfb", 5);
        System.out.println(methods.isLeap(1600));
        System.out.println(methods.isLeap(1300));
        System.out.println(methods.isLeap(2004));
    }

}
